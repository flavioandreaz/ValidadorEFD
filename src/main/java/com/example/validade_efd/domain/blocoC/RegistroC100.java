package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoOperacao;
import com.example.validade_efd.enums.CodigoSituacaoDocumento;
import com.example.validade_efd.enums.IndicadorEmitenteDocumento;
import com.example.validade_efd.enums.IndicadorTipoPagamento;
import com.example.validade_efd.enums.IndicadorTipoFrete;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroC100 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C100\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_OPER", descricao = "Indicador do tipo de operação: 0 - Entrada; 1 - Saída", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoOperacao indOper;

    @Campo(numero = 3, nome = "IND_EMIT", descricao = "Indicador do emitente do documento fiscal: 0- Emissão própria; 1- Terceiros", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorEmitenteDocumento indEmit;

    @Campo(numero = 4, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codPart;

    @Campo(numero = 5, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codMod;

    @Campo(numero = 6, nome = "COD_SIT", descricao = "Código da situação do documento fiscal, conforme a Tabela 4.1.2", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoSituacaoDocumento codSit;

    @Campo(numero = 7, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String ser;

    @Campo(numero = 8, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDoc;

    @Campo(numero = 9, nome = "CHV_NFE", descricao = "Chave da Nota Fiscal Eletrônica", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String chvNfe;

    @Campo(numero = 10, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 11, nome = "DT_E_S", descricao = "Data da entrada ou da saída", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = false)
    private LocalDate dtES;

    @Campo(numero = 12, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 13, nome = "IND_PGTO", descricao = "Indicador do tipo de pagamento: 0- À vista; 1- A prazo; 2 - Outros", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoPagamento indPgto;

    @Campo(numero = 14, nome = "VL_DESC", descricao = "Valor total do desconto", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlDesc;

    @Campo(numero = 15, nome = "VL_ABAT_NT", descricao = "Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlAbatNt;

    @Campo(numero = 16, nome = "VL_MERC", descricao = "Valor total das mercadorias e serviços", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = false)
    private double vlMerc;

    @Campo(numero = 17, nome = "IND_FRT", descricao = "Indicador do tipo de frete: 0 - Contratação do Frete por conta do Remetente (CIF); 1 - Contratação do Frete por conta do Destinatário (FOB); 2 - Contratação do Frete por conta de Terceiros; 3 - Transporte Próprio por conta do Remetente; 4 - Transporte Próprio por conta do Destinatário; 9 - Sem Ocorrência de Transporte.", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoFrete indFrt;

    @Campo(numero = 18, nome = "VL_FRT", descricao = "Valor do frete indicado no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlFrt;

    @Campo(numero = 19, nome = "VL_SEG", descricao = "Valor do seguro indicado no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlSeg;

    @Campo(numero = 20, nome = "VL_OUT_DA", descricao = "Valor de outras despesas acessórias", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlOutDa;

    @Campo(numero = 21, nome = "VL_BC_ICMS", descricao = "Valor da base de cálculo do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIcms;

    @Campo(numero = 22, nome = "VL_ICMS", descricao = "Valor do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIcms;

    @Campo(numero = 23, nome = "VL_BC_ICMS_ST", descricao = "Valor da base de cálculo do ICMS substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlBcIcmsSt;

    @Campo(numero = 24, nome = "VL_ICMS_ST", descricao = "Valor do ICMS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIcmsSt;

    @Campo(numero = 25, nome = "VL_IPI", descricao = "Valor total do IPI", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlIpi;

    @Campo(numero = 26, nome = "VL_PIS", descricao = "Valor total do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlPis;

    @Campo(numero = 27, nome = "VL_COFINS", descricao = "Valor total da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlCofins;

    @Campo(numero = 28, nome = "VL_PIS_ST", descricao = "Valor total do PIS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlPisSt;

    @Campo(numero = 29, nome = "VL_COFINS_ST", descricao = "Valor total da COFINS retido por substituição tributária", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double vlCofinsSt;
}