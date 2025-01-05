package com.example.validade_efd.domain.blocoE;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorOrigemProcesso;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroE250 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"E250\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_OR", descricao = "Código da obrigação a recolher, conforme a Tabela 5.4", tipo = TipoCampo.C, tamanho = 3, obrigatorio = true)
    private String codOr;

    @Campo(numero = 3, nome = "VL_OR", descricao = "Valor da obrigação ICMS ST a recolher", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlOr;

    @Campo(numero = 4, nome = "DT_VCTO", descricao = "Data de vencimento da obrigação", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtVcto;

    @Campo(numero = 5, nome = "COD_REC", descricao = "Código de receita referente à obrigação, próprio da unidade da federação do contribuinte substituído", tipo = TipoCampo.C, obrigatorio = true)
    private String codRec;

    @Campo(numero = 6, nome = "NUM_PROC", descricao = "Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver", tipo = TipoCampo.C, tamanho = 15, obrigatorio = false)
    private String numProc;

    @Campo(numero = 7, nome = "IND_PROC", descricao = "Indicador da origem do processo", tipo = TipoCampo.C, tamanho = 1, obrigatorio = false)
    private IndicadorOrigemProcesso indProc;

    @Campo(numero = 8, nome = "PROC", descricao = "Descrição resumida do processo que embasou o lançamento", tipo = TipoCampo.C, obrigatorio = false)
    private String proc;

    @Campo(numero = 9, nome = "TXT_COMPL", descricao = "Descrição complementar das obrigações a recolher", tipo = TipoCampo.C, obrigatorio = false)
    private String txtCompl;

    @Campo(numero = 10, nome = "MES_REF", descricao = "Informe o mês de referência no formato “mmaaaa”", tipo = TipoCampo.N, tamanho = 6, obrigatorio = true)
    private String mesRef;
}