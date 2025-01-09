package com.example.validade_efd.domain.blocoD;

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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD190 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D190\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 3, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação, conforme a tabela indicada no item 4.2.2", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 4, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 5, nome = "VL_OPR", descricao = "Valor da operação correspondente à combinação de CST_ICMS, CFOP, e alíquota do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlOpr;

    @Campo(numero = 6, nome = "VL_BC_ICMS", descricao = "Parcela correspondente ao \"Valor da base de cálculo do ICMS\" referente à combinação CST_ICMS, CFOP, e alíquota do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 7, nome = "VL_ICMS", descricao = "Parcela correspondente ao \"Valor do ICMS\" referente à combinação CST_ICMS, CFOP e alíquota do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 8, nome = "VL_RED_BC", descricao = "Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlRedBc;

    @Campo(numero = 9, nome = "COD_OBS", descricao = "Código da observação do lançamento fiscal (campo 02 do Registro 0460)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codObs;
}