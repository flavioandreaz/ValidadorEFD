package com.example.validade_efd.enums;

public enum IndicadorMovimentoST {
    SEM_OPERACOES("0", "Sem operações com ST"),
    COM_OPERACOES("1", "Com operações de ST");

    private final String codigo;
    private final String descricao;

    IndicadorMovimentoST(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorMovimentoST fromCodigo(String codigo) {
        for (IndicadorMovimentoST tipo : IndicadorMovimentoST.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}