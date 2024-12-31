package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.validade_efd.validator.ValidadorRegistro0000;


class TipoRegistroTests {
    @Test 
    void testFromIdentificador_ValidIdentificador() { 
        TipoRegistro tipoRegistro = TipoRegistro.fromIdentificador("0000"); 
        assertEquals(TipoRegistro.REGISTRO_0000, tipoRegistro); 
    }

    @Test 
    void testFromIdentificador_InvalidIdentificador() { 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { 
            TipoRegistro.fromIdentificador("XX"); 
        }); 
        String expectedMessage = "Identificador de Registro inválido: XX"; 
        String actualMessage = exception.getMessage(); 
        assertTrue(actualMessage.contains(expectedMessage)); 
    } 
    
    @Test 
    void testGetIdentificador() { 
        TipoRegistro tipoRegistro = TipoRegistro.REGISTRO_0000;
        assertEquals("0000", tipoRegistro.getIdentificador()); 
    } 
    
    @Test 
    void testGetValidador() {  
        TipoRegistro tipoRegistro = TipoRegistro.REGISTRO_0000;
        ValidadorRegistro0000 validadorRegistro0000 = new ValidadorRegistro0000();
        assertEquals(validadorRegistro0000.getClass().getName(), tipoRegistro.getValidador().getClass().getName()); 
    }
}
