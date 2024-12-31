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
public class Registro0450 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0450\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_INF", descricao = "Código da informação complementar do documento fiscal.", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String codInf;

    @Campo(numero = 3, nome = "TXT", descricao = "Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo.", tipo = TipoCampo.C, obrigatorio = true)
    private String txt;
}