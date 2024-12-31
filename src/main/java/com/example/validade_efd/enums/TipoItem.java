package com.example.validade_efd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoItem {

    MERCADORIA_REV("00", "Mercadoria para Revenda"),
    MATERIA_PRIMA("01", "Matéria-Prima"),
    EMBALAGEM("02", "Embalagem"),
    PRODUTO_PROCESSO("03", "Produto em Processo"),
    PRODUTO_ACABADO("04", "Produto Acabado"),
    SUBPRODUTO("05", "Subproduto"),
    PRODUTO_INTERMEDIARIO("06", "Produto Intermediário"),
    MATERIAL_CONSUMO("07", "Material de Uso e Consumo"),
    ATIVO_IMOBILIZADO("08", "Ativo Imobilizado"),
    SERVICOS("09", "Serviços"),
    OUTROS_INSUMOS("10", "Outros insumos"),
    OUTRAS("99", "Outras");

    private final String codigo;
    private final String descricao;

    public static TipoItem fromCodigo(String codigo) {
        for (TipoItem tipoItem : TipoItem.values()) {
            if (tipoItem.getCodigo().equals(codigo)) {
                return tipoItem;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
