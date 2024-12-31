package com.example.validade_efd.enums;

import lombok.Getter;
import lombok.ToString;
@ToString
@Getter
/**
 * Define os tipos de campos suportados pela anotação {@link Campo}.
 */
public enum TipoCampo {
    N("N", "Numérico"),
    C("C", "Caracteres");

    private final String codigo;
    private final String descricao;

    TipoCampo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoCampo fromCodigo(String codigo) {
        for (TipoCampo tipo : TipoCampo.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de tipo de campo inválido: " + codigo);
    }


}