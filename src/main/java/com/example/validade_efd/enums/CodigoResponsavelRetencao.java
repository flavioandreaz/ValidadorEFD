package com.example.validade_efd.enums;

public enum CodigoResponsavelRetencao {
    REMETENTE_DIRETO("1", "Remetente Direto"),
    REMETENTE_INDIRETO("2", "Remetente Indireto"),
    PROPRIO_DECLARANTE("3", "Próprio declarante");

    private final String codigo;
    private final String descricao;

    CodigoResponsavelRetencao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoResponsavelRetencao fromCodigo(String codigo) {
        for (CodigoResponsavelRetencao tipo : CodigoResponsavelRetencao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}