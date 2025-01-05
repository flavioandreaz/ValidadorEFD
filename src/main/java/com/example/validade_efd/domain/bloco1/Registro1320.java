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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1320 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1320\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_BICO", descricao = "Bico Ligado à Bomba", tipo = TipoCampo.N, obrigatorio = true)
    private int numBico;

    @Campo(numero = 3, nome = "NR_INTERV", descricao = "Número da intervenção", tipo = TipoCampo.N, obrigatorio = false)
    private Integer nrInterv;

    @Campo(numero = 4, nome = "MOT_INTERV", descricao = "Motivo da Intervenção", tipo = TipoCampo.C, tamanho = 50, obrigatorio = false)
    private String motInterv;

    @Campo(numero = 5, nome = "NOM_INTERV", descricao = "Nome do Interventor", tipo = TipoCampo.C, tamanho = 30, obrigatorio = false)
    private String nomInterv;

    @Campo(numero = 6, nome = "CNPJ_INTERV", descricao = "CNPJ da empresa responsável pela intervenção", tipo = TipoCampo.N, tamanho = 14, obrigatorio = false)
    private String cnpjInterv;

    @Campo(numero = 7, nome = "CPF_INTERV", descricao = "CPF do técnico responsável pela intervenção", tipo = TipoCampo.N, tamanho = 11, obrigatorio = false)
    private String cpfInterv;

    @Campo(numero = 8, nome = "VAL_FECHA", descricao = "Valor da leitura final do contador, no fechamento do bico", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valFecha;

    @Campo(numero = 9, nome = "VAL_ABERT", descricao = "Valor da leitura inicial do contador, na abertura do bico", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double valAbert;

    @Campo(numero = 10, nome = "VOL_AFERI", descricao = "Aferições da Bomba, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Double volAferi;

    @Campo(numero = 11, nome = "VOL_VENDAS", descricao = "Vendas (08 – 09 - 10 ) do bico, em litros", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double volVendas;
}