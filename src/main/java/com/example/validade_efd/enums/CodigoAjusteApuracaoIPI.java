package com.example.validade_efd.enums;

public enum CodigoAjusteApuracaoIPI {
    ESTORNO_DE_DEBITO("001", "Estorno de débito", "C", "Valor do débito do IPI estornado"),
    CREDITO_RECEBIDO_POR_TRANSFERENCIA("002", "Crédito recebido por transferência", "C", "Valor do crédito do IPI recebido por transferência, de outro(s) estabelecimento(s) da mesma empresa"),
    CREDITO_PRESUMIDO_IPI_LEI_9363("010", "Crédito Presumido de IPI ressarcimento do PIS/PASEP e da COFINS - Lei nº 9.363, de 1996", "C", "Valor do crédito presumido de IPI decorrente do ressarcimento do PIS/PASEP e da COFINS nas operações de exportação de produtos industrializados (Lei nº 9.363, de1996, art. 1º)"),
    CREDITO_PRESUMIDO_IPI_LEI_10276("011", "Crédito Presumido de IPI ressarcimento do PIS/PASEP e da COFINS - Lei nº 10.276, de 2001", "C", "Valor do crédito presumido de IPI decorrente do ressarcimento do PIS/PASEP e da COFINS nas operações de exportação de produtos industrializados (Lei nº 10.276, de 2001, art. 1º)"),
    CREDITO_PRESUMIDO_IPI_LEI_9826("012", "Crédito Presumido de IPI regiões incentivadas - Lei nº 9.826, de 1999", "C", "Valor do crédito presumido relativo ao IPI incidente nas saídas, do estabelecimento industrial, dos produtos classificados nas posições 8702 a 8704 da TIPI (Lei nº 9.826, de 1999, art. 1º)"),
    CREDITO_PRESUMIDO_IPI_FRETE("013", "Crédito Presumido de IPI frete - MP nº 2.158, de 2001", "C", "Valor do crédito presumido de IPI relativamente à parcela do frete cobrado pela prestação do serviço de transporte dos produtos classificados nos códigos 8433.53.00, 8433.59.1, 8701.10.00, 8701.30.00, 8701.90.00, 8702.10.00 Ex 01, 8702.90.90 Ex 01, 8703, 8704.2, 8704.3 e 87.06.00.20, da TIPI (MP nº 2.158, de 2001, art. 56)"),
    CREDITO_PRESUMIDO_IPI_OUTROS("019", "Crédito Presumido de IPI - outros", "C", "Outros valores de crédito presumido de IPI"),
    CREDITOS_DECORRENTES_MEDIDA_JUDICIAL("098", "Créditos decorrentes de medida judicial", "C", "Valores de crédito de IPI decorrentes de medida judicial"),
    OUTROS_CREDITOS("099", "Outros créditos", "C", "Valor de outros créditos do IPI"),
    ESTORNO_DE_CREDITO("101", "Estorno de crédito", "D", "Valor do crédito do IPI estornado"),
    TRANSFERENCIA_DE_CREDITO("102", "Transferência de crédito", "D", "Valor do crédito do IPI transferido no período, para outro(s) estabelecimento(s) da mesma empresa, conforme previsto na legislação tributária."),
    RESSARCIMENTO_COMPENSACAO_CREDITOS_IPI("103", "Ressarcimento/compensação de créditos de IPI", "D", "Valor do crédito de IPI solicitado junto à RFB/MF"),
    OUTROS_DEBITOS("199", "Outros débitos", "D", "Valor de outros débitos do IPI");

    private final String codigo;
    private final String descricao;
    private final String natureza;
    private final String detalhamento;

    CodigoAjusteApuracaoIPI(String codigo, String descricao, String natureza, String detalhamento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.natureza = natureza;
        this.detalhamento = detalhamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNatureza() {
        return natureza;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public static CodigoAjusteApuracaoIPI fromCodigo(String codigo) {
        for (CodigoAjusteApuracaoIPI tipo : CodigoAjusteApuracaoIPI.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}