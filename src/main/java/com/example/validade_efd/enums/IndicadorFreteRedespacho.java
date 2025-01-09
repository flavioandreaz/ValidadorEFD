package com.example.validade_efd.enums;

public enum IndicadorFreteRedespacho {
    SEM_REDESPACHO("0", "Sem redespacho"),
    POR_CONTA_EMITENTE("1", "Por conta do emitente"),
    POR_CONTA_DESTINATARIO("2", "Por conta do destinatário"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorFreteRedespacho(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorFreteRedespacho fromCodigo(String codigo) {
        for (IndicadorFreteRedespacho frete : IndicadorFreteRedespacho.values()) {
            if (frete.getCodigo().equals(codigo)) {
                return frete;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}