package com.example.validade_efd.domain.blocoE;

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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroE520 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E520\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_SD_ANT_IPI", descricao = "Saldo credor do IPI transferido do período anterior", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSdAntIpi;

    @Campo(numero = 3, nome = "VL_DEB_IPI", descricao = "Valor total dos débitos por \"Saídas com débito do imposto\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDebIpi;

    @Campo(numero = 4, nome = "VL_CRED_IPI", descricao = "Valor total dos créditos por \"Entradas e aquisições com crédito do imposto\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlCredIpi;

    @Campo(numero = 5, nome = "VL_OD_IPI", descricao = "Valor de \"Outros débitos\" do IPI (inclusive estornos de crédito)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOdIpi;

    @Campo(numero = 6, nome = "VL_OC_IPI", descricao = "Valor de \"Outros créditos\" do IPI (inclusive estornos de débitos)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOcIpi;

    @Campo(numero = 7, nome = "VL_SC_IPI", descricao = "Valor do saldo credor do IPI a transportar para o período seguinte", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlScIpi;

    @Campo(numero = 8, nome = "VL_SD_IPI", descricao = "Valor do saldo devedor do IPI a recolher", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSdIpi;
}