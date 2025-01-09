package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorVeiculoOperacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC175 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C175\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_VEIC_OPER", descricao = "Indicador do tipo de operação com veículo: 0- Venda para concessionária; 1- Faturamento direto; 2- Venda direta; 3- Venda da concessionária; 9- Outros", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorVeiculoOperacao indVeicOper;

    @Campo(numero = 3, nome = "CNPJ", descricao = "CNPJ da Concessionária", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String cnpj;

    @Campo(numero = 4, nome = "UF", descricao = "Sigla da unidade da federação da Concessionária", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private UnidadeFederativa uf;

    @Campo(numero = 5, nome = "CHASSI_VEIC", descricao = "Chassi do veículo", tipo = TipoCampo.C, tamanho = 17, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String chassiVeic;
}