package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.CodigoAjusteApuracaoICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1200 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1200\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_AJ_APUR", descricao = "Código de ajuste, conforme informado na Tabela indicada no item 5.1.1.", tipo = TipoCampo.C, tamanho = 8, obrigatorio = true)
    private CodigoAjusteApuracaoICMS codAjApur;

    @Campo(numero = 3, nome = "SLD_CRED", descricao = "Saldo de créditos fiscais de períodos anteriores", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double sldCred;

    @Campo(numero = 4, nome = "CRED_APR", descricao = "Total de crédito apropriado no mês", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double credApr;

    @Campo(numero = 5, nome = "CRED_RECEB", descricao = "Total de créditos recebidos por transferência", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double credReceb;

    @Campo(numero = 6, nome = "CRED_UTIL", descricao = "Total de créditos utilizados no período", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double credUtil;

    @Campo(numero = 7, nome = "SLD_CRED_FIM", descricao = "Saldo de crédito fiscal acumulado a transportar para o período seguinte", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double sldCredFim;
}