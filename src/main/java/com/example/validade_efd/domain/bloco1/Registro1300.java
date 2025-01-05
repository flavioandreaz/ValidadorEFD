package com.example.validade_efd.domain.bloco1;

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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1300 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1300\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM", descricao = "Código do Produto, constante do registro 0200", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 3, nome = "DT_FECH", descricao = "Data do fechamento da movimentação", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFech;

    @Campo(numero = 4, nome = "ESTQ_ABERT", descricao = "Estoque no início do dia, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double estqAbert;

    @Campo(numero = 5, nome = "VOL_ENTR", descricao = "Volume Recebido no dia (em litros)", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volEntr;

    @Campo(numero = 6, nome = "VOL_DISP", descricao = "Volume Disponível (04 + 05), em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volDisp;

    @Campo(numero = 7, nome = "VOL_SAIDAS", descricao = "Volume Total das Saídas, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volSaidas;

    @Campo(numero = 8, nome = "ESTQ_ESCR", descricao = "Estoque Escritural (06 – 07), litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double estqEscr;

    @Campo(numero = 9, nome = "VAL_AJ_PERDA", descricao = "Valor da Perda, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valAjPerda;

    @Campo(numero = 10, nome = "VAL_AJ_GANHO", descricao = "Valor do ganho, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valAjGanho;

    @Campo(numero = 11, nome = "FECH_FISICO", descricao = "Estoque de Fechamento, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double fechFisico;
}