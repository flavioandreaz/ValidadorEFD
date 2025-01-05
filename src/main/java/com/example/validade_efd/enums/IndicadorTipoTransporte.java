package com.example.validade_efd.enums;

public enum IndicadorTipoTransporte {
    RODOVIARIO("0", "Rodoviário"),
    FERROVIARIO("1", "Ferroviário"),
    RODO_FERROVIARIO("2", "Rodo-Ferroviário"),
    AQUAVIARIO("3", "Aquaviário"),
    DUTOVIARIO("4", "Dutoviário"),
    AEREO("5", "Aéreo"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    IndicadorTipoTransporte(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoTransporte fromCodigo(String codigo) {
        for (IndicadorTipoTransporte tipo : IndicadorTipoTransporte.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}