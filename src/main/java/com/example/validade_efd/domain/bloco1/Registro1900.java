package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorApuracaoICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1900 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1900\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_APUR_ICMS", descricao = "Indicador de outra apuração do ICMS", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorApuracaoICMS indApurIcms;

    @Campo(numero = 3, nome = "DESCR_COMPL_OUT_APUR", descricao = "Descrição complementar de Outra Apuração do ICMS", tipo = TipoCampo.C, obrigatorio = true)
    private String descrComplOutApur;
}