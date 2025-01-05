package com.example.validade_efd.enums;

public enum IndicadorTipoFrete {
    CIF("0", "Contratação do Frete por conta do Remetente (CIF)"),
    FOB("1", "Contratação do Frete por conta do Destinatário (FOB)"),
    TERCEIROS("2", "Contratação do Frete por conta de Terceiros"),
    TRANSPORTE_PROPRIO_REMETENTE("3", "Transporte Próprio por conta do Remetente"),
    TRANSPORTE_PROPRIO_DESTINATARIO("4", "Transporte Próprio por conta do Destinatário"),
    SEM_OCORRENCIA_TRANSPORTE("9", "Sem Ocorrência de Transporte");

    private final String codigo;
    private final String descricao;

    IndicadorTipoFrete(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static IndicadorTipoFrete fromCodigo(String codigo) {
        for (IndicadorTipoFrete tipo : IndicadorTipoFrete.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}