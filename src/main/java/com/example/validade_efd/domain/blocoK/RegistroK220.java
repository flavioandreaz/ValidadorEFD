package com.example.validade_efd.domain.blocoK;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK220 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K220\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_MOV", descricao = "Data da movimentação interna", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtMov;

    @Campo(numero = 3, nome = "COD_ITEM_ORI", descricao = "Código do item de origem (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemOri;

    @Campo(numero = 4, nome = "COD_ITEM_DEST", descricao = "Código do item de destino (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemDest;

    @Campo(numero = 5, nome = "QTD_ORI", descricao = "Quantidade movimentada do item de origem", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdOri;

    @Campo(numero = 6, nome = "QTD_DEST", descricao = "Quantidade movimentada do item de destino", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdDest;
}