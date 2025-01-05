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
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC425 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C425\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codItem;

    @Campo(numero = 3, nome = "QTD", descricao = "Quantidade acumulada do item", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double qtd;

    @Campo(numero = 4, nome = "UNID", descricao = "Unidade do item (Campo 02 do registro 0190)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String unid;

    @Campo(numero = 5, nome = "VL_ITEM", descricao = "Valor acumulado do item", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlItem;

    @Campo(numero = 6, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 7, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;
}