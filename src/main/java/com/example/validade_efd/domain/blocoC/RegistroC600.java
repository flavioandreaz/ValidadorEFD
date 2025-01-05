package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.CodigoConsumo;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroC600 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C600\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "COD_MUN", descricao = "Código do município dos pontos de consumo, conforme a tabela IBGE", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int codMun;

    @Campo(numero = 4, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 5, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int sub;

    @Campo(numero = 6, nome = "COD_CONS", descricao = "Código de classe de consumo de energia elétrica ou gás", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoConsumo codCons;

    @Campo(numero = 7, nome = "QTD_CONS", descricao = "Quantidade de documentos consolidados neste registro", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int qtdCons;

    @Campo(numero = 8, nome = "QTD_CANC", descricao = "Quantidade de documentos cancelados", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int qtdCanc;

    @Campo(numero = 9, nome = "DT_DOC", descricao = "Data dos documentos consolidados", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String dtDoc;

    @Campo(numero = 10, nome = "VL_DOC", descricao = "Valor total dos documentos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 11, nome = "VL_DESC", descricao = "Valor acumulado dos descontos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 12, nome = "CONS", descricao = "Consumo total acumulado, em kWh (Código 06)", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int cons;

    @Campo(numero = 13, nome = "VL_FORN", descricao = "Valor acumulado do fornecimento", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlForn;

    @Campo(numero = 14, nome = "VL_SERV_NT", descricao = "Valor acumulado dos serviços não-tributados pelo ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlServNt;

    @Campo(numero = 15, nome = "VL_TERC", descricao = "Valores cobrados em nome de terceiros", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlTerc;

    @Campo(numero = 16, nome = "VL_DA", descricao = "Valor acumulado das despesas acessórias", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDa;

    @Campo(numero = 17, nome = "VL_BC_ICMS", descricao = "Valor acumulado da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 18, nome = "VL_ICMS", descricao = "Valor acumulado do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 19, nome = "VL_BC_ICMS_ST", descricao = "Valor acumulado da base de cálculo do ICMS substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcmsSt;

    @Campo(numero = 20, nome = "VL_ICMS_ST", descricao = "Valor acumulado do ICMS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcmsSt;

    @Campo(numero = 21, nome = "VL_PIS", descricao = "Valor acumulado do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 22, nome = "VL_COFINS", descricao = "Valor acumulado COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;
}