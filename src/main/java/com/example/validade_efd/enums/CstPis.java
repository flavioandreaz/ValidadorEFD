package com.example.validade_efd.enums;

public enum CstPis {
    OPERACAO_TRIBUTAVEL_ALIQUOTA_BASICA("01", "Operação Tributável com Alíquota Básica"),
    OPERACAO_TRIBUTAVEL_ALIQUOTA_DIFERENCIADA("02", "Operação Tributável com Alíquota Diferenciada"),
    OPERACAO_TRIBUTAVEL_UNIDADE_MEDIDA_PRODUTO("03", "Operação Tributável com Alíquota por Unidade de Medida de Produto"),
    OPERACAO_TRIBUTAVEL_MONOFASICA_REV_ALIQUOTA_ZERO("04", "Operação Tributável Monofásica - Revenda a Alíquota Zero"),
    OPERACAO_TRIBUTAVEL_SUBSTITUICAO_TRIBUTARIA("05", "Operação Tributável por Substituição Tributária"),
    OPERACAO_TRIBUTAVEL_ALIQUOTA_ZERO("06", "Operação Tributável a Alíquota Zero"),
    OPERACAO_ISENTA_CONTRIBUICAO("07", "Operação Isenta da Contribuição"),
    OPERACAO_SEM_INCIDENCIA_CONTRIBUICAO("08", "Operação sem Incidência da Contribuição"),
    OPERACAO_SUSPENSAO_CONTRIBUICAO("09", "Operação com Suspensão da Contribuição"),
    OUTRAS_OPERACOES_SAIDA("49", "Outras Operações de Saída"),
    OPERACAO_DIREITO_CREDITO_RECEITA_TRIBUTADA("50", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    OPERACAO_DIREITO_CREDITO_RECEITA_NAO_TRIBUTADA("51", "Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno"),
    OPERACAO_DIREITO_CREDITO_RECEITA_EXPORTACAO("52", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação"),
    OPERACAO_DIREITO_CREDITO_RECEITAS_TRIBUTADAS_NAO_TRIBUTADAS("53", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    OPERACAO_DIREITO_CREDITO_RECEITAS_TRIBUTADAS_EXPORTACAO("54", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    OPERACAO_DIREITO_CREDITO_RECEITAS_NAO_TRIBUTADAS_EXPORTACAO("55", "Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    OPERACAO_DIREITO_CREDITO_RECEITAS_TRIBUTADAS_NAO_TRIBUTADAS_EXPORTACAO("56", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITA_TRIBUTADA("60", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITA_NAO_TRIBUTADA("61", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITA_EXPORTACAO("62", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITAS_TRIBUTADAS_NAO_TRIBUTADAS("63", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITAS_TRIBUTADAS_EXPORTACAO("64", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITAS_NAO_TRIBUTADAS_EXPORTACAO("65", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_RECEITAS_TRIBUTADAS_NAO_TRIBUTADAS_EXPORTACAO("66", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    CREDITO_PRESUMIDO_OUTRAS_OPERACOES("67", "Crédito Presumido - Outras Operações"),
    OPERACAO_AQUISICAO_SEM_DIREITO_CREDITO("70", "Operação de Aquisição sem Direito a Crédito"),
    OPERACAO_AQUISICAO_ISENCAO("71", "Operação de Aquisição com Isenção"),
    OPERACAO_AQUISICAO_SUSPENSAO("72", "Operação de Aquisição com Suspensão"),
    OPERACAO_AQUISICAO_ALIQUOTA_ZERO("73", "Operação de Aquisição a Alíquota Zero"),
    OPERACAO_AQUISICAO_SEM_INCIDENCIA_CONTRIBUICAO("74", "Operação de Aquisição sem Incidência da Contribuição"),
    OPERACAO_AQUISICAO_SUBSTITUICAO_TRIBUTARIA("75", "Operação de Aquisição por Substituição Tributária"),
    OUTRAS_OPERACOES_ENTRADA("98", "Outras Operações de Entrada"),
    OUTRAS_OPERACOES("99", "Outras Operações");

    private final String codigo;
    private final String descricao;

    CstPis(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CstPis fromCodigo(String codigo) {
        for (CstPis tipo : CstPis.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}