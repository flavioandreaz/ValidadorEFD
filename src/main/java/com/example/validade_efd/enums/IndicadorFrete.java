package com.example.validade_efd.enums;

public enum IndicadorFrete {
    POR_CONTA_EMITENTE("0", "Por conta do emitente"),
    POR_CONTA_DESTINATARIO("1", "Por conta do destinatário/remetente"),
    POR_CONTA_TERCEIROS("2", "Por conta de terceiros"),
    SEM_COBRANCA("9", "Sem cobrança de frete");

    private final String codigo;
    private final String descricao;

    IndicadorFrete(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorFrete fromCodigo(String codigo) {
        for (IndicadorFrete frete : IndicadorFrete.values()) {
            if (frete.getCodigo().equals(codigo)) {
                return frete;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}