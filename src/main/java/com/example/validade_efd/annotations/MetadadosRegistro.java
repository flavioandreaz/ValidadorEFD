package com.example.validade_efd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.validade_efd.enums.OcorrenciaRegistro;

/**
 * Anotação para definir metadados de um registro dentro do arquivo EFD.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MetadadosRegistro {

    /**
     * Nível hierárquico do registro dentro do arquivo EFD.
     * 0 para o registro de abertura (0000), 1 para registros de nível 1, etc.
     */
    int nivelHierarquico();

    /**
     * Indica quantas vezes o registro pode ocorrer no arquivo EFD.
     */
    OcorrenciaRegistro ocorrencia();
}