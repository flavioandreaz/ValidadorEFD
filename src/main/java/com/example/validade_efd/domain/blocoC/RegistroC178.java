package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoClasseEnquadramentoIpi;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC178 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C178\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "CL_ENQ", descricao = "Código da classe de enquadramento do IPI, conforme Tabela 4.5.1.", tipo = TipoCampo.C, tamanho = 5, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoClasseEnquadramentoIpi clEnq;

    @Campo(numero = 3, nome = "VL_UNID", descricao = "Valor por unidade padrão de tributação", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlUnid;

    @Campo(numero = 4, nome = "QUANT_PAD", descricao = "Quantidade total de produtos na unidade padrão de tributação", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double quantPad;
}