package com.example.validade_efd.enums;

public enum IndicadorTipoConta {
    SINTETICA("S", "Sintética (grupo de contas)"),
    ANALITICA("A", "Analítica (conta)");

    private final String codigo;
    private final String descricao;

    IndicadorTipoConta(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoConta fromCodigo(String codigo) {
        for (IndicadorTipoConta tipo : IndicadorTipoConta.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}