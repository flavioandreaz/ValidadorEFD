package com.example.validade_efd.domain.bloco1;

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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1600 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1600\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): identificação da administradora do cartão de débito/crédito", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codPart;

    @Campo(numero = 3, nome = "TOT_CREDITO", descricao = "Valor total das operações realizadas no período referente a Cartão de Crédito", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double totCredito;

    @Campo(numero = 4, nome = "TOT_DEBITO", descricao = "Valor total das operações realizadas no período referente a Cartão de Débito", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double totDebito;
}