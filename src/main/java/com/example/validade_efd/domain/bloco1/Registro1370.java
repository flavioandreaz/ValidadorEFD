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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1370 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1370\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_BICO", descricao = "Número sequencial do bico ligado a bomba", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int numBico;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do Produto, constante do registro 0200", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "NUM_TANQUE", descricao = "Tanque que armazena o combustível", tipo = TipoCampo.C, tamanho = 3, obrigatorio = true)
    private String numTanque;
}