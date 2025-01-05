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
public class Registro1310 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1310\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_TANQUE", descricao = "Tanque que armazena o combustível", tipo = TipoCampo.C, tamanho = 3, obrigatorio = true)
    private String numTanque;

    @Campo(numero = 3, nome = "ESTQ_ABERT", descricao = "Estoque no início do dia, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double estqAbert;

    @Campo(numero = 4, nome = "VOL_ENTR", descricao = "Volume Recebido no dia (em litros)", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volEntr;

    @Campo(numero = 5, nome = "VOL_DISP", descricao = "Volume Disponível (03 + 04), em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volDisp;

    @Campo(numero = 6, nome = "VOL_SAIDAS", descricao = "Volume Total das Saídas, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volSaidas;

    @Campo(numero = 7, nome = "ESTQ_ESCR", descricao = "Estoque Escritural (05 – 06), litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double estqEscr;

    @Campo(numero = 8, nome = "VAL_AJ_PERDA", descricao = "Valor da Perda, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valAjPerda;

    @Campo(numero = 9, nome = "VAL_AJ_GANHO", descricao = "Valor do ganho, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valAjGanho;

    @Campo(numero = 10, nome = "FECH_FISICO", descricao = "Volume aferido no tanque, em litros. Estoque de fechamento físico do tanque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double fechFisico;
}