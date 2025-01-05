package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorPeriodoApuracaoIPI;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroE500 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E500\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_APUR", descricao = "Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorPeriodoApuracaoIPI indApur;

    @Campo(numero = 3, nome = "DT_INI", descricao = "Data inicial a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 4, nome = "DT_FIN", descricao = "Data final a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFin;
}