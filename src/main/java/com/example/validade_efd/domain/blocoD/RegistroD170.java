package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorNaturezaFrete;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.domain.Municipio;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroD170 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D170\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART_CONSG", descricao = "Código do participante (campo 02 do Registro 0150): consignatário, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartConsg;

    @Campo(numero = 3, nome = "COD_PART_RED", descricao = "Código do participante (campo 02 do Registro 0150): redespachante, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartRed;

    @Campo(numero = 4, nome = "COD_MUN_ORIG", descricao = "Código do município de origem do serviço, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOrig;

    @Campo(numero = 5, nome = "COD_MUN_DEST", descricao = "Código do município de destino, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;

    @Campo(numero = 6, nome = "OTM", descricao = "Registro do operador de transporte multimodal", tipo = TipoCampo.C, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String otm;

    @Campo(numero = 7, nome = "IND_NAT_FRT", descricao = "Indicador da natureza do frete", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorNaturezaFrete indNatFrt;

    @Campo(numero = 8, nome = "VL_LIQ_FRT", descricao = "Valor líquido do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlLiqFrt;

    @Campo(numero = 9, nome = "VL_GRIS", descricao = "Valor do gris (gerenciamento de risco)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlGris;

    @Campo(numero = 10, nome = "VL_PDG", descricao = "Somatório dos valores de pedágio", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPdg;

    @Campo(numero = 11, nome = "VL_OUT", descricao = "Outros valores", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlOut;

    @Campo(numero = 12, nome = "VL_FRT", descricao = "Valor total do frete", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlFrt;

    @Campo(numero = 13, nome = "VEIC_ID", descricao = "Placa de identificação do veículo", tipo = TipoCampo.C, tamanho = 7, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String veicId;

    @Campo(numero = 14, nome = "UF_ID", descricao = "Sigla da UF da placa do veículo", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ufId;
}