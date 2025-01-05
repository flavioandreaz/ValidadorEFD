package com.example.validade_efd.domain.blocoK;

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
public class RegistroK215 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K215\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM_DES", descricao = "Código do item de destino (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemDes;

    @Campo(numero = 3, nome = "QTD_DES", descricao = "Quantidade de destino – entrada em estoque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdDes;
}