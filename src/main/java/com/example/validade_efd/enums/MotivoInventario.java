package com.example.validade_efd.enums;

public enum MotivoInventario {
    FINAL_PERIODO("01", "No final no período"),
    MUDANCA_TRIBUTACAO("02", "Na mudança de forma de tributação da mercadoria (ICMS)"),
    BAIXA_CADASTRAL("03", "Na solicitação da baixa cadastral, paralisação temporária e outras situações"),
    ALTERACAO_REGIME_PAGAMENTO("04", "Na alteração de regime de pagamento – condição do contribuinte"),
    DETERMINACAO_FISCOS("05", "Por determinação dos fiscos");

    private final String codigo;
    private final String descricao;

    MotivoInventario(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static MotivoInventario fromCodigo(String codigo) {
        for (MotivoInventario tipo : MotivoInventario.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}