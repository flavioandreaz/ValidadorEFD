package com.example.validade_efd.enums;

public enum CodigoDispositivoAutorizado {
    FORMULARIO_SEGURANCA_IMPRESSOR_AUTONOMO("00", "Formulário de Segurança – impressor autônomo"),
    FS_DA("01", "FS-DA – Formulário de Segurança para Impressão de DANFE"),
    FORMULARIO_SEGURANCA_NFE("02", "Formulário de segurança - NF-e"),
    FORMULARIO_CONTINUO("03", "Formulário Contínuo"),
    BLOCOS("04", "Blocos"),
    JOGOS_SOLOS("05", "Jogos Soltos");

    private final String codigo;
    private final String descricao;

    CodigoDispositivoAutorizado(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoDispositivoAutorizado fromCodigo(String codigo) {
        for (CodigoDispositivoAutorizado tipo : CodigoDispositivoAutorizado.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}