package com.example.validade_efd.domain.bloco0;

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
public class Registro0220 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0220\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "UNID_CONV", descricao = "Unidade comercial a ser convertida na unidade de estoque, referida no registro 0200.", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String unidConv;

    @Campo(numero = 3, nome = "FAT_CONV", descricao = "Fator de conversão: fator utilizado para converter (multiplicar) a unidade a ser convertida na unidade adotada no inventário.", tipo = TipoCampo.N, tamanho = 6, obrigatorio = true)
    private double fatConv;
}