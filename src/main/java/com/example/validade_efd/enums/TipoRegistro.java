package com.example.validade_efd.enums;

import java.util.Arrays;
import com.example.validade_efd.validator.Validador;
import com.example.validade_efd.validator.ValidadorRegistro0001;
import com.example.validade_efd.validator.ValidadorRegistro0000;
import lombok.Getter;
import lombok.ToString;
@ToString
@Getter
public enum TipoRegistro {
    REGISTRO_0000("0000", new ValidadorRegistro0000()),
    REGISTRO_0001("0001", new ValidadorRegistro0001()); 

    private final String identificador;
    private final Validador validador;

    TipoRegistro(String identificador, Validador validador) {
        this.identificador = identificador;
        this.validador = validador;
    }

    public static TipoRegistro fromIdentificador(String identificador) {
        return Arrays.stream(TipoRegistro.values())
                .filter(tipo -> tipo.identificador.equals(identificador))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Identificador de Registro inválido: " + identificador));
    }
}
