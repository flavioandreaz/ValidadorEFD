package com.example.validade_efd.enums;

public enum CodigoMotivoRessarcimento {
    VENDA_OUTRA_UF("1", "Venda para outra UF"),
    SAIDA_ISENCAO_NAO_INCIDENCIA("2", "Saída amparada por isenção ou não incidência"),
    PERDA_DETERIORACAO("3", "Perda ou deterioração"),
    FURTO_ROUBO("4", "Furto ou roubo"),
    EXPORTACAO("5", "Exportação"),
    OUTROS("9", "Outros");

    private final String codigo;
    private final String descricao;

    CodigoMotivoRessarcimento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoMotivoRessarcimento fromCodigo(String codigo) {
        for (CodigoMotivoRessarcimento tipo : CodigoMotivoRessarcimento.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}