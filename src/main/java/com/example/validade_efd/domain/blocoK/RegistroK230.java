package com.example.validade_efd.domain.blocoK;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK230 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K230\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI_OP", descricao = "Data de início da ordem de produção", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtIniOp;

    @Campo(numero = 3, nome = "DT_FIN_OP", descricao = "Data de conclusão da ordem de produção", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtFinOp;

    @Campo(numero = 4, nome = "COD_DOC_OP", descricao = "Código de identificação da ordem de produção", tipo = TipoCampo.C, tamanho = 30, obrigatorio = false)
    private String codDocOp;

    @Campo(numero = 5, nome = "COD_ITEM", descricao = "Código do item produzido (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 6, nome = "QTD_ENC", descricao = "Quantidade de produção acabada", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdEnc;
}