package com.example.validade_efd.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidadorRegistro0000 implements Validador {

    public List<String> validarLinha(String linha, int numeroDaLinha) {
        List<String> erros = new ArrayList<>();

        if (linha == null || linha.isEmpty()) {
            erros.add("Linha do Registro 0000 é nula ou vazia.");
            return erros;
        }

        String[] campos = linha.split("\\|");
        if (campos.length != 15) {
            erros.add("Número incorreto de campos no Registro 0001. Esperado 15, encontrado: " + campos.length + ".");
            return erros;
        }

        if (!"0000".equals(campos[0]) && !"reg".equals(campos[0])) {
            erros.add("Campo REG inválido. Esperado '0000', encontrado: '" + campos[0] + "'.");
        }

        try {
            if (!"indDad".equals(campos[1])) {
                int indDad = Integer.parseInt(campos[1]);
                if (indDad != 0 && indDad != 1) {
                    erros.add("Campo IND_DAD inválido. Esperado 0 ou 1, encontrado: " + indDad + ".");
                }
            }

        } catch (NumberFormatException e) {
            erros.add("Campo IND_DAD inválido. Não é um número inteiro: '" + campos[1] + "'.");
        }

        return erros;
    }
}