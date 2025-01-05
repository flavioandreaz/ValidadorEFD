package com.example.validade_efd.enums;

public enum CodigoModeloDocumentoArrecadacao {
    DOCUMENTO_ESTADUAL("0", "Documento estadual de arrecadação"),
    GNRE("1", "GNRE");

    private final String codigo;
    private final String descricao;

    CodigoModeloDocumentoArrecadacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoModeloDocumentoArrecadacao fromCodigo(String codigo) {
        for (CodigoModeloDocumentoArrecadacao tipo : CodigoModeloDocumentoArrecadacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}