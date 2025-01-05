package com.example.validade_efd.enums;

public enum CodigoProduto {
    ALCOOL_HIDRATADO("01", "Álcool Etílico Hidratado Carburante"),
    ALCOOL_ANIDRO("02", "Álcool Etílico Anidro Carburante"),
    ACUCAR("03", "Açúcar");

    private final String codigo;
    private final String descricao;

    CodigoProduto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoProduto fromCodigo(String codigo) {
        for (CodigoProduto tipo : CodigoProduto.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}