package com.example.validade_efd.enums;

public enum CodigoNaturezaConta {
    ATIVO("01", "Contas de ativo"),
    PASSIVO("02", "Contas de passivo"),
    PATRIMONIO_LIQUIDO("03", "Patrimônio líquido"),
    RESULTADO("04", "Contas de resultado"),
    COMPENSACAO("05", "Contas de compensação"),
    OUTRAS("09", "Outras");

    private final String codigo;
    private final String descricao;

    CodigoNaturezaConta(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoNaturezaConta fromCodigo(String codigo) {
        for (CodigoNaturezaConta tipo : CodigoNaturezaConta.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}