package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.Municipio;
import com.example.validade_efd.enums.IndicadorVeiculo;
import com.example.validade_efd.enums.IndicadorNavegacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroD140 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D140\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART_CONSG", descricao = "Código do participante (campo 02 do Registro 0150): consignatário, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartConsg;

    @Campo(numero = 3, nome = "COD_MUN_ORIG", descricao = "Código do município de origem do serviço, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOrig;

    @Campo(numero = 4, nome = "COD_MUN_DEST", descricao = "Código do município de destino, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;

    @Campo(numero = 5, nome = "IND_VEIC", descricao = "Indicador do tipo do veículo transportador", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorVeiculo indVeic;

    @Campo(numero = 6, nome = "VEIC_ID", descricao = "Identificação da embarcação (IRIM ou Registro CPP)", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String veicId;

    @Campo(numero = 7, nome = "IND_NAV", descricao = "Indicador do tipo da navegação", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorNavegacao indNav;

    @Campo(numero = 8, nome = "VIAGEM", descricao = "Número da viagem", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int viagem;

    @Campo(numero = 9, nome = "VL_FRT_LIQ", descricao = "Valor líquido do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlFrtLiq;

    @Campo(numero = 10, nome = "VL_DESP_PORT", descricao = "Valor das despesas portuárias", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDespPort;

    @Campo(numero = 11, nome = "VL_DESP_CAR_DESC", descricao = "Valor das despesas com carga e descarga", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDespCarDesc;

    @Campo(numero = 12, nome = "VL_OUT", descricao = "Outros valores", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOut;

    @Campo(numero = 13, nome = "VL_FRT_BRT", descricao = "Valor bruto do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlFrtBrt;

    @Campo(numero = 14, nome = "VL_FRT_MM", descricao = "Valor adicional do frete para renovação da Marinha Mercante", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlFrtMm;
}