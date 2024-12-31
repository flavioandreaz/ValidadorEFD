package com.example.validade_efd.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class PerfilArquivoTests {
    
    @Test 
    void testToString() { 
        PerfilArquivo perfilArquivo = PerfilArquivo.A;
        assertEquals("Perfil A", perfilArquivo.toString()); 
    } 
    
    @Test 
    void testGetDescricao() {  
        PerfilArquivo perfilArquivo = PerfilArquivo.A;
        assertEquals("Perfil A", perfilArquivo.getDescricao());
    }
}
