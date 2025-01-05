package com.example.validade_efd.enums;

public enum IndicadorTipoOperacaoCombustivel {
    COMBUSTIVEIS_LUBRIFICANTES("0", "Combustíveis e Lubrificantes"),
    LEASING_VEICULOS("1", "Leasing de veículos ou faturamento direto");

    private final String codigo;
    private final String descricao;

    IndicadorTipoOperacaoCombustivel(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoOperacaoCombustivel fromCodigo(String codigo) {
        for (IndicadorTipoOperacaoCombustivel tipo : IndicadorTipoOperacaoCombustivel.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}