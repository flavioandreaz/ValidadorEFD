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
@MetadadosRegistro(nivelHierarquico = 1, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroK990 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K990\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "QTD_LIN_K", descricao = "Quantidade total de linhas do Bloco K", tipo = TipoCampo.N, obrigatorio = true)
    private int qtdLinK;
}