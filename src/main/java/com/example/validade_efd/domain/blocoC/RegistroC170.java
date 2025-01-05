package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CstIpi;
import com.example.validade_efd.enums.CstPis;
import com.example.validade_efd.enums.CstCofins;
import com.example.validade_efd.enums.IndicadorMovimentacaoFisica;
import com.example.validade_efd.enums.IndicadorPeriodoApuracaoIPI;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
 
@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC170 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C170\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_ITEM", descricao = "Número sequencial do item no documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numItem;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codItem;

    @Campo(numero = 4, nome = "DESCR_COMPL", descricao = "Descrição complementar do item como adotado no documento fiscal", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String descrCompl;

    @Campo(numero = 5, nome = "QTD", descricao = "Quantidade do item", tipo = TipoCampo.N, tamanho = 5, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double qtd;

    @Campo(numero = 6, nome = "UNID", descricao = "Unidade do item (Campo 02 do registro 0190)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String unid;

    @Campo(numero = 7, nome = "VL_ITEM", descricao = "Valor total do item (mercadorias ou serviços)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlItem;

    @Campo(numero = 8, nome = "VL_DESC", descricao = "Valor do desconto comercial", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlDesc;

    @Campo(numero = 9, nome = "IND_MOV", descricao = "Movimentação física do ITEM/PRODUTO: 0. SIM; 1. NÃO", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorMovimentacaoFisica indMov;

    @Campo(numero = 10, nome = "CST_ICMS", descricao = "Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 11, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 12, nome = "COD_NAT", descricao = "Código da natureza da operação (campo 02 do Registro 0400)", tipo = TipoCampo.C, tamanho = 10, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codNat;

    @Campo(numero = 13, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIcms;

    @Campo(numero = 14, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqIcms;

    @Campo(numero = 15, nome = "VL_ICMS", descricao = "Valor do ICMS creditado/debitado", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIcms;

    @Campo(numero = 16, nome = "VL_BC_ICMS_ST", descricao = "Valor da base de cálculo referente à substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIcmsSt;

    @Campo(numero = 17, nome = "ALIQ_ST", descricao = "Alíquota do ICMS da substituição tributária na unidade da federação de destino", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqSt;

    @Campo(numero = 18, nome = "VL_ICMS_ST", descricao = "Valor do ICMS referente à substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIcmsSt;

    @Campo(numero = 19, nome = "IND_APUR", descricao = "Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = false)
    private IndicadorPeriodoApuracaoIPI indApur;

    @Campo(numero = 20, nome = "CST_IPI", descricao = "Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2.", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private CstIpi cstIpi;

    @Campo(numero = 21, nome = "COD_ENQ", descricao = "Código de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3.", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codEnq;

    @Campo(numero = 22, nome = "VL_BC_IPI", descricao = "Valor da base de cálculo do IPI", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIpi;

    @Campo(numero = 23, nome = "ALIQ_IPI", descricao = "Alíquota do IPI", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqIpi;

    @Campo(numero = 24, nome = "VL_IPI", descricao = "Valor do IPI creditado/debitado", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIpi;

    @Campo(numero = 25, nome = "CST_PIS", descricao = "Código da Situação Tributária referente ao PIS.", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private CstPis cstPis;

    @Campo(numero = 26, nome = "VL_BC_PIS", descricao = "Valor da base de cálculo do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcPis;

    @Campo(numero = 27, nome = "ALIQ_PIS", descricao = "Alíquota do PIS (em percentual)", tipo = TipoCampo.N, tamanho = 8, decimais = 4, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqPis;

    @Campo(numero = 28, nome = "QUANT_BC_PIS", descricao = "Quantidade – Base de cálculo PIS", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double quantBcPis;

    @Campo(numero = 29, nome = "ALIQ_PIS_REAIS", descricao = "Alíquota do PIS (em reais)", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqPisReais;

    @Campo(numero = 30, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlPis;

    @Campo(numero = 31, nome = "CST_COFINS", descricao = "Código da Situação Tributária referente ao COFINS.", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private CstCofins cstCofins;

    @Campo(numero = 32, nome = "VL_BC_COFINS", descricao = "Valor da base de cálculo da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcCofins;

    @Campo(numero = 33, nome = "ALIQ_COFINS", descricao = "Alíquota do COFINS (em percentual)", tipo = TipoCampo.N, tamanho = 8, decimais = 4, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqCofins;

    @Campo(numero = 34, nome = "QUANT_BC_COFINS", descricao = "Quantidade – Base de cálculo COFINS", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double quantBcCofins;

    @Campo(numero = 35, nome = "ALIQ_COFINS_REAIS", descricao = "Alíquota da COFINS (em reais)", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double aliqCofinsReais;

    @Campo(numero = 36, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlCofins;

    @Campo(numero = 37, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codCta;
}