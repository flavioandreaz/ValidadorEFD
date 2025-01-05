package com.example.validade_efd.enums;

public enum IndicadorReceita {
    RECEITA_PROPRIA("0", "Receita própria"),
    RECEITA_TERCEIROS("1", "Receita de terceiros");

    private final String codigo;
    private final String descricao;

    IndicadorReceita(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorReceita fromCodigo(String codigo) {
        for (IndicadorReceita tipo : IndicadorReceita.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}