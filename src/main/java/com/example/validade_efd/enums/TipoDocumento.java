package com.example.validade_efd.enums;

public enum TipoDocumento {
    DECLARACAO_EXPORTACAO("0", "Declaração de Exportação"),
    DECLARACAO_SIMPLIFICADA_EXPORTACAO("1", "Declaração Simplificada de Exportação"),
    DECLARACAO_UNICA_EXPORTACAO("2", "Declaração Única de Exportação");

    private final String codigo;
    private final String descricao;

    TipoDocumento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoDocumento fromCodigo(String codigo) {
        for (TipoDocumento tipo : TipoDocumento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
