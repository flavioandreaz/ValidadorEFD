package com.example.validade_efd.enums;

public enum IndicadorOrigemProcesso {
    SEFAZ("0", "SEFAZ"),
    JUSTICA_FEDERAL("1", "Justiça Federal"),
    JUSTICA_ESTADUAL("2", "Justiça Estadual"),
    SECEX_SRF("3", "SECEX/SRF"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorOrigemProcesso(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorOrigemProcesso fromCodigo(String codigo) {
        for (IndicadorOrigemProcesso tipo : IndicadorOrigemProcesso.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}