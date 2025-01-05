package com.example.validade_efd.enums;

public enum IndicadorMovimentoDifal {
    SEM_OPERACOES("0", "Sem operações com ICMS Diferencial de Alíquota da UF de Origem/Destino"),
    COM_OPERACOES("1", "Com operações de ICMS Diferencial de Alíquota da UF de Origem/Destino");

    private final String codigo;
    private final String descricao;

    IndicadorMovimentoDifal(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorMovimentoDifal fromCodigo(String codigo) {
        for (IndicadorMovimentoDifal tipo : IndicadorMovimentoDifal.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}