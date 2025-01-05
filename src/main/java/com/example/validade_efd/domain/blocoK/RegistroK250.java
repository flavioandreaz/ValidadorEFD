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
public class RegistroK250 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K250\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_PROD", descricao = "Data do reconhecimento da produção ocorrida no terceiro", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtProd;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item produzido (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "QTD", descricao = "Quantidade produzida", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtd;
}