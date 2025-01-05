package com.example.validade_efd.enums;

public enum IndicadorTipoPagamento {
    A_VISTA("0", "À vista"),
    A_PRAZO("1", "A prazo"),
    OUTROS("2", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorTipoPagamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoPagamento fromCodigo(String codigo) {
        for (IndicadorTipoPagamento tipo : IndicadorTipoPagamento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}