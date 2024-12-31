package com.example.validade_efd.domain.bloco0;

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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro0600 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0600\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_ALT", descricao = "Data da inclusão/alteração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtAlt;

    @Campo(numero = 3, nome = "COD_CCUS", descricao = "Código do centro de custos", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codCcus;

    @Campo(numero = 4, nome = "CCUS", descricao = "Nome do centro de custos", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String ccus;
}