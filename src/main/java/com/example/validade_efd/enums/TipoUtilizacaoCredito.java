package com.example.validade_efd.enums;

public enum TipoUtilizacaoCredito {
    DEDUCAO("XX01", "Dedução"),
    COMPENSACAO("XX21", "Compensação"),
    TRANSFERENCIA("XX41", "Transferência"),
    RESTITUICAO("XX61", "Restituição"),
    ESTORNO("XX81", "Estorno"),
    OUTROS("XX99", "Outros");

    private final String codigo;
    private final String descricao;

    TipoUtilizacaoCredito(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoUtilizacaoCredito fromCodigo(String codigo) {
        for (TipoUtilizacaoCredito tipo : TipoUtilizacaoCredito.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}