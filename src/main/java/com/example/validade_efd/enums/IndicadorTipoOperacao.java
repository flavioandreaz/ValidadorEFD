package com.example.validade_efd.enums;

public enum IndicadorTipoOperacao {
    ENTRADA("0", "Entrada"),
    SAIDA("1", "Saída");

    private final String codigo;
    private final String descricao;

    IndicadorTipoOperacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoOperacao fromCodigo(String codigo) {
        for (IndicadorTipoOperacao tipo : IndicadorTipoOperacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}