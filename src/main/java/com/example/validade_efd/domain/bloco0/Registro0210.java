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
public class Registro0210 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0210\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM_COMP", descricao = "Código do item componente/insumo (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemComp;

    @Campo(numero = 3, nome = "QTD_COMP", descricao = "Quantidade do item componente/insumo para se produzir uma unidade do item composto/resultante", tipo = TipoCampo.N, tamanho = 6, obrigatorio = true)
    private double qtdComp;

    @Campo(numero = 4, nome = "PERDA", descricao = "Perda/quebra normal percentual do insumo/componente para se produzir uma unidade do item composto/resultante", tipo = TipoCampo.N, tamanho = 4, obrigatorio = true)
    private double perda;
}