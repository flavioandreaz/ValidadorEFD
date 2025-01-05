package com.example.validade_efd.enums;

public enum CodigoAjusteSubApuracao {
    OUTROS_DEBITOS("0", "Outros débitos"),
    ESTORNO_CREDITOS("1", "Estorno de créditos"),
    OUTROS_CREDITOS("2", "Outros créditos"),
    ESTORNO_DEBITOS("3", "Estorno de débitos"),
    DEDUCOES_IMPOSTO_APURADO("4", "Deduções do imposto apurado"),
    DEBITOS_ESPECIAIS("5", "Débitos Especiais");

    private final String codigo;
    private final String descricao;

    CodigoAjusteSubApuracao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoAjusteSubApuracao fromCodigo(String codigo) {
        for (CodigoAjusteSubApuracao tipo : CodigoAjusteSubApuracao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}