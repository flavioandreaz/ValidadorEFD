package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorMovimentoFcpDifal;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroE310 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E310\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_MOV_FCP_DIFAL", descricao = "Indicador de movimento", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorMovimentoFcpDifal indMovFcpDifal;

    @Campo(numero = 3, nome = "VL_SLD_CRED_ANT_DIFAL", descricao = "Valor do \"Saldo credor de período anterior – ICMS Diferencial de Alíquota da UF de Origem/Destino\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredAntDifal;

    @Campo(numero = 4, nome = "VL_TOT_DEBITOS_DIFAL", descricao = "Valor total dos débitos por \"Saídas e prestações com débito do ICMS referente ao diferencial de alíquota devido à UF de Origem/Destino\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotDebitosDifal;

    @Campo(numero = 5, nome = "VL_OUT_DEB_DIFAL", descricao = "Valor total dos ajustes \"Outros débitos ICMS Diferencial de Alíquota da UF de Origem/Destino\" e “Estorno de créditos ICMS Diferencial de Alíquota da UF de Origem/Destino”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutDebDifal;

    @Campo(numero = 6, nome = "VL_TOT_CREDITOS_DIFAL", descricao = "Valor total dos créditos do ICMS referente ao diferencial de alíquota devido à UF de Origem/Destino", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotCreditosDifal;

    @Campo(numero = 7, nome = "VL_OUT_CRED_DIFAL", descricao = "Valor total de Ajustes \"Outros créditos ICMS Diferencial de Alíquota da UF de Origem/Destino\" e “Estorno de débitos ICMS Diferencial de Alíquota da UF de Origem/Destino”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutCredDifal;

    @Campo(numero = 8, nome = "VL_SLD_DEV_ANT_DIFAL", descricao = "Valor total de “Saldo devedor ICMS Diferencial de Alíquota da UF de Origem/Destino antes das deduções”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldDevAntDifal;

    @Campo(numero = 9, nome = "VL_DEDUCOES_DIFAL", descricao = "Valor total dos ajustes \"Deduções ICMS Diferencial de Alíquota da UF de Origem/Destino\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDeducoesDifal;

    @Campo(numero = 10, nome = "VL_RECOL_DIFAL", descricao = "Valor recolhido ou a recolher referente ao ICMS Diferencial de Alíquota da UF de Origem/Destino (08-09)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlRecolDifal;

    @Campo(numero = 11, nome = "VL_SLD_CRED_TRANSPORTAR_DIFAL", descricao = "Saldo credor a transportar para o período seguinte referente ao ICMS Diferencial de Alíquota da UF de Origem/Destino", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredTransportarDifal;

    @Campo(numero = 12, nome = "DEB_ESP_DIFAL", descricao = "Valores recolhidos ou a recolher, extra-apuração - ICMS Diferencial de Alíquota da UF de Origem/Destino.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double debEspDifal;

    @Campo(numero = 13, nome = "VL_SLD_CRED_ANT_FCP", descricao = "Valor do \"Saldo credor de período anterior – FCP\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredAntFcp;

    @Campo(numero = 14, nome = "VL_TOT_DEB_FCP", descricao = "Valor total dos débitos FCP por \"Saídas e prestações”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotDebFcp;

    @Campo(numero = 15, nome = "VL_OUT_DEB_FCP", descricao = "Valor total dos ajustes \"Outros débitos FCP\" e “Estorno de créditos FCP”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutDebFcp;

    @Campo(numero = 16, nome = "VL_TOT_CRED_FCP", descricao = "Valor total dos créditos FCP por Entradas", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotCredFcp;

    @Campo(numero = 17, nome = "VL_OUT_CRED_FCP", descricao = "Valor total de Ajustes \"Outros créditos FCP\" e “Estorno de débitos FCP”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutCredFcp;

    @Campo(numero = 18, nome = "VL_SLD_DEV_ANT_FCP", descricao = "Valor total de Saldo devedor FCP antes das deduções", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldDevAntFcp;

    @Campo(numero = 19, nome = "VL_DEDUCOES_FCP", descricao = "Valor total das deduções \"FCP\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDeducoesFcp;

    @Campo(numero = 20, nome = "VL_RECOL_FCP", descricao = "Valor recolhido ou a recolher referente ao FCP (18–19)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlRecolFcp;

    @Campo(numero = 21, nome = "VL_SLD_CRED_TRANSPORTAR_FCP", descricao = "Saldo credor a transportar para o período seguinte referente ao FCP", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredTransportarFcp;

    @Campo(numero = 22, nome = "DEB_ESP_FCP", descricao = "Valores recolhidos ou a recolher, extra-apuração - FCP.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double debEspFcp;
}