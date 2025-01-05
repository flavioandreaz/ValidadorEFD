package com.example.validade_efd.enums;

public enum IndicadorEmitenteDocumento {
    EMISSAO_PROPRIA("0", "Emissão própria"),
    TERCEIROS("1", "Terceiros");

    private final String codigo;
    private final String descricao;

    IndicadorEmitenteDocumento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorEmitenteDocumento fromCodigo(String codigo) {
        for (IndicadorEmitenteDocumento tipo : IndicadorEmitenteDocumento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}