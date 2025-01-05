package com.example.validade_efd.enums;

public enum IndicadorApuracaoICMS {
    APURACAO_1("3", "APURAÇÃO 1"),
    APURACAO_2("4", "APURAÇÃO 2"),
    APURACAO_3("5", "APURAÇÃO 3"),
    APURACAO_4("6", "APURAÇÃO 4"),
    APURACAO_5("7", "APURAÇÃO 5"),
    APURACAO_6("8", "APURAÇÃO 6");

    private final String codigo;
    private final String descricao;

    IndicadorApuracaoICMS(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorApuracaoICMS fromCodigo(String codigo) {
        for (IndicadorApuracaoICMS tipo : IndicadorApuracaoICMS.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}