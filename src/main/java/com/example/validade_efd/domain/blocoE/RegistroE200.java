package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE200 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E200\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "UF", descricao = "Sigla da unidade da federação a que se refere a apuração do ICMS ST", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private UnidadeFederativa uf;

    @Campo(numero = 3, nome = "DT_INI", descricao = "Data inicial a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 4, nome = "DT_FIN", descricao = "Data final a que a apuração se refere", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFin;
}