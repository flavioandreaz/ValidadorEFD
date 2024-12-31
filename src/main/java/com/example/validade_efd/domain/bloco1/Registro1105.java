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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1105 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1105\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo da NF, conforme tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SERIE", descricao = "Série da Nota Fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorio = false)
    private String serie;

    @Campo(numero = 4, nome = "NUM_DOC", descricao = "Número de Nota Fiscal de Exportação emitida pelo Exportador", tipo = TipoCampo.N, tamanho = 9, obrigatorio = true)
    private int numDoc;

    @Campo(numero = 5, nome = "CHV_NFE", descricao = "Chave da Nota Fiscal Eletrônica", tipo = TipoCampo.N, tamanho = 44, obrigatorio = false)
    private String chvNfe;

    @Campo(numero = 6, nome = "DT_DOC", descricao = "Data da emissão da NF de exportação", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDoc;

    @Campo(numero = 7, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;
}