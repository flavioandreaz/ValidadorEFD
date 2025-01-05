package com.example.validade_efd.domain.bloco1;

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
public class Registro1710 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1710\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_DOC_INI", descricao = "Número do dispositivo autorizado (inutilizado) inicial", tipo = TipoCampo.N, tamanho = 12, obrigatorio = true)
    private long numDocIni;

    @Campo(numero = 3, nome = "NUM_DOC_FIN", descricao = "Número do dispositivo autorizado (inutilizado) final", tipo = TipoCampo.N, tamanho = 12, obrigatorio = true)
    private long numDocFin;
}