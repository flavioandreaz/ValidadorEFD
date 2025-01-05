package com.example.validade_efd.enums;

public enum IndicadorPropriedadePosseItem {
    PROPRIEDADE_INFORMANTE("0", "Item de propriedade do informante e em seu poder"),
    PROPRIEDADE_INFORMANTE_TERCEIROS("1", "Item de propriedade do informante em posse de terceiros"),
    PROPRIEDADE_TERCEIROS_INFORMANTE("2", "Item de propriedade de terceiros em posse do informante");

    private final String codigo;
    private final String descricao;

    IndicadorPropriedadePosseItem(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorPropriedadePosseItem fromCodigo(String codigo) {
        for (IndicadorPropriedadePosseItem tipo : IndicadorPropriedadePosseItem.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}