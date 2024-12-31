package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1110 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1110\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART", descricao = "Código do participante-Fornecedor da Mercadoria destinada à exportação (campo 02 do Registro 0150)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codPart;

    @Campo(numero = 3, nome = "COD_MOD", descricao = "Código do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 4, nome = "SER", descricao = "Série do documento fiscal recebido com fins específicos de exportação", tipo = TipoCampo.C, tamanho = 4, obrigatorio = false)
    private String ser;

    @Campo(numero = 5, nome = "NUM_DOC", descricao = "Número do documento fiscal recebido com fins específicos de exportação", tipo = TipoCampo.N, tamanho = 9, obrigatorio = true)
    private int numDoc;

    @Campo(numero = 6, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal recebido com fins específicos de exportação", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDoc;

    @Campo(numero = 7, nome = "CHV_NFE", descricao = "Chave da Nota Fiscal Eletrônica", tipo = TipoCampo.N, tamanho = 44, obrigatorio = false)
    private String chvNfe;

    @Campo(numero = 8, nome = "NR_MEMO", descricao = "Número do Memorando de Exportação", tipo = TipoCampo.N, obrigatorio = false)
    private Integer nrMemo;

    @Campo(numero = 9, nome = "QTD", descricao = "Quantidade do item efetivamente exportado", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtd;

    @Campo(numero = 10, nome = "UNID", descricao = "Unidade do item (Campo 02 do registro 0190)", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String unid;
}