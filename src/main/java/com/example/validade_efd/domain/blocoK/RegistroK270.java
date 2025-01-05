package com.example.validade_efd.domain.blocoK;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OrigemCorrecaoApontamento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK270 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K270\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI_AP", descricao = "Data inicial do período de apuração em que ocorreu o apontamento que está sendo corrigido", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtIniAp;

    @Campo(numero = 3, nome = "DT_FIN_AP", descricao = "Data final do período de apuração em que ocorreu o apontamento que está sendo corrigido", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtFinAp;

    @Campo(numero = 4, nome = "COD_OP_OS", descricao = "Código de identificação da ordem de produção ou da ordem de serviço que está sendo corrigida", tipo = TipoCampo.C, tamanho = 30, obrigatorio = false)
    private String codOpOs;

    @Campo(numero = 5, nome = "COD_ITEM", descricao = "Código da mercadoria que está sendo corrigido (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 6, nome = "QTD_COR_POS", descricao = "Quantidade de correção positiva de apontamento ocorrido em período de apuração anterior", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdCorPos;

    @Campo(numero = 7, nome = "QTD_COR_NEG", descricao = "Quantidade de correção negativa de apontamento ocorrido em período de apuração anterior", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdCorNeg;

    @Campo(numero = 8, nome = "ORIGEM", descricao = "Origem da correção: 1 - correção de apontamento de produção e/ou consumo relativo aos Registros K230/K235; 2 - correção de apontamento de produção e/ou consumo relativo aos Registros K250/K255; 3 - correção de apontamento de desmontagem e/ou consumo relativo aos Registros K210/K215; 4 - correção de apontamento de reprocessamento/reparo e/ou consumo relativo aos Registros K260/K265; 5 - correção de apontamento de movimentação interna relativo ao Registro K220; 6 – correção de apontamento de produção relativo ao Registro K291; 7 – correção de apontamento de consumo relativo ao Registro K292; 8 – correção de apontamento de produção relativo ao Registro K301; 9 – correção de apontamento de consumo relativo ao Registro K302.", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private OrigemCorrecaoApontamento origem;
}