package com.example.validade_efd.enums;

public enum TipoMercadoria {
    BEM("1", "Bem"),
    COMPONENTE("2", "Componente");

    private final String codigo;
    private final String descricao;

    TipoMercadoria(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoMercadoria fromCodigo(String codigo) {
        for (TipoMercadoria tipo : TipoMercadoria.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}