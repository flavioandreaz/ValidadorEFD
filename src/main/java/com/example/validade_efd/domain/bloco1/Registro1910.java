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
public class Registro1910 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1910\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI", descricao = "Data inicial da sub-apuração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 3, nome = "DT_FIN", descricao = "Data final da sub-apuração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFin;
}