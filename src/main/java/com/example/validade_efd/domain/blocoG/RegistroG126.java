package com.example.validade_efd.domain.blocoG;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroG126 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"G126\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI", descricao = "Data inicial do período de apuração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 3, nome = "DT_FIM", descricao = "Data final do período de apuração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFim;

    @Campo(numero = 4, nome = "NUM_PARC", descricao = "Número da parcela do ICMS", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int numParc;

    @Campo(numero = 5, nome = "VL_PARC_PASS", descricao = "Valor da parcela de ICMS passível de apropriação - antes da aplicação da participação percentual do valor das saídas tributadas/exportação sobre as saídas totais", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlParcPass;

    @Campo(numero = 6, nome = "VL_TRIB_OC", descricao = "Valor do somatório das saídas tributadas e saídas para exportação no período indicado neste registro", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTribOc;

    @Campo(numero = 7, nome = "VL_TOTAL", descricao = "Valor total de saídas no período indicado neste registro", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotal;

    @Campo(numero = 8, nome = "IND_PER_SAI", descricao = "Índice de participação do valor do somatório das saídas tributadas e saídas para exportação no valor total de saídas (Campo 06 dividido pelo campo 07)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private double indPerSai;

    @Campo(numero = 9, nome = "VL_PARC_APROP", descricao = "Valor de outros créditos de ICMS a ser apropriado na apuração (campo 05 vezes o campo 08)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlParcAprop;
}