package com.example.validade_efd.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class ValidadorRegistro0000Tests {
    @Test 
    void testLinhaNula() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha(null, 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Linha do Registro 0000 é nula ou vazia.", erros.get(0)); 
    } 
    @Test  
    void testLinhaVazia() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Linha do Registro 0000 é nula ou vazia.", erros.get(0)); 
    } 
    @Test 
    void testNumeroIncorretoDeCampos() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("0000|0|Nome|CPF|RG|", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Número incorreto de campos no Registro 0001. Esperado 15, encontrado: 5.", erros.get(0)); 
    } 
    
    @Test 
    void testCampoRegInvalido() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("XXXX|0|Nome|CPF|RG|Endereco|Complemento|Bairro|CEP|Cidade|Estado|Pais|Telefone|Email|CNPJ", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo REG inválido. Esperado '0000', encontrado: 'XXXX'.", erros.get(0)); 
    } 
    
    @Test  
    void testCampoIndDadInvalido() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("0000|2|Nome|CPF|RG|Endereco|Complemento|Bairro|CEP|Cidade|Estado|Pais|Telefone|Email|CNPJ", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo IND_DAD inválido. Esperado 0 ou 1, encontrado: 2.", erros.get(0)); 
    }
    
    @Test  
    void testCampoIndDadNaoNumerico() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("0000|X|Nome|CPF|RG|Endereco|Complemento|Bairro|CEP|Cidade|Estado|Pais|Telefone|Email|CNPJ", 1); 
        assertEquals(1, erros.size()); 
        assertEquals("Campo IND_DAD inválido. Não é um número inteiro: 'X'.", erros.get(0)); 
    } 
    
    @Test 
    void testLinhaValida() { 
        ValidadorRegistro0000 validador = new ValidadorRegistro0000(); 
        List<String> erros = validador.validarLinha("0000|1|Nome|CPF|RG|Endereco|Complemento|Bairro|CEP|Cidade|Estado|Pais|Telefone|Email|CNPJ", 1); 
        assertTrue(erros.isEmpty()); 
    }
}
