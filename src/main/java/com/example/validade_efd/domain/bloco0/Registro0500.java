package com.example.validade_efd.domain.bloco0;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoNaturezaConta;
import com.example.validade_efd.enums.IndicadorTipoConta;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro0500 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0500\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_ALT", descricao = "Data da inclusão/alteração", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtAlt;

    @Campo(numero = 3, nome = "COD_NAT_CC", descricao = "Código da natureza da conta/grupo de contas", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private CodigoNaturezaConta codNatCc;

    @Campo(numero = 4, nome = "IND_CTA", descricao = "Indicador do tipo de conta", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorTipoConta indCta;

    @Campo(numero = 5, nome = "NIVEL", descricao = "Nível da conta analítica/grupo de contas", tipo = TipoCampo.N, tamanho = 5, obrigatorio = true)
    private int nivel;

    @Campo(numero = 6, nome = "COD_CTA", descricao = "Código da conta analítica/grupo de contas", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codCta;

    @Campo(numero = 7, nome = "NOME_CTA", descricao = "Nome da conta analítica/grupo de contas", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String nomeCta;
}