package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1800 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1800\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_CARGA", descricao = "Valor das prestações cargas (Tributado)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlCarga;

    @Campo(numero = 3, nome = "VL_PASS", descricao = "Valor das prestações passageiros/cargas (Não Tributado)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlPass;

    @Campo(numero = 4, nome = "VL_FAT", descricao = "Valor total do faturamento (2+3)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlFat;

    @Campo(numero = 5, nome = "IND_RAT", descricao = "Índice para rateio(2 / 4)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private double indRat;

    @Campo(numero = 6, nome = "VL_ICMS_ANT", descricao = "Valor total dos créditos do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcmsAnt;

    @Campo(numero = 7, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlBcIcms;

    @Campo(numero = 8, nome = "VL_ICMS_APUR", descricao = "Valor do ICMS apurado no cálculo (5 x 6)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcmsApur;

    @Campo(numero = 9, nome = "VL_BC_ICMS_APUR", descricao = "Valor da base de cálculo do ICMS apurada (5 x 7)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlBcIcmsApur;

    @Campo(numero = 10, nome = "VL_DIF", descricao = "Valor da diferença a ser levada a estorno de crédito na apuração (6 - 8)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDif;
}