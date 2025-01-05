package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoMedicao;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1350 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1350\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "SERIE", descricao = "Número de Série da Bomba", tipo = TipoCampo.C, obrigatorio = true)
    private String serie;

    @Campo(numero = 3, nome = "FABRICANTE", descricao = "Nome do Fabricante da Bomba", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String fabricante;

    @Campo(numero = 4, nome = "MODELO", descricao = "Modelo da Bomba", tipo = TipoCampo.C, obrigatorio = true)
    private String modelo;

    @Campo(numero = 5, nome = "TIPO_MEDICAO", descricao = "Identificador de medição: 0 - analógico; 1 – digital", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private TipoMedicao tipoMedicao;
}