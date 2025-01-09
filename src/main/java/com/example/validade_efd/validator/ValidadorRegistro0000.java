package com.example.validade_efd.validator;

import java.util.ArrayList;
import java.util.List;


import com.example.validade_efd.domain.bloco0.Registro0000;


public class ValidadorRegistro0000 extends ValidadorRegistroBase implements Validador  {

    public List<String> validarLinha(String linha, int numeroDaLinha) {
        List<String> erros = new ArrayList<>();
        adicionarErro(validarLinhaNulaOuVazia(linha, numeroDaLinha), erros);     
        adicionarErro(validarTamanhoLinha(linha, numeroDaLinha, Registro0000.class), erros);
        adicionarErro(validarTipoCamposNaLinha(linha, numeroDaLinha, Registro0000.class), erros);
        adicionarErro(validarTamanhoLimiteCaracteresCamposNaLinha(linha, numeroDaLinha, Registro0000.class), erros);
        adicionarErro(validarObrigatorioCamposNaLinha(linha, numeroDaLinha, Registro0000.class), erros);
        adicionarErro(validarObrigatorioEntradaCamposNaLinha(linha, numeroDaLinha, Registro0000.class), erros);
        adicionarErro(validarObrigatorioSaidaCamposNaLinha(linha, numeroDaLinha, Registro0000.class), erros);
        
        
        //falta validar: decimais, 
        // validar valores de enum        
        return erros;
    }
}