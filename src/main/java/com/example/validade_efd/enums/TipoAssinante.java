package com.example.validade_efd.enums;

public enum TipoAssinante {
    COMERCIAL_INDUSTRIAL(1, "Comercial/Industrial"),
    PODER_PUBLICO(2, "Poder Público"),
    RESIDENCIAL_PESSOA_FISICA(3, "Residencial/Pessoa física"),
    PUBLICO(4, "Público"),
    SEMI_PUBLICO(5, "Semi-Público"),
    OUTROS(6, "Outros");

    private final int codigo;
    private final String descricao;

    TipoAssinante(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoAssinante fromCodigo(int codigo) {
        for (TipoAssinante tipo : TipoAssinante.values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}