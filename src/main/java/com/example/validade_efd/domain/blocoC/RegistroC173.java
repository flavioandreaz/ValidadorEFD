package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoReferenciaIcms;
import com.example.validade_efd.enums.TipoProduto;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC173 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C173\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "LOTE_MED", descricao = "Número do lote de fabricação do medicamento", tipo = TipoCampo.C, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String loteMed;

    @Campo(numero = 3, nome = "QTD_ITEM", descricao = "Quantidade de item por lote", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int qtdItem;

    @Campo(numero = 4, nome = "DT_FAB", descricao = "Data de fabricação do medicamento", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtFab;

    @Campo(numero = 5, nome = "DT_VAL", descricao = "Data de expiração da validade do medicamento", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtVal;

    @Campo(numero = 6, nome = "IND_MED", descricao = "Indicador de tipo de referência da base de cálculo do ICMS (ST) do produto farmacêutico: 0- Base de cálculo referente ao preço tabelado ou preço máximo sugerido; 1- Base cálculo – Margem de valor agregado; 2- Base de cálculo referente à Lista Negativa; 3- Base de cálculo referente à Lista Positiva; 4- Base de cálculo referente à Lista Neutra", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoReferenciaIcms indMed;

    @Campo(numero = 7, nome = "TP_PROD", descricao = "Tipo de produto: 0- Similar; 1- Genérico; 2- Ético ou de marca", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private TipoProduto tpProd;

    @Campo(numero = 8, nome = "VL_TAB_MAX", descricao = "Valor do preço tabelado ou valor do preço máximo", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlTabMax;
}