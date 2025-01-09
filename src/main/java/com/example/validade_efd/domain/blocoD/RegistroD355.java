package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD355 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D355\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_DOC", descricao = "Data do movimento a que se refere a Redução Z", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 3, nome = "CRO", descricao = "Posição do Contador de Reinício de Operação", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int cro;

    @Campo(numero = 4, nome = "CRZ", descricao = "Posição do Contador de Redução Z", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int crz;

    @Campo(numero = 5, nome = "NUM_COO_FIN", descricao = "Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z)", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numCooFin;

    @Campo(numero = 6, nome = "GT_FIN", descricao = "Valor do Grande Total final", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double gtFin;

    @Campo(numero = 7, nome = "VL_BRT", descricao = "Valor da venda bruta", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlBrt;
}