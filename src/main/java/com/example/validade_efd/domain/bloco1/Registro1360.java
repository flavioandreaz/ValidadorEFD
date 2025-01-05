package com.example.validade_efd.domain.bloco1;

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
public class Registro1360 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1360\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_LACRE", descricao = "Número do Lacre associado na Bomba", tipo = TipoCampo.C, tamanho = 20, obrigatorio = true)
    private String numLacre;

    @Campo(numero = 3, nome = "DT_APLICACAO", descricao = "Data de aplicação do Lacre", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtAplicacao;
}