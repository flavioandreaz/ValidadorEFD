package com.example.validade_efd.enums;

public enum IndicadorServico {
    TELEFONIA("0", "Telefonia"),
    COMUNICACAO_DADOS("1", "Comunicação de dados"),
    TV_ASSINATURA("2", "TV por assinatura"),
    PROVIMENTO_INTERNET("3", "Provimento de acesso à Internet"),
    MULTIMIDIA("4", "Multimídia"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorServico(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorServico fromCodigo(String codigo) {
        for (IndicadorServico servico : IndicadorServico.values()) {
            if (servico.getCodigo().equals(codigo)) {
                return servico;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}