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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro1920 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1920\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_TOT_TRANSF_DEBITOS_OA", descricao = "Valor total dos débitos por “Saídas e prestações com débito do imposto”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotTransfDebitosOa;

    @Campo(numero = 3, nome = "VL_TOT_AJ_DEBITOS_OA", descricao = "Valor total de “Ajustes a débito”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotAjDebitosOa;

    @Campo(numero = 4, nome = "VL_ESTORNOS_CRED_OA", descricao = "Valor total de Ajustes “Estornos de créditos”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlEstornosCredOa;

    @Campo(numero = 5, nome = "VL_TOT_TRANSF_CREDITOS_OA", descricao = "Valor total dos créditos por “Entradas e aquisições com crédito do imposto”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotTransfCreditosOa;

    @Campo(numero = 6, nome = "VL_TOT_AJ_CREDITOS_OA", descricao = "Valor total de “Ajustes a crédito”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotAjCreditosOa;

    @Campo(numero = 7, nome = "VL_ESTORNOS_DEB_OA", descricao = "Valor total de Ajustes “Estornos de Débitos”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlEstornosDebOa;

    @Campo(numero = 8, nome = "VL_SLD_CREDOR_ANT_OA", descricao = "Valor total de “Saldo credor do período", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredorAntOa;

    @Campo(numero = 9, nome = "VL_SLD_APURADO_OA", descricao = "Valor do saldo devedor apurado", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldApuradoOa;

    @Campo(numero = 10, nome = "VL_TOT_DED", descricao = "Valor total de “Deduções”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlTotDed;

    @Campo(numero = 11, nome = "VL_ICMS_RECOLHER_OA", descricao = "Valor total de \"ICMS a recolher (09-10)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlIcmsRecolherOa;

    @Campo(numero = 12, nome = "VL_SLD_CREDOR_TRANSP_OA", descricao = "Valor total de “Saldo credor a transportar para o período seguinte”", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlSldCredorTranspOa;

    @Campo(numero = 13, nome = "DEB_ESP_OA", descricao = "Valores recolhidos ou a recolher, extra-apuração.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double debEspOa;
}