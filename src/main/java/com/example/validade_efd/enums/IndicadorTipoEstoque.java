package com.example.validade_efd.enums;

public enum IndicadorTipoEstoque {
    PROPRIEDADE_INFORMANTE("0", "Estoque de propriedade do informante e em seu poder"),
    PROPRIEDADE_INFORMANTE_TERCEIROS("1", "Estoque de propriedade do informante e em posse de terceiros"),
    PROPRIEDADE_TERCEIROS_INFORMANTE("2", "Estoque de propriedade de terceiros e em posse do informante");

    private final String codigo;
    private final String descricao;

    IndicadorTipoEstoque(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoEstoque fromCodigo(String codigo) {
        for (IndicadorTipoEstoque tipo : IndicadorTipoEstoque.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}