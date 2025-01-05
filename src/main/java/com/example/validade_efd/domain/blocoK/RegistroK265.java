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
public class RegistroK265 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K265\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM", descricao = "Código da mercadoria (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 3, nome = "QTD_CONS", descricao = "Quantidade consumida – saída do estoque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdCons;

    @Campo(numero = 4, nome = "QTD_RET", descricao = "Quantidade retornada – entrada em estoque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdRet;
}