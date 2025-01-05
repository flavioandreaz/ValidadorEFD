package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC130 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C130\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_SERV_NT", descricao = "Valor dos serviços sob não-incidência ou não-tributados pelo ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlServNt;

    @Campo(numero = 3, nome = "VL_BC_ISSQN", descricao = "Valor da base de cálculo do ISSQN", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIssqn;

    @Campo(numero = 4, nome = "VL_ISSQN", descricao = "Valor do ISSQN", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIssqn;

    @Campo(numero = 5, nome = "VL_BC_IRRF", descricao = "Valor da base de cálculo do Imposto de Renda Retido na Fonte", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIrrf;

    @Campo(numero = 6, nome = "VL_IRRF", descricao = "Valor do Imposto de Renda - Retido na Fonte", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIrrf;

    @Campo(numero = 7, nome = "VL_BC_PREV", descricao = "Valor da base de cálculo de retenção da Previdência Social", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcPrev;

    @Campo(numero = 8, nome = "VL_PREV", descricao = "Valor destacado para retenção da Previdência Social", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlPrev;
}