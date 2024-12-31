package com.example.validade_efd.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.example.validade_efd.domain.Municipio;

class MunicipioDTOTests {
    @Test 
    void testFrom() { // Criação de um objeto Municipio de exemplo 
        Municipio municipio = new Municipio(); 
        municipio.setCodigoIbge("1234567"); 
        municipio.setNome("Belo Horizonte"); 
        municipio.setDataInicio(LocalDate.of(2023, 1, 1)); 
        municipio.setDataFim(LocalDate.of(2023, 12, 31)); 
        // Chamada do método from para converter Municipio em MunicipioDTO 
        MunicipioDTO dto = MunicipioDTO.from(municipio); 
        // Verificações 
        assertEquals(municipio.getCodigoIbge(), dto.getCodigoIbge()); 
        assertEquals(municipio.getNome(), dto.getNome()); 
        assertEquals(municipio.getDataInicio(), dto.getDataInicio()); 
        assertEquals(municipio.getDataFim(), dto.getDataFim()); }
}
