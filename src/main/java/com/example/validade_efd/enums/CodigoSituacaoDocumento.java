package com.example.validade_efd.enums;

public enum CodigoSituacaoDocumento {
    DOCUMENTO_REGULAR("00", "Documento regular"),
    ESCRITURACAO_EXTEMPORANEA_REGULAR("01", "Escrituração extemporânea de documento regular"),
    DOCUMENTO_CANCELADO("02", "Documento cancelado"),
    ESCRITURACAO_EXTEMPORANEA_CANCELADO("03", "Escrituração extemporânea de documento cancelado"),
    DENEGADO("04", "NF-e, NFC-e ou CT-e - denegado"),
    NUMERACAO_INUTILIZADA("05", "NF-e, NFC-e ou CT-e - Numeração inutilizada"),
    DOCUMENTO_COMPLEMENTAR("06", "Documento Fiscal Complementar"),
    ESCRITURACAO_EXTEMPORANEA_COMPLEMENTAR("07", "Escrituração extemporânea de documento complementar"),
    REGIME_ESPECIAL("08", "Documento Fiscal emitido com base em Regime Especial ou Norma Específica");

    private final String codigo;
    private final String descricao;

    CodigoSituacaoDocumento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoSituacaoDocumento fromCodigo(String codigo) {
        for (CodigoSituacaoDocumento tipo : CodigoSituacaoDocumento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}