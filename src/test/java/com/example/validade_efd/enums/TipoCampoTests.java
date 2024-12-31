package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TipoCampoTests {
    @Test 
    void testFromCodigo_ValidCodigo() { 
        TipoCampo tipoCampo = TipoCampo.fromCodigo("N");
        assertEquals(TipoCampo.N, tipoCampo); 
    }

    @Test 
    void testFromCodigo_InvalidCodigo() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            TipoCampo.fromCodigo("XX"); 
        }); 
        String expectedMessage = "Código de tipo de campo inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetCodigo() { 
        TipoCampo tipoCampo = TipoCampo.N;
        assertEquals("N", tipoCampo.getCodigo()); 
    } 
    
    @Test 
    void testGetDescricao() {  
        TipoCampo tipoCampo = TipoCampo.N;
        assertEquals("Numérico", tipoCampo.getDescricao()); 
    }
}
