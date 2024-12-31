package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CodigoFinalidadeTests {
    @Test 
    void testFromCodigo_ValidCode() { 
        CodigoFinalidade codigoFinalidade = CodigoFinalidade.fromCodigo("0"); 
        assertEquals(CodigoFinalidade.NORMAL, codigoFinalidade); 
    }

    @Test 
    void testFromCodigo_InvalidCode() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            CodigoFinalidade.fromCodigo("XX"); 
        }); 
        String expectedMessage = "Código de Finalidade inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetCodigo() { 
        CodigoFinalidade codigoFinalidade = CodigoFinalidade.NORMAL; 
        assertEquals("0", codigoFinalidade.getCodigo()); 
    } 
    
    @Test 
    void testGetDescricao() { 
        CodigoFinalidade codigoFinalidade = CodigoFinalidade.NORMAL;
        assertEquals("Remessa do arquivo original", codigoFinalidade.getDescricao()); 
    }

    @Test 
    void testToString() { 
        CodigoFinalidade codigoFinalidade = CodigoFinalidade.NORMAL;
        assertEquals("Remessa do arquivo original", codigoFinalidade.toString()); 
    }
}
