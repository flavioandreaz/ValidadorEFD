package com.example.validade_efd.enums;

public enum TipoLigacao {
    MONOFASICO("1", "Monofásico"),
    BIFASICO("2", "Bifásico"),
    TRIFASICO("3", "Trifásico");

    private final String codigo;
    private final String descricao;

    TipoLigacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoLigacao fromCodigo(String codigo) {
        for (TipoLigacao tipo : TipoLigacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}