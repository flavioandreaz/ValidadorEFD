package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoModeloDocumentoArrecadacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC112 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C112\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_DA", descricao = "Código do modelo do documento de arrecadação: 0 - documento estadual de arrecadação; 1 – GNRE", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoModeloDocumentoArrecadacao codDa;

    @Campo(numero = 3, nome = "UF", descricao = "Unidade federada beneficiária do recolhimento", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private UnidadeFederativa uf;

    @Campo(numero = 4, nome = "NUM_DA", descricao = "Número do documento de arrecadação", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String numDa;

    @Campo(numero = 5, nome = "COD_AUT", descricao = "Código completo da autenticação bancária", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codAut;

    @Campo(numero = 6, nome = "VL_DA", descricao = "Valor do total do documento de arrecadação (principal, atualização monetária, juros e multa)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDa;

    @Campo(numero = 7, nome = "DT_VCTO", descricao = "Data de vencimento do documento de arrecadação", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtVcto;

    @Campo(numero = 8, nome = "DT_PGTO", descricao = "Data de pagamento do documento de arrecadação, ou data do vencimento, no caso de ICMS antecipado a recolher.", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtPgto;
}