package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorMovimento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 1, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroE001 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E001\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_MOV", descricao = "Indicador de movimento", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorMovimento indMov;
}