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
public class RegistroK210 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K210\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INI_OS", descricao = "Data de início da ordem de serviço", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtIniOs;

    @Campo(numero = 3, nome = "DT_FIN_OS", descricao = "Data de conclusão da ordem de serviço", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private LocalDate dtFinOs;

    @Campo(numero = 4, nome = "COD_DOC_OS", descricao = "Código de identificação da ordem de serviço", tipo = TipoCampo.C, tamanho = 30, obrigatorio = false)
    private String codDocOs;

    @Campo(numero = 5, nome = "COD_ITEM_ORI", descricao = "Código do item de origem (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItemOri;

    @Campo(numero = 6, nome = "QTD_ORI", descricao = "Quantidade de origem – saída do estoque", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtdOri;
}