package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.Municipio;
import com.example.validade_efd.enums.IndicadorFreteRedespacho;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD130 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D130\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART_CONSG", descricao = "Código do participante (campo 02 do Registro 0150): consignatário, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartConsg;

    @Campo(numero = 3, nome = "COD_PART_RED", descricao = "Código do participante (campo 02 do Registro 0150): redespachado, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartRed;

    @Campo(numero = 4, nome = "IND_FRT_RED", descricao = "Indicador do tipo do frete da operação de redespacho", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorFreteRedespacho indFrtRed;

    @Campo(numero = 5, nome = "COD_MUN_ORIG", descricao = "Código do município de origem do serviço, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOrig;

    @Campo(numero = 6, nome = "COD_MUN_DEST", descricao = "Código do município de destino, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;

    @Campo(numero = 7, nome = "VEIC_ID", descricao = "Placa de identificação do veículo", tipo = TipoCampo.C, tamanho = 7, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String veicId;

    @Campo(numero = 8, nome = "VL_LIQ_FRT", descricao = "Valor líquido do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlLiqFrt;

    @Campo(numero = 9, nome = "VL_SEC_CAT", descricao = "Soma de valores de Sec/Cat (serviços de coleta/custo adicional de transporte)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlSecCat;

    @Campo(numero = 10, nome = "VL_DESP", descricao = "Soma de valores de despacho", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesp;

    @Campo(numero = 11, nome = "VL_PEDG", descricao = "Soma dos valores de pedágio", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPedg;

    @Campo(numero = 12, nome = "VL_OUT", descricao = "Outros valores", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOut;

    @Campo(numero = 13, nome = "VL_FRT", descricao = "Valor total do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlFrt;

    @Campo(numero = 14, nome = "UF_ID", descricao = "Sigla da UF da placa do veículo", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ufId;
}