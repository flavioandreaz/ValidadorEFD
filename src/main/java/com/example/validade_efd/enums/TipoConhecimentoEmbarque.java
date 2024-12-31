package com.example.validade_efd.enums;

public enum TipoConhecimentoEmbarque {
    AWB("01", "AWB"),
    MAWB("02", "MAWB"),
    HAWB("03", "HAWB"),
    COMAT("04", "COMAT"),
    R_EXPRESSAS("06", "R. EXPRESSAS"),
    ETIQ_REXPRESSAS("07", "ETIQ. REXPRESSAS"),
    HR_EXPRESSAS("08", "HR. EXPRESSAS"),
    AV7("09", "AV7"),
    BL("10", "BL"),
    MBL("11", "MBL"),
    HBL("12", "HBL"),
    CRT("13", "CRT"),
    DSIC("14", "DSIC"),
    COMAT_BL("16", "COMAT BL"),
    RWB("17", "RWB"),
    HRWB("18", "HRWB"),
    TIF_DTA("19", "TIF/DTA"),
    CP2("20", "CP2"),
    NAO_IATA("91", "NÃO IATA"),
    MNAO_IATA("92", "MNAO IATA"),
    HNAO_IATA("93", "HNAO IATA"),
    OUTROS("99", "OUTROS");

    private final String codigo;
    private final String descricao;

    TipoConhecimentoEmbarque(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoConhecimentoEmbarque fromCodigo(String codigo) {
        for (TipoConhecimentoEmbarque tipo : TipoConhecimentoEmbarque.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}