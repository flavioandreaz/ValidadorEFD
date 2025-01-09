package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoTotalizador;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroD365 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D365\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_TOT_PAR", descricao = "Código do totalizador, conforme Tabela 4.4.6", tipo = TipoCampo.C, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoTotalizador codTotPar;

    @Campo(numero = 3, nome = "VLR_ACUM_TOT", descricao = "Valor acumulado no totalizador, relativo à respectiva Redução Z", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlrAcumTot;

    @Campo(numero = 4, nome = "NR_TOT", descricao = "Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int nrTot;

    @Campo(numero = 5, nome = "DESCR_NR_TOT", descricao = "Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String descrNrTot;
}