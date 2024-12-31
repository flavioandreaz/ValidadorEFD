package com.example.validade_efd.domain.bloco0;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.GeneroItem;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoItem;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro0200 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0200\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_ITEM", descricao = "Código do item", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 3, nome = "DESCR_ITEM", descricao = "Descrição do item", tipo = TipoCampo.C, obrigatorio = true)
    private String descrItem;

    @Campo(numero = 4, nome = "COD_BARRA", descricao = "Representação alfanumérico do código de barra do produto, se houver", tipo = TipoCampo.C, obrigatorio = false)
    private String codBarra;

    @Campo(numero = 5, nome = "COD_ANT_ITEM", descricao = "Código anterior do item com relação à última informação apresentada", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codAntItem;

    @Campo(numero = 6, nome = "UNID_INV", descricao = "Unidade de medida utilizada na quantificação de estoques", tipo = TipoCampo.C, tamanho = 6, obrigatorio = true)
    private String unidInv;

    @Campo(numero = 7, nome = "TIPO_ITEM", descricao = "Tipo do item – Atividades Industriais, Comerciais e Serviços", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private TipoItem tipoItem;

    @Campo(numero = 8, nome = "COD_NCM", descricao = "Código da Nomenclatura Comum do Mercosul", tipo = TipoCampo.C, tamanho = 8, obrigatorio = false)
    private String codNcm;

    @Campo(numero = 9, nome = "EX_IPI", descricao = "Código EX, conforme a TIPI", tipo = TipoCampo.C, tamanho = 3, obrigatorio = false)
    private String exIpi;

    @Campo(numero = 10, nome = "COD_GEN", descricao = "Código do gênero do item, conforme a Tabela 4.2.1", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private GeneroItem codGen;

    @Campo(numero = 11, nome = "COD_LST", descricao = "Código do serviço conforme lista do Anexo I da Lei Complementar Federal nº 116/03", tipo = TipoCampo.C, tamanho = 5, obrigatorio = false)
    private String codLst;

    @Campo(numero = 12, nome = "ALIQ_ICMS", descricao = "Alíquota de ICMS aplicável ao item nas operações internas", tipo = TipoCampo.N, tamanho = 6, obrigatorio = false)
    private String aliqIcms;

    @Campo(numero = 13, nome = "CEST", descricao = "Código Especificador da Substituição Tributária", tipo = TipoCampo.N, tamanho = 7, obrigatorio = false)
    private String cest;
}
