package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.CodigoAjusteApuracaoICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD197 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D197\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_AJ", descricao = "Código do ajustes/benefício/incentivo, conforme tabela indicada no item 5.3", tipo = TipoCampo.C, tamanho = 10, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoAjusteApuracaoICMS codAj;

    @Campo(numero = 3, nome = "DESCR_COMPL_AJ", descricao = "Descrição complementar do ajuste do documento fiscal", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String descrComplAj;

    @Campo(numero = 4, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codItem;

    @Campo(numero = 5, nome = "VL_BC_ICMS", descricao = "Base de cálculo do ICMS ou do ICMS ST", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 6, nome = "ALIQ_ICMS", descricao = "Alíquota do ICMS", tipo = TipoCampo.N, tamanho = 6, decimais = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcms;

    @Campo(numero = 7, nome = "VL_ICMS", descricao = "Valor do ICMS ou do ICMS ST", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 8, nome = "VL_OUTROS", descricao = "Outros valores", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOutros;
}