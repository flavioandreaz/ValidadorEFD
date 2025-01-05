package com.example.validade_efd.domain.blocoH;

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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroH020 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"H020\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "CST_ICMS", descricao = "Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int cstIcms;

    @Campo(numero = 3, nome = "BC_ICMS", descricao = "Informe a base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double bcIcms;

    @Campo(numero = 4, nome = "VL_ICMS", descricao = "Informe o valor do ICMS a ser debitado ou creditado", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcms;
}