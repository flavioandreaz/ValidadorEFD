package com.example.validade_efd.domain.blocoK;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK260 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K260\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_OP_OS", descricao = "Código de identificação da ordem de produção, no reprocessamento, ou da ordem de serviço, no reparo", tipo = TipoCampo.C, tamanho = 30, obrigatorio = false)
    private String codOpOs;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do produto/insumo a ser reprocessado/reparado ou já reprocessado/reparado (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "DT_SAIDA", descricao = "Data de saída do estoque", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtSaida;

    @Campo(numero = 5, nome = "QTD_SAIDA", descricao = "Quantidade de saída do estoque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdSaida;

    @Campo(numero = 6, nome = "DT_RET", descricao = "Data de retorno ao estoque (entrada)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtRet;

    @Campo(numero = 7, nome = "QTD_RET", descricao = "Quantidade de retorno ao estoque (entrada)", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdRet;
}