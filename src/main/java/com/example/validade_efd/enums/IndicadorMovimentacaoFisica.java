package com.example.validade_efd.enums;

public enum IndicadorMovimentacaoFisica {
    SIM("0", "SIM"),
    NAO("1", "NÃO");

    private final String codigo;
    private final String descricao;

    IndicadorMovimentacaoFisica(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorMovimentacaoFisica fromCodigo(String codigo) {
        for (IndicadorMovimentacaoFisica tipo : IndicadorMovimentacaoFisica.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}