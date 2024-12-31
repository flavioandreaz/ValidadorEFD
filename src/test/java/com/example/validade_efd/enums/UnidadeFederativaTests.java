package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UnidadeFederativaTests {
    @Test 
    void testFromCodigo_ValidCode() { 
        UnidadeFederativa uf = UnidadeFederativa.fromCodigo("MG"); 
        assertEquals(UnidadeFederativa.MG, uf); 
    }

    @Test 
    void testFromCodigo_InvalidCode() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            UnidadeFederativa.fromCodigo("XX"); 
        }); 
        String expectedMessage = "Código de UF inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetCodigo() { 
        UnidadeFederativa uf = UnidadeFederativa.MG; 
        assertEquals("MG", uf.getCodigo()); 
    } 
    
    @Test 
    void testGetNome() { 
        UnidadeFederativa uf = UnidadeFederativa.MG; 
        assertEquals("Minas Gerais", uf.getNome()); 
    }
}
