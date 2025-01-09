package com.example.validade_efd.enums;

public enum IndicadorVeiculo {
    EMBARCACAO("0", "Embarcação"),
    EMPURRADOR_REBOCADOR("1", "Empurrador/rebocador");

    private final String codigo;
    private final String descricao;

    IndicadorVeiculo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorVeiculo fromCodigo(String codigo) {
        for (IndicadorVeiculo veiculo : IndicadorVeiculo.values()) {
            if (veiculo.getCodigo().equals(codigo)) {
                return veiculo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}