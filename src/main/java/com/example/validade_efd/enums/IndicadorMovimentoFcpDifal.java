package com.example.validade_efd.enums;

public enum IndicadorMovimentoFcpDifal {
    SEM_OPERACOES("0", "Sem operações"),
    COM_OPERACOES("1", "Com operações");

    private final String codigo;
    private final String descricao;

    IndicadorMovimentoFcpDifal(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorMovimentoFcpDifal fromCodigo(String codigo) {
        for (IndicadorMovimentoFcpDifal tipo : IndicadorMovimentoFcpDifal.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}