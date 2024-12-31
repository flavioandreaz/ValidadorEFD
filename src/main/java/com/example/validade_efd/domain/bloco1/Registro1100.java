package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.NaturezaExportacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoConhecimentoEmbarque;
import com.example.validade_efd.enums.TipoDocumento;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1100 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1100\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_DOC", descricao = "Informe o tipo de documento", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private TipoDocumento indDoc;

    @Campo(numero = 3, nome = "NRO_DE", descricao = "Número da declaração", tipo = TipoCampo.C, tamanho = 14, obrigatorio = true)
    private String nroDe;

    @Campo(numero = 4, nome = "DT_DE", descricao = "Data da declaração (DDMMAAAA)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDe;

    @Campo(numero = 5, nome = "NAT_EXP", descricao = "Preencher com: 0 - Exportação Direta, 1 - Exportação Indireta", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private NaturezaExportacao natExp;

    @Campo(numero = 6, nome = "NRO_RE", descricao = "Nº do registro de Exportação", tipo = TipoCampo.C, tamanho = 12, obrigatorio = false)
    private String nroRe;

    @Campo(numero = 7, nome = "DT_RE", descricao = "Data do Registro de Exportação (DDMMAAAA)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtRe;

    @Campo(numero = 8, nome = "CHC_EMB", descricao = "Nº do conhecimento de embarque", tipo = TipoCampo.C, tamanho = 18, obrigatorio = false)
    private String chcEmb;

    @Campo(numero = 9, nome = "DT_CHC", descricao = "Data do conhecimento de embarque (DDMMAAAA)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtChc;

    @Campo(numero = 10, nome = "DT_AVB", descricao = "Data da averbação da Declaração de exportação (DDMMAAAA)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtAvb;

    @Campo(numero = 11, nome = "TP_CHC", descricao = "Informação do tipo de conhecimento de embarque", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private TipoConhecimentoEmbarque tpChc;

    @Campo(numero = 12, nome = "PAIS", descricao = "Código do país de destino da mercadoria (Preencher conforme tabela do SISCOMEX)", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private int pais;
}