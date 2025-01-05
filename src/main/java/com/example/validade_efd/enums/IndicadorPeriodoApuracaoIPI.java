package com.example.validade_efd.enums;

public enum IndicadorPeriodoApuracaoIPI {
    MENSAL("0", "Mensal"),
    DECENDIAL("1", "Decendial");

    private final String codigo;
    private final String descricao;

    IndicadorPeriodoApuracaoIPI(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorPeriodoApuracaoIPI fromCodigo(String codigo) {
        for (IndicadorPeriodoApuracaoIPI tipo : IndicadorPeriodoApuracaoIPI.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}