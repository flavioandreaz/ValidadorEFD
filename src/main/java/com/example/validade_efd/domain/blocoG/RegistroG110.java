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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroG110 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"G110\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI", descricao = "Data inicial a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 3, nome = "DT_FIN", descricao = "Data final a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFin;

    @Campo(numero = 4, nome = "SALDO_IN_ICMS", descricao = "Saldo inicial de ICMS do CIAP, composto por ICMS de bens que entraram anteriormente ao período de apuração (somatório dos campos 05 a 08 dos registros G125)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double saldoInIcms;

    @Campo(numero = 5, nome = "SOM_PARC", descricao = "Somatório das parcelas de ICMS passível de apropriação de cada bem (campo 10 do G125)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double somParc;

    @Campo(numero = 6, nome = "VL_TRIB_EXP", descricao = "Valor do somatório das saídas tributadas e saídas para exportação", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTribExp;

    @Campo(numero = 7, nome = "VL_TOTAL", descricao = "Valor total de saídas", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotal;

    @Campo(numero = 8, nome = "IND_PER_SAI", descricao = "Índice de participação do valor do somatório das saídas tributadas e saídas para exportação no valor total de saídas (Campo 06 dividido pelo campo 07)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private double indPerSai;

    @Campo(numero = 9, nome = "ICMS_APROP", descricao = "Valor de ICMS a ser apropriado na apuração do ICMS, correspondente á multiplicação do campo 05 pelo campo 08.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double icmsAprop;

    @Campo(numero = 10, nome = "SOM_ICMS_OC", descricao = "Valor de outros créditos a ser apropriado na Apuração do ICMS, correspondente ao somatório do campo 09 do registro G126.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double somIcmsOc;
}