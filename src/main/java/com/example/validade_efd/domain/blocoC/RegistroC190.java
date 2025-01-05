package com.example.validade_efd.domain.blocoC;

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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC190 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C190\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 3, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação do agrupamento de itens", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 4, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 5, nome = "VL_OPR", descricao = "Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlOpr;

    @Campo(numero = 6, nome = "VL_BC_ICMS", descricao = "Parcela correspondente ao \"Valor da base de cálculo do ICMS\" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 7, nome = "VL_ICMS", descricao = "Parcela correspondente ao \"Valor do ICMS\" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 8, nome = "VL_BC_ICMS_ST", descricao = "Parcela correspondente ao \"Valor da base de cálculo do ICMS\" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcmsSt;

    @Campo(numero = 9, nome = "VL_ICMS_ST", descricao = "Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcmsSt;

    @Campo(numero = 10, nome = "VL_RED_BC", descricao = "Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlRedBc;

    @Campo(numero = 11, nome = "VL_IPI", descricao = "Parcela correspondente ao \"Valor do IPI\" referente à combinação CST_ICMS, CFOP e alíquota do ICMS.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIpi;

    @Campo(numero = 12, nome = "COD_OBS", descricao = "Código da observação do lançamento fiscal (campo 02 do Registro 0460)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codObs;
}