package com.example.validade_efd.enums;

public enum IndicadorNavegacao {
    INTERIOR("0", "Interior"),
    CABOTAGEM("1", "Cabotagem");

    private final String codigo;
    private final String descricao;

    IndicadorNavegacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorNavegacao fromCodigo(String codigo) {
        for (IndicadorNavegacao navegacao : IndicadorNavegacao.values()) {
            if (navegacao.getCodigo().equals(codigo)) {
                return navegacao;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}