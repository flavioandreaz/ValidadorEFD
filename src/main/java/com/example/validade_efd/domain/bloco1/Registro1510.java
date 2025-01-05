package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.ClassificacaoItemEnergiaEletrica;
import com.example.validade_efd.enums.IndicadorReceita;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1510 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1510\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_ITEM", descricao = "Número sequencial do item no documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int numItem;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "COD_CLASS", descricao = "Código de classificação do item de energia elétrica, conforme a Tabela 4.4.1", tipo = TipoCampo.N, tamanho = 4, obrigatorio = true)
    private ClassificacaoItemEnergiaEletrica codClass;

    @Campo(numero = 5, nome = "QTD", descricao = "Quantidade do item", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Double qtd;

    @Campo(numero = 6, nome = "UNID", descricao = "Unidade do item (Campo 02 do registro 0190)", tipo = TipoCampo.C, tamanho = 6, obrigatorio = false)
    private String unid;

    @Campo(numero = 7, nome = "VL_ITEM", descricao = "Valor do item", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlItem;

    @Campo(numero = 8, nome = "VL_DESC", descricao = "Valor total do desconto", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlDesc;

    @Campo(numero = 9, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int cstIcms;

    @Campo(numero = 10, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação", tipo = TipoCampo.N, tamanho = 4, obrigatorio = true)
    private int cfop;

    @Campo(numero = 11, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlBcIcms;

    @Campo(numero = 12, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, obrigatorio = false)
    private Double aliqIcms;

    @Campo(numero = 13, nome = "VL_ICMS", descricao = "Valor do ICMS creditado/debitado", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlIcms;

    @Campo(numero = 14, nome = "VL_BC_ICMS_ST", descricao = "Valor da base de cálculo referente à substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlBcIcmsSt;

    @Campo(numero = 15, nome = "ALIQ_ST", descricao = "Alíquota do ICMS da substituição tributária na unidade da federação de destino", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double aliqSt;

    @Campo(numero = 16, nome = "VL_ICMS_ST", descricao = "Valor do ICMS referente à substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlIcmsSt;

    @Campo(numero = 17, nome = "IND_REC", descricao = "Indicador do tipo de receita: 0- Receita própria; 1- Receita de terceiros", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorReceita indRec;

    @Campo(numero = 18, nome = "COD_PART", descricao = "Código do participante receptor da receita, terceiro da operação (campo 02 do Registro 0150)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codPart;

    @Campo(numero = 19, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlPis;

    @Campo(numero = 20, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlCofins;

    @Campo(numero = 21, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorio = false)
    private String codCta;
}