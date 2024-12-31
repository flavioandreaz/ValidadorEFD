package com.example.validade_efd.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidadorRegistro0001 implements Validador {

    public List<String> validarLinha(String linha, int numeroDaLinha) {
        List<String> erros = new ArrayList<>();

        if (linha == null || linha.isEmpty()) {
            erros.add("Linha do Registro 0001 é nula ou vazia.");
            return erros;
        }

        String[] campos = linha.split("\\|");
        if (campos.length != 2) {
            erros.add("Número incorreto de campos no Registro 0001. Esperado 2, encontrado: " + campos.length + ".");
            return erros;
        }

        if (!"0001".equals(campos[0]) && !"reg".equals(campos[0])) {
            erros.add("Campo REG inválido. Esperado '0001', encontrado: '" + campos[0] + "'.");
        }

        try {
            if (!"indMov".equals(campos[1])) {
                int indMov = Integer.parseInt(campos[1]);
                if (indMov != 0 && indMov != 1) {
                    erros.add("Campo IND_MOV inválido. Esperado 0 ou 1, encontrado: " + indMov + ".");
                }
            }

        } catch (NumberFormatException e) {
            erros.add("Campo IND_MOV inválido. Não é um número inteiro: '" + campos[1] + "'.");
        }

        return erros;
    }
}