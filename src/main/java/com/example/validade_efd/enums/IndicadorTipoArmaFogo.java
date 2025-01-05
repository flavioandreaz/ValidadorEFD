package com.example.validade_efd.enums;

public enum IndicadorTipoArmaFogo {
    USO_PERMITIDO("0", "Uso permitido"),
    USO_RESTRITO("1", "Uso restrito");

    private final String codigo;
    private final String descricao;

    IndicadorTipoArmaFogo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoArmaFogo fromCodigo(String codigo) {
        for (IndicadorTipoArmaFogo tipo : IndicadorTipoArmaFogo.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}