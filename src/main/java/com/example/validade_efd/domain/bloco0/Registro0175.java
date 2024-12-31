package com.example.validade_efd.domain.bloco0;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

import java.time.LocalDate;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro0175 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0175\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_ALT", descricao = "Data de alteração do cadastro", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtAlt;

    @Campo(numero = 3, nome = "NR_CAMPO", descricao = "Número do campo alterado (campos 03 a 13, exceto 07)", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private String nrCampo;

    @Campo(numero = 4, nome = "CONT_ANT", descricao = "Conteúdo anterior do campo", tipo = TipoCampo.C, tamanho = 100, obrigatorio = true)
    private String contAnt;
}
