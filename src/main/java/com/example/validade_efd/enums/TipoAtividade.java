package com.example.validade_efd.enums;

import lombok.Getter;
import lombok.ToString;
@ToString
@Getter
public enum TipoAtividade {
    INDUSTRIAL("0", "Industrial ou equiparado a industrial"),
    OUTROS("1", "Outros");

    private final String codigo;
    private final String descricao;

    TipoAtividade(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoAtividade fromCodigo(String codigo) {
        for (TipoAtividade tipo : TipoAtividade.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de tipo de atividade inválido: " + codigo);
    }
}