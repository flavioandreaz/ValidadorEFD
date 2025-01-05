package com.example.validade_efd.enums;

public enum CodigoDocumentoArrecadacao {
    DOCUMENTO_ESTADUAL_ARRECADACAO("0", "Documento estadual de arrecadação"),
    GNRE("1", "GNRE");

    private final String codigo;
    private final String descricao;

    CodigoDocumentoArrecadacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoDocumentoArrecadacao fromCodigo(String codigo) {
        for (CodigoDocumentoArrecadacao tipo : CodigoDocumentoArrecadacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}