package com.example.validade_efd.enums;

public enum IndicadorOperacao {
    ENTRADA("0", "- Entrada/aquisição"),
    SAIDA("1", "- Saída/prestação");

    private final String codigo;
    private final String descricao;

    IndicadorOperacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorOperacao fromCodigo(String codigo) {
        for (IndicadorOperacao tipo : IndicadorOperacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}