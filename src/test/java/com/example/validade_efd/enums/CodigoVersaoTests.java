package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CodigoVersaoTests {
    @Test 
    void testFromCodigo_ValidCode() { 
        CodigoVersao codigoVersao = CodigoVersao.fromCodigo("001"); 
        assertEquals(CodigoVersao.V001, codigoVersao); 
    }

    @Test 
    void testFromCodigo_InvalidCode() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            CodigoVersao.fromCodigo("XX"); 
        }); 
        String expectedMessage = "Código de versão inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetCodigo() { 
        CodigoVersao codigoVersao = CodigoVersao.fromCodigo("001");
        assertEquals("001", codigoVersao.getCodigo()); 
    } 
    
    @Test  
    void testGetNome() { 
        CodigoVersao codigoVersao = CodigoVersao.fromCodigo("001");
        assertEquals("100", codigoVersao.getVersao()); 
    }

    @Test
    void testGetObrigatoriedade(){
        CodigoVersao codigoVersao = CodigoVersao.V001;
        assertEquals(LocalDate.of(2008, 1, 1), codigoVersao.getObrigatoriedade());
    }
}
