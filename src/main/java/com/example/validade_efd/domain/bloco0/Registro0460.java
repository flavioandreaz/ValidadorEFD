package com.example.validade_efd.domain.bloco0;

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
public class Registro0460 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0460\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_OBS", descricao = "Código da Observação do lançamento fiscal.", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String codObs;

    @Campo(numero = 3, nome = "TXT", descricao = "Descrição da observação vinculada ao lançamento fiscal.", tipo = TipoCampo.C, obrigatorio = true)
    private String txt;
}