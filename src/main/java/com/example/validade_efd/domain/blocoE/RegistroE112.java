package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorOrigemProcesso;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 5, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE112 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E112\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_DA", descricao = "Número do documento de arrecadação estadual, se houver", tipo = TipoCampo.C, obrigatorio = false)
    private String numDa;

    @Campo(numero = 3, nome = "NUM_PROC", descricao = "Número do processo ao qual o ajuste está vinculado, se houver", tipo = TipoCampo.C, tamanho = 15, obrigatorio = false)
    private String numProc;

    @Campo(numero = 4, nome = "IND_PROC", descricao = "Indicador da origem do processo", tipo = TipoCampo.C, tamanho = 1, obrigatorio = false)
    private IndicadorOrigemProcesso indProc;

    @Campo(numero = 5, nome = "PROC", descricao = "Descrição resumida do processo que embasou o lançamento", tipo = TipoCampo.C, obrigatorio = false)
    private String proc;

    @Campo(numero = 6, nome = "TXT_COMPL", descricao = "Descrição complementar", tipo = TipoCampo.C, obrigatorio = false)
    private String txtCompl;
}