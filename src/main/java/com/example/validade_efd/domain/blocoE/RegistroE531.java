package com.example.validade_efd.domain.blocoE;

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
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE531 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E531\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codPart;

    @Campo(numero = 3, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 4, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorio = false)
    private String ser;

    @Campo(numero = 5, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Integer sub;

    @Campo(numero = 6, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorio = true)
    private int numDoc;

    @Campo(numero = 7, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDoc;

    @Campo(numero = 8, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codItem;

    @Campo(numero = 9, nome = "VL_AJ_ITEM", descricao = "Valor do ajuste para a operação/item", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAjItem;

    @Campo(numero = 10, nome = "CHV_NFE", descricao = "Chave da Nota Fiscal Eletrônica (modelo 55)", tipo = TipoCampo.N, tamanho = 44, obrigatorio = false)
    private String chvNfe;
}