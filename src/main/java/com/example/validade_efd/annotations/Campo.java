package com.example.validade_efd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.validade_efd.enums.TipoCampo;

/**
 * Anotação para registrar metadados de campos de uma classe.
 * Permite definir informações como número, nome, descrição, tipo, tamanho, decimais e obrigatoriedade.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Campo {

    /**
     * Número de identificação do campo (obrigatório).
     * @return O número do campo.
     */
    int numero();

    /**
     * Nome do campo (obrigatório).
     * @return O nome do campo.
     */
    String nome();

    /**
     * Descrição detalhada do campo (obrigatório).
     * @return A descrição do campo.
     */
    String descricao();

    /**
     * Tipo do campo (obrigatório).
     * @return O tipo do campo, conforme definido no enum {@link TipoCampo}.
     */
    TipoCampo tipo();

    /**
     * Tamanho exato do campo (opcional, padrão 0).
     * @return O tamanho máximo do campo.
     */
    int tamanho() default 0;

    /**
     * Limite de caracteres do campo (opcional, padrão 0).
     * @return
     */
    int limiteCaracteres() default 0;

    /**
     * Número de casas decimais (opcional, padrão 0).
     * @return O número de casas decimais.
     */
    int decimais() default 0;

    /**
     * Indica se o campo é obrigatório (opcional, padrão false).
     * @return true se o campo for obrigatório, false caso contrário.
     */
    boolean obrigatorio() default false;

    /**
     * Indica se o campo é obrigatório na entrada (opcional, padrão false).
     * @return true se o campo for obrigatório na entrada, false caso contrário.
     */
    boolean obrigatorioEntrada() default false;

    /**
     * Indica se o campo é obrigatório na saída (opcional, padrão false).
     * @return true se o campo for obrigatório na saída, false caso contrário.
     */
    boolean obrigatorioSaida() default false;
}