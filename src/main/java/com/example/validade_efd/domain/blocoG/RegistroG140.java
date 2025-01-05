package com.example.validade_efd.domain.blocoG;

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
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroG140 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"G140\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_ITEM", descricao = "Número sequencial do item no documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int numItem;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código correspondente do bem no documento fiscal (campo 02 do registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;
}