package com.example.validade_efd.enums;

public enum OrigemCorrecaoApontamento {
    PRODUCAO_CONSUMO_K230_K235("1", "Correção de apontamento de produção e/ou consumo relativo aos Registros K230/K235"),
    PRODUCAO_CONSUMO_K250_K255("2", "Correção de apontamento de produção e/ou consumo relativo aos Registros K250/K255"),
    DESMONTAGEM_CONSUMO_K210_K215("3", "Correção de apontamento de desmontagem e/ou consumo relativo aos Registros K210/K215"),
    REPROCESSAMENTO_REPARO_K260_K265("4", "Correção de apontamento de reprocessamento/reparo e/ou consumo relativo aos Registros K260/K265"),
    MOVIMENTACAO_INTERNA_K220("5", "Correção de apontamento de movimentação interna relativo ao Registro K220"),
    PRODUCAO_K291("6", "Correção de apontamento de produção relativo ao Registro K291"),
    CONSUMO_K292("7", "Correção de apontamento de consumo relativo ao Registro K292"),
    PRODUCAO_K301("8", "Correção de apontamento de produção relativo ao Registro K301"),
    CONSUMO_K302("9", "Correção de apontamento de consumo relativo ao Registro K302");

    private final String codigo;
    private final String descricao;

    OrigemCorrecaoApontamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static OrigemCorrecaoApontamento fromCodigo(String codigo) {
        for (OrigemCorrecaoApontamento tipo : OrigemCorrecaoApontamento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}