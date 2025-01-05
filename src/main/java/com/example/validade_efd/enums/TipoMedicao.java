package com.example.validade_efd.enums;

public enum TipoMedicao {
    ANALOGICO("0", "Analógico"),
    DIGITAL("1", "Digital");

    private final String codigo;
    private final String descricao;

    TipoMedicao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoMedicao fromCodigo(String codigo) {
        for (TipoMedicao tipo : TipoMedicao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}