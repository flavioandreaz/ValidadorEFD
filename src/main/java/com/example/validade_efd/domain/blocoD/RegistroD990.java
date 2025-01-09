package com.example.validade_efd.domain.blocoD;

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
@MetadadosRegistro(nivelHierarquico = 1, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroD990 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D990\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "QTD_LIN_D", descricao = "Quantidade total de linhas do Bloco D", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int qtdLinD;
}