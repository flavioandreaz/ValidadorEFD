package com.example.validade_efd.enums;

public enum CodigoClasseConsumo {
    COMERCIAL("01", "Comercial"),
    CONSUMO_PROPRIO("02", "Consumo Próprio"),
    ILUMINACAO_PUBLICA("03", "Iluminação Pública"),
    INDUSTRIAL("04", "Industrial"),
    PODER_PUBLICO("05", "Poder Público"),
    RESIDENCIAL("06", "Residencial"),
    RURAL("07", "Rural"),
    SERVICO_PUBLICO("08", "Serviço Público");

    private final String codigo;
    private final String descricao;

    CodigoClasseConsumo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoClasseConsumo fromCodigo(String codigo) {
        for (CodigoClasseConsumo tipo : CodigoClasseConsumo.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}