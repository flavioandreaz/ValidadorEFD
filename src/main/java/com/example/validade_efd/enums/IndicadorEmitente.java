package com.example.validade_efd.enums;

public enum IndicadorEmitente {
    EMISSAO_PROPRIA("0", "Emissão própria"), 
    TERCEIROS("1", "Terceiros");

    private final String codigo;
    private final String descricao;

    IndicadorEmitente(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorEmitente fromCodigo(String codigo) {
        for (IndicadorEmitente tipo : IndicadorEmitente.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}