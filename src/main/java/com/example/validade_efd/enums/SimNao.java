package com.example.validade_efd.enums;

public enum SimNao {
    SIM("S", "Sim"),
    NAO("N", "Não");

    private final String codigo;
    private final String descricao;

    SimNao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static SimNao fromCodigo(String codigo) {
        for (SimNao tipo : SimNao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}