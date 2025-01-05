package com.example.validade_efd.enums;

public enum IndicadorVeiculoOperacao {
    VENDA_CONCESSIONARIA_ID_0("0", "Venda para concessionária"),
    FATURAMENTO_DIRETO("1", "Faturamento direto"),
    VENDA_DIRETA("2", "Venda direta"),
    VENDA_CONCESSIONARIA_ID_3("3", "Venda da concessionária"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorVeiculoOperacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorVeiculoOperacao fromCodigo(String codigo) {
        for (IndicadorVeiculoOperacao tipo : IndicadorVeiculoOperacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}