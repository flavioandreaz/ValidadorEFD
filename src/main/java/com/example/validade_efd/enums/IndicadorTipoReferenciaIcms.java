package com.example.validade_efd.enums;

public enum IndicadorTipoReferenciaIcms {
    PRECO_TABELADO("0", "Base de cálculo referente ao preço tabelado ou preço máximo sugerido"),
    MARGEM_VALOR_AGREGADO("1", "Base cálculo – Margem de valor agregado"),
    LISTA_NEGATIVA("2", "Base de cálculo referente à Lista Negativa"),
    LISTA_POSITIVA("3", "Base de cálculo referente à Lista Positiva"),
    LISTA_NEUTRA("4", "Base de cálculo referente à Lista Neutra");

    private final String codigo;
    private final String descricao;

    IndicadorTipoReferenciaIcms(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoReferenciaIcms fromCodigo(String codigo) {
        for (IndicadorTipoReferenciaIcms tipo : IndicadorTipoReferenciaIcms.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}