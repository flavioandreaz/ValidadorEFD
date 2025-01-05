package com.example.validade_efd.domain.blocoH;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorPropriedadePosseItem;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroH010 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"H010\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 3, nome = "UNID", descricao = "Unidade do item", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String unid;

    @Campo(numero = 4, nome = "QTD", descricao = "Quantidade do item", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtd;

    @Campo(numero = 5, nome = "VL_UNIT", descricao = "Valor unitário do item", tipo = TipoCampo.N, tamanho = 6, obrigatorio = true)
    private double vlUnit;

    @Campo(numero = 6, nome = "VL_ITEM", descricao = "Valor do item", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlItem;

    @Campo(numero = 7, nome = "IND_PROP", descricao = "Indicador de propriedade/posse do item: 0- Item de propriedade do informante e em seu poder; 1- Item de propriedade do informante em posse de terceiros; 2- Item de propriedade de terceiros em posse do informante", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorPropriedadePosseItem indProp;

    @Campo(numero = 8, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - proprietário/possuidor que não seja o informante do arquivo", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codPart;

    @Campo(numero = 9, nome = "TXT_COMPL", descricao = "Descrição complementar.", tipo = TipoCampo.C, obrigatorio = false)
    private String txtCompl;

    @Campo(numero = 10, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorio = false)
    private String codCta;

    @Campo(numero = 11, nome = "VL_ITEM_IR", descricao = "Valor do item para efeitos do Imposto de Renda.", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private double vlItemIr;
}