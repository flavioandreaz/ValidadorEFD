package com.example.validade_efd.enums;

public enum IndicadorMovimento {
    COM_DADOS("0", "Bloco com dados informados"),
    SEM_DADOS("1", "Bloco sem dados informados");

    private final String codigo;
    private final String descricao;

    IndicadorMovimento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorMovimento fromCodigo(String codigo) {
        for (IndicadorMovimento tipo : IndicadorMovimento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}