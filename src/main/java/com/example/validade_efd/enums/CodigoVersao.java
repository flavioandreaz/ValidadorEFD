package com.example.validade_efd.enums;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Arrays;

@Getter
@ToString
public enum CodigoVersao {
    V001("001", "100", LocalDate.of(2008, 1, 1)),
    V002("002", "101", LocalDate.of(2009, 1, 1)),
    V003("003", "102", LocalDate.of(2010, 1, 1)),
    V004("004", "103", LocalDate.of(2011, 1, 1)),
    V005("005", "104", LocalDate.of(2012, 1, 1)),
    V006("006", "105", LocalDate.of(2012, 7, 1)),
    V007("007", "106", LocalDate.of(2013, 1, 1)),
    V008("008", "107", LocalDate.of(2014, 1, 1)),
    V009("009", "108", LocalDate.of(2015, 1, 1)),
    V010("010", "109", LocalDate.of(2016, 1, 1)),
    V011("011", "110", LocalDate.of(2017, 1, 1)),
    V012("012", "111", LocalDate.of(2018, 1, 1));

    private final String codigo;
    private final String versao;
    private final LocalDate obrigatoriedade;

    CodigoVersao(String codigo, String versao, LocalDate obrigatoriedade) {
        this.codigo = codigo;
        this.versao = versao;
        this.obrigatoriedade = obrigatoriedade;
    }

    static CodigoVersao fromCodigo(String codigo) {
        return Arrays.stream(values())
        .filter(codigoVersao -> codigoVersao.getCodigo().equals(codigo))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Código de versão inválido: " + codigo));
    }
}