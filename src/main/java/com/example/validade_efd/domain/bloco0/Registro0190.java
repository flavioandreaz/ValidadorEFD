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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro0190 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0190\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "UNID", descricao = "Código da unidade de medida", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String unid;

    @Campo(numero = 3, nome = "DESCR", descricao = "Descrição da unidade de medida", tipo = TipoCampo.C, obrigatorio = true)
    private String descr;
}
