package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoSituacaoDocumento;
import com.example.validade_efd.enums.IndicadorEmitente;
import com.example.validade_efd.enums.IndicadorOperacao;
import com.example.validade_efd.enums.TipoAssinante;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.domain.DocumentoFiscalICMS;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroD500 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D500\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_OPER", descricao = "Indicador do tipo de operação", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorOperacao indOper;

    @Campo(numero = 3, nome = "IND_EMIT", descricao = "Indicador do emitente do documento fiscal", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorEmitente indEmit;

    @Campo(numero = 4, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): do prestador do serviço, no caso de aquisição; do tomador do serviço, no caso de prestação", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codPart;

    @Campo(numero = 5, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 6, nome = "COD_SIT", descricao = "Código da situação do documento fiscal, conforme a Tabela 4.1.2", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoSituacaoDocumento codSit;

    @Campo(numero = 7, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 8, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String sub;

    @Campo(numero = 9, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDoc;

    @Campo(numero = 10, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 11, nome = "DT_A_P", descricao = "Data da entrada (aquisição) ou da saída (prestação do serviço)", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = false, obrigatorioSaida = true)
    private LocalDate dtAP;

    @Campo(numero = 12, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 13, nome = "VL_DESC", descricao = "Valor total do desconto", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 14, nome = "VL_SERV", descricao = "Valor da prestação de serviços", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlServ;

    @Campo(numero = 15, nome = "VL_SERV_NT", descricao = "Valor total dos serviços não-tributados pelo ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlServNt;

    @Campo(numero = 16, nome = "VL_TERC", descricao = "Valores cobrados em nome de terceiros", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlTerc;

    @Campo(numero = 17, nome = "VL_DA", descricao = "Valor de outras despesas indicadas no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDa;

    @Campo(numero = 18, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlBcIcms;

    @Campo(numero = 19, nome = "VL_ICMS", descricao = "Valor do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 20, nome = "COD_INF", descricao = "Código da informação complementar (campo 02 do Registro 0450)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codInf;

    @Campo(numero = 21, nome = "VL_PIS", descricao = "Valor do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 22, nome = "VL_COFINS", descricao = "Valor da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;

    @Campo(numero = 23, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codCta;

    @Campo(numero = 24, nome = "TP_ASSINANTE", descricao = "Código do Tipo de Assinante", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = true)
    private TipoAssinante tpAssinante;
}