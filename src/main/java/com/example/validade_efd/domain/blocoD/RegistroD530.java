package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorServico;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD530 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D530\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_SERV", descricao = "Indicador do tipo de serviço prestado", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorServico indServ;

    @Campo(numero = 3, nome = "DT_INI_SERV", descricao = "Data em que se iniciou a prestação do serviço", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = false, obrigatorioSaida = true)
    private LocalDate dtIniServ;

    @Campo(numero = 4, nome = "DT_FIN_SERV", descricao = "Data em que se encerrou a prestação do serviço", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = false, obrigatorioSaida = true)
    private LocalDate dtFinServ;

    @Campo(numero = 5, nome = "PER_FISCAL", descricao = "Período fiscal da prestação do serviço (MMAAAA)", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String perFiscal;

    @Campo(numero = 6, nome = "COD_AREA", descricao = "Código de área do terminal faturado", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codArea;

    @Campo(numero = 7, nome = "TERMINAL", descricao = "Identificação do terminal faturado", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String terminal;
}