package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoSituacaoTributariaIPI;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE510 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E510\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação do agrupamento de itens", tipo = TipoCampo.N, tamanho = 4, obrigatorio = true)
    private int cfop;

    @Campo(numero = 3, nome = "CST_IPI", descricao = "Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2.", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private CodigoSituacaoTributariaIPI cstIpi;

    @Campo(numero = 4, nome = "VL_CONT_IPI", descricao = "Parcela correspondente ao \"Valor Contábil\" referente ao CFOP e ao Código de Tributação do IPI", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlContIpi;

    @Campo(numero = 5, nome = "VL_BC_IPI", descricao = "Parcela correspondente ao \"Valor da base de cálculo do IPI\" referente ao CFOP e ao Código de Tributação do IPI, para operações tributadas", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlBcIpi;

    @Campo(numero = 6, nome = "VL_IPI", descricao = "Parcela correspondente ao \"Valor do IPI\" referente ao CFOP e ao Código de Tributação do IPI, para operações tributadas", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIpi;
}