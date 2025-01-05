package com.example.validade_efd.enums;

public enum GrupoTensao {
    A1("01", "Alta Tensão (230kV ou mais)"),
    A2("02", "Alta Tensão (88 a 138kV)"),
    A3("03", "Alta Tensão (69kV)"),
    A3A("04", "Alta Tensão (30kV a 44kV)"),
    A4("05", "Alta Tensão (2,3kV a 25kV)"),
    AS("06", "Alta Tensão Subterrâneo"),
    B1_RESIDENCIAL("07", "Residencial"),
    B1_RESIDENCIAL_BAIXA_RENDA("08", "Residencial Baixa Renda"),
    B2_RURAL("09", "Rural"),
    B2_COOPERATIVA("10", "Cooperativa de Eletrificação Rural"),
    B2_SERVICO_PUBLICO("11", "Serviço Público de Irrigação"),
    B3_DEMAIS_CLASSES("12", "Demais Classes"),
    B4A_ILUMINACAO_PUBLICA_REDE("13", "Iluminação Pública - rede de distribuição"),
    B4B_ILUMINACAO_PUBLICA_BULBO("14", "Iluminação Pública - bulbo de lâmpada");

    private final String codigo;
    private final String descricao;

    GrupoTensao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static GrupoTensao fromCodigo(String codigo) {
        for (GrupoTensao tensao : GrupoTensao.values()) {
            if (tensao.getCodigo().equals(codigo)) {
                return tensao;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}