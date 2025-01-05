package com.example.validade_efd.domain.blocoC;

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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC177 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C177\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_SELO_IPI", descricao = "Código do selo de controle do IPI, conforme Tabela 4.5.2", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codSeloIpi;

    @Campo(numero = 3, nome = "QT_SELO_IPI", descricao = "Quantidade de selo de controle do IPI aplicada", tipo = TipoCampo.N, tamanho = 12, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int qtSeloIpi;
}