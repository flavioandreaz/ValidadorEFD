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
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1925 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1925\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_INF_ADIC", descricao = "Código da informação adicional conforme tabela a ser definida pelas SEFAZ, conforme tabela definida no item 5.2.", tipo = TipoCampo.C, tamanho = 8, obrigatorio = true)
    private String codInfAdic;

    @Campo(numero = 3, nome = "VL_INF_ADIC", descricao = "Valor referente à informação adicional", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlInfAdic;

    @Campo(numero = 4, nome = "DESCR_COMPL_AJ", descricao = "Descrição complementar do ajuste", tipo = TipoCampo.C, obrigatorio = false)
    private String descrComplAj;
}