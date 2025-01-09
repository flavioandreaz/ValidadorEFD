package com.example.validade_efd.enums;

public enum IndicadorTarifa {
    EXP("0", "Exp."),
    ENC("1", "Enc."),
    CI("2", "C.I."),
    OUTRA("9", "Outra");

    private final String codigo;
    private final String descricao;

    IndicadorTarifa(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTarifa fromCodigo(String codigo) {
        for (IndicadorTarifa tarifa : IndicadorTarifa.values()) {
            if (tarifa.getCodigo().equals(codigo)) {
                return tarifa;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}