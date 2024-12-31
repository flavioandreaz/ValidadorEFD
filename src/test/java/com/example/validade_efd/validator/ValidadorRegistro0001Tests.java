package com.example.validade_efd.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ValidadorRegistro0001Tests {
    @Test 
    void testLinhaNula() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha(null, 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Linha do Registro 0001 é nula ou vazia.", erros.get(0)); 
    } 
    @Test  
    void testLinhaVazia() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Linha do Registro 0001 é nula ou vazia.", erros.get(0)); 
    } 
    @Test 
    void testNumeroIncorretoDeCampos() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("0001|1|0|", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Número incorreto de campos no Registro 0001. Esperado 2, encontrado: 3.", erros.get(0)); 
    } 
    
    @Test 
    void testCampoRegInvalido() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("XXXX|0|", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo REG inválido. Esperado '0001', encontrado: 'XXXX'.", erros.get(0)); 
    } 
    
    @Test  
    void testCampoIndMovInvalido() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("0001|2|", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo IND_MOV inválido. Esperado 0 ou 1, encontrado: 2.", erros.get(0)); 
    }
    
    @Test  
    void testCampoIndMovNaoNumerico() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("0001|X|", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo IND_MOV inválido. Não é um número inteiro: 'X'.", erros.get(0)); 
    } 
    
    @Test 
    void testLinhaValida() { 
        ValidadorRegistro0001 validador = new ValidadorRegistro0001(); 
        List<String> erros = validador.validarLinha("0001|0|", 1); 
        assertTrue(erros.isEmpty()); 
    }
}
