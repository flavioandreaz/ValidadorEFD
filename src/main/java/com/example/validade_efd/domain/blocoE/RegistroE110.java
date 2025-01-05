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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroE110 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E110\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_TOT_DEBITOS", descricao = "Valor total dos débitos por \"Saídas e prestações com débito do imposto\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotDebitos;

    @Campo(numero = 3, nome = "VL_AJ_DEBITOS", descricao = "Valor total dos ajustes a débito decorrentes do documento fiscal.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjDebitos;

    @Campo(numero = 4, nome = "VL_TOT_AJ_DEBITOS", descricao = "Valor total de \"Ajustes a débito\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotAjDebitos;

    @Campo(numero = 5, nome = "VL_ESTORNOS_CRED", descricao = "Valor total de Ajustes “Estornos de créditos”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlEstornosCred;

    @Campo(numero = 6, nome = "VL_TOT_CREDITOS", descricao = "Valor total dos créditos por \"Entradas e aquisições com crédito do imposto\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotCreditos;

    @Campo(numero = 7, nome = "VL_AJ_CREDITOS", descricao = "Valor total dos ajustes a crédito decorrentes do documento fiscal.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjCreditos;

    @Campo(numero = 8, nome = "VL_TOT_AJ_CREDITOS", descricao = "Valor total de \"Ajustes a crédito\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotAjCreditos;

    @Campo(numero = 9, nome = "VL_ESTORNOS_DEB", descricao = "Valor total de Ajustes “Estornos de Débitos”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlEstornosDeb;

    @Campo(numero = 10, nome = "VL_SLD_CREDOR_ANT", descricao = "Valor total de \"Saldo credor do período anterior\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredorAnt;

    @Campo(numero = 11, nome = "VL_SLD_APURADO", descricao = "Valor do saldo devedor apurado", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldApurado;

    @Campo(numero = 12, nome = "VL_TOT_DED", descricao = "Valor total de \"Deduções\"", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotDed;

    @Campo(numero = 13, nome = "VL_ICMS_RECOLHER", descricao = "Valor total de \"ICMS a recolher (11-12)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcmsRecolher;

    @Campo(numero = 14, nome = "VL_SLD_CREDOR_TRANSPORTAR", descricao = "Valor total de \"Saldo credor a transportar para o período seguinte”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredorTransportar;

    @Campo(numero = 15, nome = "DEB_ESP", descricao = "Valores recolhidos ou a recolher, extra-apuração.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double debEsp;
}