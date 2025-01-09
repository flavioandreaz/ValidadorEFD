package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoOperacaoCombustivel;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC105 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C105\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "OPER", descricao = "Indicador do tipo de operação: 0- Combustíveis e Lubrificantes; 1- leasing de veículos ou faturamento direto.", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoOperacaoCombustivel oper;

    @Campo(numero = 3, nome = "UF", descricao = "Sigla da UF de destino do ICMS_ST", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private UnidadeFederativa uf;
}