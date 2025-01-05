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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC172 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C172\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_BC_ISSQN", descricao = "Valor da base de cálculo do ISSQN", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIssqn;

    @Campo(numero = 3, nome = "ALIQ_ISSQN", descricao = "Alíquota do ISSQN", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double aliqIssqn;

    @Campo(numero = 4, nome = "VL_ISSQN", descricao = "Valor do ISSQN", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIssqn;
}