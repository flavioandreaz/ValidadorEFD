package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD410 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D410\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 4, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int sub;

    @Campo(numero = 5, nome = "NUM_DOC_INI", descricao = "Número do documento fiscal inicial (mesmo modelo, série e subsérie)", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocIni;

    @Campo(numero = 6, nome = "NUM_DOC_FIN", descricao = "Número do documento fiscal final (mesmo modelo, série e subsérie)", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocFin;

    @Campo(numero = 7, nome = "DT_DOC", descricao = "Data da emissão dos documentos fiscais", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 8, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 9, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 10, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 11, nome = "VL_OPR", descricao = "Valor total acumulado das operações correspondentes à combinação de CST_ICMS, CFOP e alíquota do ICMS, incluídas as despesas acessórias e acréscimos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlOpr;

    @Campo(numero = 12, nome = "VL_DESC", descricao = "Valor acumulado dos descontos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 13, nome = "VL_SERV", descricao = "Valor acumulado da prestação de serviço", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlServ;

    @Campo(numero = 14, nome = "VL_BC_ICMS", descricao = "Valor acumulado da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 15, nome = "VL_ICMS", descricao = "Valor acumulado do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;
}