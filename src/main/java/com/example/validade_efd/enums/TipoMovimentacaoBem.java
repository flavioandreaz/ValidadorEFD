package com.example.validade_efd.enums;

public enum TipoMovimentacaoBem {
    SALDO_INICIAL("SI", "Saldo inicial de bens imobilizados"),
    IMOBILIZACAO_BEM_INDIVIDUAL("IM", "Imobilização de bem individual"),
    IMOBILIZACAO_EM_ANDAMENTO("IA", "Imobilização em Andamento - Componente"),
    CONCLUSAO_IMOBILIZACAO("CI", "Conclusão de Imobilização em Andamento – Bem Resultante"),
    IMOBILIZACAO_ATIVO_CIRCULANTE("MC", "Imobilização oriunda do Ativo Circulante"),
    BAIXA_BEM("BA", "Baixa do bem - Fim do período de apropriação"),
    ALIENACAO_TRANSFERENCIA("AT", "Alienação ou Transferência"),
    PERECIMENTO_EXTRAVIO("PE", "Perecimento, Extravio ou Deterioração"),
    OUTRAS_SAIDAS("OT", "Outras Saídas do Imobilizado");

    private final String codigo;
    private final String descricao;

    TipoMovimentacaoBem(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoMovimentacaoBem fromCodigo(String codigo) {
        for (TipoMovimentacaoBem tipo : TipoMovimentacaoBem.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}