package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD697 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D697\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "UF", descricao = "Sigla da unidade da federação", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private UnidadeFederativa uf;

    @Campo(numero = 3, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 4, nome = "VL_ICMS", descricao = "Valor do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;
}