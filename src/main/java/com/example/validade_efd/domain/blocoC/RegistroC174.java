package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoArmaFogo;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC174 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C174\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_ARM", descricao = "Indicador do tipo da arma de fogo: 0- Uso permitido; 1- Uso restrito", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoArmaFogo indArm;

    @Campo(numero = 3, nome = "NUM_ARM", descricao = "Numeração de série de fabricação da arma", tipo = TipoCampo.C, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String numArm;

    @Campo(numero = 4, nome = "DESCR_COMPL", descricao = "Descrição da arma, compreendendo: número do cano, calibre, marca, capacidade de cartuchos, tipo de funcionamento, quantidade de canos, comprimento, tipo de alma, quantidade e sentido das raias e demais elementos que permitam sua perfeita identificação", tipo = TipoCampo.C, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String descrCompl;
}