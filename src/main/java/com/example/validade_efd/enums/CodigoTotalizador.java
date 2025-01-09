package com.example.validade_efd.enums;

public enum CodigoTotalizador {
    TNNNN("Tnnnn", "Tributado ICMS"),
    XXTNNNN("XxTnnnn", "Tributado ICMS"),
    SNNNN("Snnnn", "Tributado ISSQN"),
    XXSNNNN("XxSnnnn", "Tributado ISSQN"),
    FN("Fn", "Substituição Tributária - ICMS"),
    IN("In", "Isento - ICMS"),
    NN("Nn", "Não-incidência - ICMS"),
    FSN("FSn", "Substituição Tributária - ISSQN"),
    ISN("ISn", "Isento - ISSQN"),
    NSN("NSn", "Não-incidência - ISSQN"),
    OPNF("OPNF", "Operações Não Fiscais"),
    DT("DT", "Desconto - ICMS"),
    DS("DS", "Desconto - ISSQN"),
    DO("DO", "Desconto - Operações Não Fiscais"),
    AT("AT", "Acréscimo - ICMS"),
    AS("AS", "Acréscimo - ISSQN"),
    AO("AO", "Acréscimo - Operações Não Fiscais"),
    CAN_T("Can-T", "Cancelamento - ICMS"),
    CAN_S("Can-S", "Cancelamento - ISSQN"),
    CAN_O("Can-O", "Cancelamento - Operações Não Fiscais"),
    IOF("IOF", "Imposto sobre Operações Financeiras");

    private final String codigo;
    private final String descricao;

    CodigoTotalizador(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoTotalizador fromCodigo(String codigo) {
        for (CodigoTotalizador totalizador : CodigoTotalizador.values()) {
            if (totalizador.getCodigo().equals(codigo)) {
                return totalizador;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}