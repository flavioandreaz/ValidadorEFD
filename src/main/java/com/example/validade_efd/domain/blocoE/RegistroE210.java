package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorMovimentoST;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroE210 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E210\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_MOV_ST", descricao = "Indicador de movimento", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorMovimentoST indMovSt;

    @Campo(numero = 3, nome = "VL_SLD_CRED_ANT_ST", descricao = "Valor do \"Saldo credor de período anterior – Substituição Tributária\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredAntSt;

    @Campo(numero = 4, nome = "VL_DEVOL_ST", descricao = "Valor total do ICMS ST de devolução de mercadorias", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDevolSt;

    @Campo(numero = 5, nome = "VL_RESSARC_ST", descricao = "Valor total do ICMS ST de ressarcimentos", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlRessarcSt;

    @Campo(numero = 6, nome = "VL_OUT_CRED_ST", descricao = "Valor total de Ajustes \"Outros créditos ST\" e “Estorno de débitos ST”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutCredSt;

    @Campo(numero = 7, nome = "VL_AJ_CREDITOS_ST", descricao = "Valor total dos ajustes a crédito de ICMS ST, provenientes de ajustes do documento fiscal.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjCreditosSt;

    @Campo(numero = 8, nome = "VL_RETENCAO_ST", descricao = "Valor Total do ICMS retido por Substituição Tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlRetencaoSt;

    @Campo(numero = 9, nome = "VL_OUT_DEB_ST", descricao = "Valor Total dos ajustes \"Outros débitos ST\" \" e “Estorno de créditos ST”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOutDebSt;

    @Campo(numero = 10, nome = "VL_AJ_DEBITOS_ST", descricao = "Valor total dos ajustes a débito de ICMS ST, provenientes de ajustes do documento fiscal.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjDebitosSt;

    @Campo(numero = 11, nome = "VL_SLD_DEV_ANT_ST", descricao = "Valor total de Saldo devedor antes das deduções", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldDevAntSt;

    @Campo(numero = 12, nome = "VL_DEDUCOES_ST", descricao = "Valor total dos ajustes \"Deduções ST\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDeducoesSt;

    @Campo(numero = 13, nome = "VL_ICMS_RECOL_ST", descricao = "Imposto a recolher ST (11-12)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcmsRecolSt;

    @Campo(numero = 14, nome = "VL_SLD_CRED_ST_TRANSPORTAR", descricao = "Saldo credor de ST a transportar para o período seguinte [(03+04+05+06+07)– (08+09+10)].", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredStTransportar;

    @Campo(numero = 15, nome = "DEB_ESP_ST", descricao = "Valores recolhidos ou a recolher, extra-apuração.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double debEspSt;
}