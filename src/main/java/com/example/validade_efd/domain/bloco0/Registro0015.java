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
public class Registro0015 {

    @Campo(numero = 1   , nome = "REG", descricao = "Texto fixo contendo \"0015\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "UF_ST", descricao = "Sigla da unidade da federação do contribuinte substituído ou unidade de federação do consumidor final não contribuinte - ICMS Destino EC 87/15", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private String ufSt;

    @Campo(numero = 3, nome = "IE_ST", descricao = "Inscrição Estadual do contribuinte substituto na unidade da federação do contribuinte substituído ou unidade de federação do consumidor final não contribuinte - ICMS Destino EC 87/15", tipo = TipoCampo.C, tamanho = 14, obrigatorio = true)
    private String ieSt;
}
