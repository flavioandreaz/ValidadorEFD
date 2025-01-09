package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTarifa;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.domain.Municipio;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroD150 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D150\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MUN_ORIG", descricao = "Código do município de origem do serviço, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOrig;

    @Campo(numero = 3, nome = "COD_MUN_DEST", descricao = "Código do município de destino, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;

    @Campo(numero = 4, nome = "VEIC_ID", descricao = "Identificação da aeronave (DAC)", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String veicId;

    @Campo(numero = 5, nome = "VIAGEM", descricao = "Número do vôo", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int viagem;

    @Campo(numero = 6, nome = "IND_TFA", descricao = "Indicador do tipo de tarifa aplicada", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTarifa indTfa;

    @Campo(numero = 7, nome = "VL_PESO_TX", descricao = "Peso taxado", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlPesoTx;

    @Campo(numero = 8, nome = "VL_TX_TERR", descricao = "Valor da taxa terrestre", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlTxTerr;

    @Campo(numero = 9, nome = "VL_TX_RED", descricao = "Valor da taxa de redespacho", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlTxRed;

    @Campo(numero = 10, nome = "VL_OUT", descricao = "Outros valores", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOut;

    @Campo(numero = 11, nome = "VL_TX_ADV", descricao = "Valor da taxa \"ad valorem\"", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlTxAdv;
}