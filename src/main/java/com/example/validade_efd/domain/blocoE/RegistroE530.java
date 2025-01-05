package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoAjusteApuracaoIPI;
import com.example.validade_efd.enums.IndicadorTipoAjuste;
import com.example.validade_efd.enums.IndicadorOrigemDocumento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE530 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E530\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_AJ", descricao = "Indicador do tipo de ajuste: 0- Ajuste a débito; 1- Ajuste a crédito", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorTipoAjuste indAj;

    @Campo(numero = 3, nome = "VL_AJ", descricao = "Valor do ajuste", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlAj;

    @Campo(numero = 4, nome = "COD_AJ", descricao = "Código do ajuste da apuração, conforme a Tabela indicada no item 4.5.4.", tipo = TipoCampo.C, tamanho = 3, obrigatorio = true)
    private CodigoAjusteApuracaoIPI codAj;

    @Campo(numero = 5, nome = "IND_DOC", descricao = "Indicador da origem do documento vinculado ao ajuste: 0 - Processo Judicial; 1 - Processo Administrativo; 2 - PER/DCOMP; 3 – Documento Fiscal; 9 – Outros.", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorOrigemDocumento indDoc;

    @Campo(numero = 6, nome = "NUM_DOC", descricao = "Número do documento / processo / declaração ao qual o ajuste está vinculado, se houver", tipo = TipoCampo.C, obrigatorio = false)
    private String numDoc;

    @Campo(numero = 7, nome = "DESCR_AJ", descricao = "Descrição detalhada do ajuste, com citação dos documentos fiscais.", tipo = TipoCampo.C, obrigatorio = true)
    private String descrAj;
}