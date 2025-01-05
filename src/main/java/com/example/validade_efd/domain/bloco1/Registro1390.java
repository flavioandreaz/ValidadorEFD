package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoProduto;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1390 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1390\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PROD", descricao = "Código do produto: 01 – Álcool Etílico Hidratado Carburante, 02 - Álcool Etílico Anidro Carburante, 03 – Açúcar", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private CodigoProduto codProd;
}