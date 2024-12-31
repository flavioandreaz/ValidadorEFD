package com.example.validade_efd.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class MunicipioTests {

    @Test 
    void testMunicipioFromValidCsvWith4Fields() { 
        String linhaCsv = "1234567|Belo Horizonte|01012023|31122023"; 
        Municipio municipio = new Municipio(linhaCsv); 
        assertEquals("1234567", municipio.getCodigoIbge()); 
        assertEquals("Belo Horizonte", municipio.getNome()); 
        assertEquals(LocalDate.parse("01012023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataInicio()); 
        assertEquals(LocalDate.parse("31122023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataFim()); 
    }

    @Test
    void testMunicipioFromCsvWithEmptyDataFimAnd4Fields() { 
        String linhaCsv = "1234567|Belo Horizonte|01012023|";  // 4 campos com o último campo vazio
        Municipio municipio = new Municipio(linhaCsv);

        assertEquals("1234567", municipio.getCodigoIbge());
        assertEquals("Belo Horizonte", municipio.getNome());
        assertEquals(LocalDate.parse("01012023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataInicio());
        assertNull(municipio.getDataFim());  // Garantir que dataFim é nula
    }

    @Test
    void testMunicipioFromCsvWithSpacesInDataFim() {
        String linhaCsv = "1234567|Belo Horizonte|01012023|   ";  // 4 campos com espaços em branco no último campo
        Municipio municipio = new Municipio(linhaCsv);

        assertEquals("1234567", municipio.getCodigoIbge());
        assertEquals("Belo Horizonte", municipio.getNome());
        assertEquals(LocalDate.parse("01012023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataInicio());
        assertNull(municipio.getDataFim());  // Garantir que dataFim é nula
    }

    @Test
    void testMunicipioFromCsvWithTrimmedSpacesInDataFim() {
        String linhaCsv = "1234567|Belo Horizonte|01012023| 31122023 ";  // 4 campos com espaços ao redor do último campo
        Municipio municipio = new Municipio(linhaCsv);

        assertEquals("1234567", municipio.getCodigoIbge());
        assertEquals("Belo Horizonte", municipio.getNome());
        assertEquals(LocalDate.parse("01012023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataInicio());
        assertEquals(LocalDate.parse("31122023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataFim());  // Garantir que dataFim é convertido corretamente
    }

    @Test 
    void testMunicipioFromValidCsvWith3Fields() { 
        String linhaCsv = "1234567|Belo Horizonte|01012023"; 
        Municipio municipio = new Municipio(linhaCsv); 
        assertEquals("1234567", municipio.getCodigoIbge()); 
        assertEquals("Belo Horizonte", municipio.getNome()); 
        assertEquals(LocalDate.parse("01012023", DateTimeFormatter.ofPattern("ddMMyyyy")), municipio.getDataInicio()); 
        assertNull(municipio.getDataFim()); 
    } 
    
    @Test 
    void testMunicipioFromCsvWithInvalidDate() { 
        String linhaCsv = "1234567|Belo Horizonte|invalid_date|"; 
        Municipio municipio = new Municipio(linhaCsv); 
        assertEquals("1234567", municipio.getCodigoIbge()); 
        assertEquals("Belo Horizonte", municipio.getNome()); 
        assertNull(municipio.getDataInicio()); 
        assertNull(municipio.getDataFim()); 
    } 

    @Test
    void testMunicipioFromInvalidCsvLength() { 
        String linhaCsv = "invalid_csv"; 
        Municipio municipio = new Municipio(linhaCsv); 
        assertNull(municipio.getCodigoIbge()); 
        assertNull(municipio.getNome()); 
        assertNull(municipio.getDataInicio()); 
        assertNull(municipio.getDataFim()); 
    }

    @Test
    void testMunicipioFromCsvWithOnlyCodigoIbgeAndNome() {
        String linhaCsv = "1234567|Belo Horizonte|";  // 2 campos e campo 3 vazio
        Municipio municipio = new Municipio(linhaCsv);

        assertNull(municipio.getCodigoIbge());
        assertNull(municipio.getNome());
        assertNull(municipio.getDataInicio());
        assertNull(municipio.getDataFim());  // Garantir que dataInicio e dataFim são nulas
    }

    @Test
    void testConstructorWithMissingDataInicio() throws Exception {
        String csvLineWithoutDataInicio = "0123456|Cidade Teste||01012025";
        Municipio municipio = new Municipio(csvLineWithoutDataInicio);
        assertEquals(null, municipio.getDataInicio());
    }

    @Test
    void testMunicipioFromCsvWithMoreThan4Fields() {
        String linhaCsv = "1234567|Belo Horizonte|01012023|31122023|extra_field"; // More than 4 fields
        Municipio municipio = new Municipio(linhaCsv);

        assertNull(municipio.getCodigoIbge());
        assertNull( municipio.getNome());
        assertNull(municipio.getDataInicio());
        assertNull(municipio.getDataFim());
    }

    @Test
    void testConstructorWithEmptyDataFim() throws Exception {
        String csvLineWithoutDataInicio = "0123456|Cidade Teste|01012025||";
        Municipio municipio = new Municipio(csvLineWithoutDataInicio);
        assertEquals(null, municipio.getDataFim());
    }
    @Test
    void testConstructorWithBlankDataFim() throws Exception {
        String csvLineWithoutDataInicio = "0123456|Cidade Teste|01012025| |";
        Municipio municipio = new Municipio(csvLineWithoutDataInicio);
        assertEquals(null, municipio.getDataFim());
    }
}

