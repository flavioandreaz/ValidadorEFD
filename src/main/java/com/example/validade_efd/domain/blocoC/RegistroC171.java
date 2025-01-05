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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC171 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C171\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = false)
    private String reg;

    @Campo(numero = 2, nome = "NUM_TANQUE", descricao = "Tanque onde foi armazenado o combustível", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = false)
    private String numTanque;

    @Campo(numero = 3, nome = "QTDE", descricao = "Quantidade ou volume armazenado", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = false)
    private double qtde;
}