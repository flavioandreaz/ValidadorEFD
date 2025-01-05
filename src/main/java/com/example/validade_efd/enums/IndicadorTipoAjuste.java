package com.example.validade_efd.enums;

public enum IndicadorTipoAjuste {
    AJUSTE_DEBITO("0", "Ajuste a débito"),
    AJUSTE_CREDITO("1", "Ajuste a crédito");

    private final String codigo;
    private final String descricao;

    IndicadorTipoAjuste(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoAjuste fromCodigo(String codigo) {
        for (IndicadorTipoAjuste tipo : IndicadorTipoAjuste.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}