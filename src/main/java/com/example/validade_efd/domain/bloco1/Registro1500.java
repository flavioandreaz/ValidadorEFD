package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.CodigoClasseConsumo;
import com.example.validade_efd.enums.CodigoGrupoTensao;
import com.example.validade_efd.enums.CodigoSituacaoDocumento;
import com.example.validade_efd.enums.IndicadorEmitente;
import com.example.validade_efd.enums.IndicadorOperacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoLigacao;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1500 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1500\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_OPER", descricao = "Indicador do tipo de operação: 1- Saída", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorOperacao indOper;

    @Campo(numero = 3, nome = "IND_EMIT", descricao = "Indicador do emitente do documento fiscal: 0- Emissão própria", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorEmitente indEmit;

    @Campo(numero = 4, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - do adquirente, no caso das saídas", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codPart;

    @Campo(numero = 5, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 6, nome = "COD_SIT", descricao = "Código da situação do documento fiscal, conforme a Tabela 4.1.2", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private CodigoSituacaoDocumento codSit;

    @Campo(numero = 7, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorio = false)
    private String ser;

    @Campo(numero = 8, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Integer sub;

    @Campo(numero = 9, nome = "COD_CONS", descricao = "Código de classe de consumo de energia elétrica", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private CodigoClasseConsumo codCons;

    @Campo(numero = 10, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorio = true)
    private int numDoc;

    @Campo(numero = 11, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDoc;

    @Campo(numero = 12, nome = "DT_E_S", descricao = "Data da entrada ou da saída", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtES;

    @Campo(numero = 13, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlDoc;

    @Campo(numero = 14, nome = "VL_DESC", descricao = "Valor total do desconto", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlDesc;

    @Campo(numero = 15, nome = "VL_FORN", descricao = "Valor total fornecido/consumido", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlForn;

    @Campo(numero = 16, nome = "VL_SERV_NT", descricao = "Valor total dos serviços não-tributados pelo ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlServNt;

    @Campo(numero = 17, nome = "VL_TERC", descricao = "Valor total cobrado em nome de terceiros", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlTerc;

    @Campo(numero = 18, nome = "VL_DA", descricao = "Valor total de despesas acessórias indicadas no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlDa;

    @Campo(numero = 19, nome = "VL_BC_ICMS", descricao = "Valor acumulado da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlBcIcms;

    @Campo(numero = 20, nome = "VL_ICMS", descricao = "Valor acumulado do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlIcms;

    @Campo(numero = 21, nome = "VL_BC_ICMS_ST", descricao = "Valor acumulado da base de cálculo do ICMS substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlBcIcmsSt;

    @Campo(numero = 22, nome = "VL_ICMS_ST", descricao = "Valor acumulado do ICMS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlIcmsSt;

    @Campo(numero = 23, nome = "COD_INF", descricao = "Código da informação complementar do documento fiscal (campo 02 do Registro 0450)", tipo = TipoCampo.C, tamanho = 6, obrigatorio = false)
    private String codInf;

    @Campo(numero = 24, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlPis;

    @Campo(numero = 25, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double vlCofins;

    @Campo(numero = 26, nome = "TP_LIGACAO", descricao = "Código de tipo de Ligação", tipo = TipoCampo.C, tamanho = 1, obrigatorio = false)
    private TipoLigacao tpLigacao;

    @Campo(numero = 27, nome = "COD_GRUPO_TENSAO", descricao = "Código de grupo de tensão", tipo = TipoCampo.C, tamanho = 2, obrigatorio = false)
    private CodigoGrupoTensao codGrupoTensao;
}