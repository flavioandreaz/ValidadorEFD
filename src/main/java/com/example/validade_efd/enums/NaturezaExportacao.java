package com.example.validade_efd.enums;

public enum NaturezaExportacao {
    EXPORTACAO_DIRETA("0", "Exportação Direta"),
    EXPORTACAO_INDIRETA("1", "Exportação Indireta");

    private final String codigo;
    private final String descricao;

    NaturezaExportacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static NaturezaExportacao fromCodigo(String codigo) {
        for (NaturezaExportacao tipo : NaturezaExportacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}