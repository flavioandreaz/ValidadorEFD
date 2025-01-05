package com.example.validade_efd.domain.blocoG;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.TipoMovimentacaoBem;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroG125 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"G125\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_IND_BEM", descricao = "Código individualizado do bem ou componente adotado no controle patrimonial do estabelecimento informante", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codIndBem;

    @Campo(numero = 3, nome = "DT_MOV", descricao = "Data da movimentação ou do saldo inicial", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtMov;

    @Campo(numero = 4, nome = "TIPO_MOV", descricao = "Tipo de movimentação do bem ou componente", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private TipoMovimentacaoBem tipoMov;

    @Campo(numero = 5, nome = "VL_IMOB_ICMS_OP", descricao = "Valor do ICMS da Operação Própria na entrada do bem ou componente", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlImobIcmsOp;

    @Campo(numero = 6, nome = "VL_IMOB_ICMS_ST", descricao = "Valor do ICMS da Oper. por Sub. Tributária na entrada do bem ou componente", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlImobIcmsSt;

    @Campo(numero = 7, nome = "VL_IMOB_ICMS_FRT", descricao = "Valor do ICMS sobre Frete do Conhecimento de Transporte na entrada do bem ou componente", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlImobIcmsFrt;

    @Campo(numero = 8, nome = "VL_IMOB_ICMS_DIF", descricao = "Valor do ICMS - Diferencial de Alíquota, conforme Doc. de Arrecadação, na entrada do bem ou componente", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlImobIcmsDif;

    @Campo(numero = 9, nome = "NUM_PARC", descricao = "Número da parcela do ICMS", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private int numParc;

    @Campo(numero = 10, nome = "VL_PARC_PASS", descricao = "Valor da parcela de ICMS passível de apropriação (antes da aplicação da participação percentual do valor das saídas tributadas/exportação sobre as saídas totais)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlParcPass;
}