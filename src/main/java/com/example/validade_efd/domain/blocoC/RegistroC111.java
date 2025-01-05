package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorOrigemProcesso;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC111 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C111\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_PROC", descricao = "Identificação do processo ou ato concessório.", tipo = TipoCampo.C, tamanho = 15, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String numProc;

    @Campo(numero = 3, nome = "IND_PROC", descricao = "Indicador da origem do processo: 0 - SEFAZ; 1 - Justiça Federal; 2 - Justiça Estadual; 3 - SECEX/SRF; 9 - Outros.", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorOrigemProcesso indProc;
}