package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoResponsavelRetencao;
import com.example.validade_efd.enums.CodigoMotivoRessarcimento;
import com.example.validade_efd.enums.CodigoDocumentoArrecadacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC176 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C176\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD_ULT_E", descricao = "Código do modelo do documento fiscal relativa a última entrada", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codModUltE;

    @Campo(numero = 3, nome = "NUM_DOC_ULT_E", descricao = "Número do documento fiscal relativa a última entrada", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocUltE;

    @Campo(numero = 4, nome = "SER_ULT_E", descricao = "Série do documento fiscal relativa a última entrada", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String serUltE;

    @Campo(numero = 5, nome = "DT_ULT_E", descricao = "Data relativa a última entrada da mercadoria", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtUltE;

    @Campo(numero = 6, nome = "COD_PART_ULT_E", descricao = "Código do participante (do emitente do documento relativa a última entrada)", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codPartUltE;

    @Campo(numero = 7, nome = "QUANT_ULT_E", descricao = "Quantidade do item relativa a última entrada", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double quantUltE;

    @Campo(numero = 8, nome = "VL_UNIT_ULT_E", descricao = "Valor unitário da mercadoria constante na NF relativa a última entrada inclusive despesas acessórias.", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlUnitUltE;

    @Campo(numero = 9, nome = "VL_UNIT_BC_ST", descricao = "Valor unitário da base de cálculo do imposto pago por substituição.", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlUnitBcSt;

    @Campo(numero = 10, nome = "CHAVE_NFE_ULT_E", descricao = "Número completo da chave da NFe relativo à última entrada", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String chaveNfeUltE;

    @Campo(numero = 11, nome = "NUM_ITEM_ULT_E", descricao = "Número sequencial do item na NF entrada que corresponde à mercadoria objeto de pedido de ressarcimento", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int numItemUltE;

    @Campo(numero = 12, nome = "VL_UNIT_BC_ICMS_ULT_E", descricao = "Valor unitário da base de cálculo da operação própria do remetente sob o regime comum de tributação", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlUnitBcIcmsUltE;

    @Campo(numero = 13, nome = "ALIQ_ICMS_ULT_E", descricao = "Alíquota do ICMS aplicável à última entrada da mercadoria", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqIcmsUltE;

    @Campo(numero = 14, nome = "VL_UNIT_LIMITE_BC_ICMS_ULT_E", descricao = "Valor unitário da base de cálculo do ICMS relativo à última entrada da mercadoria, limitado ao valor da BC da retenção (corresponde ao menor valor entre os campos VL_UNIT_BC_ST e VL_UNIT_BC_ICMS_ULT_E)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlUnitLimiteBcIcmsUltE;

    @Campo(numero = 15, nome = "VL_UNIT_ICMS_ULT_E", descricao = "Valor unitário do crédito de ICMS sobre operações próprias do remetente, relativo à última entrada da mercadoria, decorrente da quebra da ST – equivalente a multiplicação entre os campos 13 e 14", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlUnitIcmsUltE;

    @Campo(numero = 16, nome = "ALIQ_ST_ULT_E", descricao = "Alíquota do ICMS ST relativa à última entrada da mercadoria", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double aliqStUltE;

    @Campo(numero = 17, nome = "VL_UNIT_RES", descricao = "Valor unitário do ressarcimento (parcial ou completo) de ICMS decorrente da quebra da ST", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlUnitRes;

    @Campo(numero = 18, nome = "COD_RESP_RET", descricao = "Código que indica o responsável pela retenção do ICMS-ST: 1-Remetente Direto; 2-Remetente Indireto; 3-Próprio declarante", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = true)
    private CodigoResponsavelRetencao codRespRet;

    @Campo(numero = 19, nome = "COD_MOT_RES", descricao = "Código do motivo do ressarcimento: 1 – Venda para outra UF; 2 –Saída amparada por isenção ou não incidência; 3 – Perda ou deterioração; 4 – Furto ou roubo; 5 – Exportação; 9 – Outros", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = true)
    private CodigoMotivoRessarcimento codMotRes;

    @Campo(numero = 20, nome = "CHAVE_NFE_RET", descricao = "Número completo da chave da NF-e emitida pelo substituto, na qual consta o valor do ICMS-ST retido", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String chaveNfeRet;

    @Campo(numero = 21, nome = "COD_PART_NFE_RET", descricao = "Código do participante do emitente da NF-e em que houve a retenção do ICMS-ST – campo 02 do registro 0150", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPartNfeRet;

    @Campo(numero = 22, nome = "SER_NFE_RET", descricao = "Série da NF-e em que houve a retenção do ICMS-ST", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String serNfeRet;

    @Campo(numero = 23, nome = "NUM_NFE_RET", descricao = "Número da NF-e em que houve a retenção do ICMS-ST", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int numNfeRet;

    @Campo(numero = 24, nome = "ITEM_NFE_RET", descricao = "Número sequencial do item na NF-e em que houve a retenção do ICMS-ST, que corresponde à mercadoria objeto de pedido de ressarcimento", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int itemNfeRet;

    @Campo(numero = 25, nome = "COD_DA", descricao = "Código do modelo do documento de arrecadação: 0 – Documento estadual de arrecadação; 1 – GNRE", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = true)
    private CodigoDocumentoArrecadacao codDa;

    @Campo(numero = 26, nome = "NUM_DA", descricao = "Número do documento de arrecadação estadual, se houver", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String numDa;
}