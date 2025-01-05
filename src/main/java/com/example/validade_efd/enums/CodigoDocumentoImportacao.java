package com.example.validade_efd.enums;

public enum CodigoDocumentoImportacao {
    DECLARACAO_IMPORTACAO("0", "Declaração de Importação"),
    DECLARACAO_SIMPLIFICADA_IMPORTACAO("1", "Declaração Simplificada de Importação");

    private final String codigo;
    private final String descricao;

    CodigoDocumentoImportacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoDocumentoImportacao fromCodigo(String codigo) {
        for (CodigoDocumentoImportacao tipo : CodigoDocumentoImportacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}