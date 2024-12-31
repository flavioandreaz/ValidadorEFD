package com.example.validade_efd.enums;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum CodigoFinalidade {
    NORMAL("0", "Remessa do arquivo original"),
    SUBSTITUTO("1", "- Remessa do arquivo substituto");

    private final String codigo;
    private final String descricao;

    CodigoFinalidade(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public static CodigoFinalidade fromCodigo(String codigo) {
        return Arrays.stream(values())
                .filter(codigoFinalidade -> codigoFinalidade.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código de Finalidade inválido: " + codigo));
    }
}