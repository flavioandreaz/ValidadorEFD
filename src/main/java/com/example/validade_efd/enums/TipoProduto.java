package com.example.validade_efd.enums;

public enum TipoProduto {
    SIMILAR("0", "Similar"),
    GENERICO("1", "Genérico"),
    ETICO_OU_MARCA("2", "Ético ou de marca");

    private final String codigo;
    private final String descricao;

    TipoProduto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoProduto fromCodigo(String codigo) {
        for (TipoProduto tipo : TipoProduto.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}