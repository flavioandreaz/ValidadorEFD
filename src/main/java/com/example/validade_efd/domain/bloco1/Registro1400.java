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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1400 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1400\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM_IPM", descricao = "Código do item (Tabela própria da unidade da federação (Tabela de Itens UF Índice de Participação dos Municípios) ou campo 02 do Registro 0200", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemIpm;

    @Campo(numero = 3, nome = "MUN", descricao = "Código do Município de origem/destino", tipo = TipoCampo.N, tamanho = 7, obrigatorio = true)
    private int mun;

    @Campo(numero = 4, nome = "VALOR", descricao = "Valor mensal correspondente ao município", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double valor;
}