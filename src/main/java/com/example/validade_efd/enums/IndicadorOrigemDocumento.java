package com.example.validade_efd.enums;

public enum IndicadorOrigemDocumento {
    PROCESSO_JUDICIAL("0", "Processo Judicial"),
    PROCESSO_ADMINISTRATIVO("1", "Processo Administrativo"),
    PER_DCOMP("2", "PER/DCOMP"),
    DOCUMENTO_FISCAL("3", "Documento Fiscal"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorOrigemDocumento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorOrigemDocumento fromCodigo(String codigo) {
        for (IndicadorOrigemDocumento tipo : IndicadorOrigemDocumento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}