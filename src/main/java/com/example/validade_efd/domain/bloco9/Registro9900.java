package com.example.validade_efd.domain.bloco9;

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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro9900 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"9900\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "REG_BLC", descricao = "Registro que será totalizado no próximo campo", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String regBlc;

    @Campo(numero = 3, nome = "QTD_REG_BLC", descricao = "Total de registros do tipo informado no campo anterior", tipo = TipoCampo.N, obrigatorio = true)
    private int qtdRegBlc;
}