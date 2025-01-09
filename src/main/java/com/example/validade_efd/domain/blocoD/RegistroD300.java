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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroD300 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D300\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 4, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int sub;

    @Campo(numero = 5, nome = "NUM_DOC_INI", descricao = "Número do primeiro documento fiscal emitido (mesmo modelo, série e subsérie)", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocIni;

    @Campo(numero = 6, nome = "NUM_DOC_FIN", descricao = "Número do último documento fiscal emitido (mesmo modelo, série e subsérie)", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocFin;

    @Campo(numero = 7, nome = "CST_ICMS", descricao = "Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cstIcms;

    @Campo(numero = 8, nome = "CFOP", descricao = "Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2", tipo = TipoCampo.N, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cfop;

    @Campo(numero = 9, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 10, nome = "DT_DOC", descricao = "Data da emissão dos documentos fiscais", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 11, nome = "VL_OPR", descricao = "Valor total acumulado das operações correspondentes à combinação de CST_ICMS, CFOP e alíquota do ICMS, incluídas as despesas acessórias e acréscimos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlOpr;

    @Campo(numero = 12, nome = "VL_DESC", descricao = "Valor total dos descontos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 13, nome = "VL_SERV", descricao = "Valor total da prestação de serviço", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlServ;

    @Campo(numero = 14, nome = "VL_SEG", descricao = "Valor de seguro", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlSeg;

    @Campo(numero = 15, nome = "VL_OUT_DESP", descricao = "Valor de outras despesas", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOutDesp;

    @Campo(numero = 16, nome = "VL_BC_ICMS", descricao = "Valor total da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 17, nome = "VL_ICMS", descricao = "Valor total do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 18, nome = "VL_RED_BC", descricao = "Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlRedBc;

    @Campo(numero = 19, nome = "COD_OBS", descricao = "Código da observação do lançamento fiscal (campo 02 do Registro 0460)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codObs;

    @Campo(numero = 20, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codCta;
}