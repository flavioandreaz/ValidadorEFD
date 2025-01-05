package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoUtilizacaoCredito;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1210 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1210\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "TIPO_UTIL", descricao = "Tipo de utilização do crédito, conforme tabela indicada no item 5.5.", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private TipoUtilizacaoCredito tipoUtil;

    @Campo(numero = 3, nome = "NR_DOC", descricao = "Número do documento utilizado na baixa de créditos", tipo = TipoCampo.C, obrigatorio = false)
    private String nrDoc;

    @Campo(numero = 4, nome = "VL_CRED_UTIL", descricao = "Total de crédito utilizado", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlCredUtil;

    @Campo(numero = 5, nome = "CHV_DOCe", descricao = "Chave do Documento Eletrônico", tipo = TipoCampo.N, tamanho = 44, obrigatorio = false)
    private String chvDocE;
}