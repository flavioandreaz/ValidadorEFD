package com.example.validade_efd.enums;

public enum CstIpi {
    ENTRADA_RECUPERACAO_CREDITO("00", "Entrada com recuperação de crédito"),
    ENTRADA_TRIBUTADA_ALIQUOTA_ZERO("01", "Entrada tributada com alíquota zero"),
    ENTRADA_ISENTA("02", "Entrada isenta"),
    ENTRADA_NAO_TRIBUTADA("03", "Entrada não-tributada"),
    ENTRADA_IMUNE("04", "Entrada imune"),
    ENTRADA_SUSPENSAO("05", "Entrada com suspensão"),
    OUTRAS_ENTRADAS("49", "Outras entradas"),
    SAIDA_TRIBUTADA("50", "Saída tributada"),
    SAIDA_TRIBUTADA_ALIQUOTA_ZERO("51", "Saída tributada com alíquota zero"),
    SAIDA_ISENTA("52", "Saída isenta"),
    SAIDA_NAO_TRIBUTADA("53", "Saída não-tributada"),
    SAIDA_IMUNE("54", "Saída imune"),
    SAIDA_SUSPENSAO("55", "Saída com suspensão"),
    OUTRAS_SAIDAS("99", "Outras saídas");

    private final String codigo;
    private final String descricao;

    CstIpi(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CstIpi fromCodigo(String codigo) {
        for (CstIpi tipo : CstIpi.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}