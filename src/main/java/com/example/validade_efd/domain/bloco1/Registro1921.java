package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoAjusteSubApuracao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1921 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1921\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_AJ_APUR", descricao = "Código do ajuste da SUB-APURAÇÃO e dedução, conforme a Tabela indicada no item 5.1.1.", tipo = TipoCampo.C, tamanho = 8, obrigatorio = true)
    private CodigoAjusteSubApuracao codAjApur;

    @Campo(numero = 3, nome = "DESCR_COMPL_AJ", descricao = "Descrição complementar do ajuste da apuração.", tipo = TipoCampo.C, obrigatorio = false)
    private String descrComplAj;

    @Campo(numero = 4, nome = "VL_AJ_APUR", descricao = "Valor do ajuste da apuração", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjApur;
}