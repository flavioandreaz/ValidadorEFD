package com.example.validade_efd.enums;

public enum IndicadorNaturezaFrete {
    NEGOCIAVEL("0", "Negociável"),
    NAO_NEGOCIAVEL("1", "Não negociável");

    private final String codigo;
    private final String descricao;

    IndicadorNaturezaFrete(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorNaturezaFrete fromCodigo(String codigo) {
        for (IndicadorNaturezaFrete naturezaFrete : IndicadorNaturezaFrete.values()) {
            if (naturezaFrete.getCodigo().equals(codigo)) {
                return naturezaFrete;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}