package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.SimNao;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class Registro1010 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1010\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_EXP", descricao = "Reg. 1100 - Ocorreu averbação (conclusão) de exportação no período", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indExp;

    @Campo(numero = 3, nome = "IND_CCRF", descricao = "Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indCcrf;

    @Campo(numero = 4, nome = "IND_COMB", descricao = "Reg. 1300 – É comercio varejista de combustíveis com movimentação e/ou estoque no período", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indComb;

    @Campo(numero = 5, nome = "IND_USINA", descricao = "Reg. 1390 – Usinas de açúcar e/álcool – O estabelecimento é produtor de açúcar e/ou álcool carburante com movimentação e/ou estoque no período", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indUsina;

    @Campo(numero = 6, nome = "IND_VA", descricao = "Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indVa;

    @Campo(numero = 7, nome = "IND_EE", descricao = "Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indEe;

    @Campo(numero = 8, nome = "IND_CART", descricao = "Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indCart;

    @Campo(numero = 9, nome = "IND_FORM", descricao = "Reg. 1700 – Foram emitidos documentos fiscais em papel no período em unidade da federação que exija o controle de utilização de documentos fiscais", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indForm;

    @Campo(numero = 10, nome = "IND_AER", descricao = "Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private SimNao indAer;
}