package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoServico;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC610 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C610\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_CLASS", descricao = "Código de classificação do item de energia elétrica, conforme Tabela 4.4.1", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private CodigoServico codClass;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codItem;

    @Campo(numero = 4, nome = "QTD", descricao = "Quantidade acumulada do item", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double qtd;

    @Campo(numero = 5, nome = "UNID", descricao = "Unidade do item (Campo 02 do registro 0190)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String unid;

    @Campo(numero = 6, nome = "VL_ITEM", descricao = "Valor acumulado do item", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlItem;

    @Campo(numero = 7, nome = "VL_DESC", descricao = "Valor acumulado dos descontos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 8, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 9, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2.", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 10, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 11, nome = "VL_BC_ICMS", descricao = "Valor acumulado da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 12, nome = "VL_ICMS", descricao = "Valor acumulado do ICMS debitado", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 13, nome = "VL_BC_ICMS_ST", descricao = "Valor da base de cálculo do ICMS substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcmsSt;

    @Campo(numero = 14, nome = "VL_ICMS_ST", descricao = "Valor do ICMS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcmsSt;

    @Campo(numero = 15, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 16, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;

    @Campo(numero = 17, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codCta;
}