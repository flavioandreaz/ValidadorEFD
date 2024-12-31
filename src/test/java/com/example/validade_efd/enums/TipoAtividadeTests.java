package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TipoAtividadeTests {
    @Test 
    void testFromCodigo_ValidCodigo() { 
        TipoAtividade tipoAtividade = TipoAtividade.fromCodigo("0");
        assertEquals(TipoAtividade.INDUSTRIAL, tipoAtividade); 
    }

    @Test 
    void testFromCodigo_InvalidCodigo() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            TipoAtividade.fromCodigo("XX"); 
        }); 
        String expectedMessage = "Código de tipo de atividade inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetCodigo() { 
        TipoAtividade tipoAtividade = TipoAtividade.INDUSTRIAL;
        assertEquals("0", tipoAtividade.getCodigo()); 
    } 
    
    @Test 
    void testGetDescricao() {  
        TipoAtividade tipoAtividade = TipoAtividade.INDUSTRIAL;
        assertEquals("Industrial ou equiparado a industrial", tipoAtividade.getDescricao());
    }
}
