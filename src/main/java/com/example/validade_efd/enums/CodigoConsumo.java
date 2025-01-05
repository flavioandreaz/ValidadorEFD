package com.example.validade_efd.enums;

public enum CodigoConsumo {
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

    CodigoConsumo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoConsumo fromCodigo(String codigo) {
        for (CodigoConsumo consumo : CodigoConsumo.values()) {
            if (consumo.getCodigo().equals(codigo)) {
                return consumo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}