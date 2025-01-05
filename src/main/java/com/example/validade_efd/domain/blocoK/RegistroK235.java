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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK235 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K235\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_SAIDA", descricao = "Data de saída do estoque para alocação ao produto", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtSaida;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item componente/insumo (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "QTD", descricao = "Quantidade consumida do item", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private double qtd;

    @Campo(numero = 5, nome = "COD_INS_SUBST", descricao = "Código do insumo que foi substituído, caso ocorra a substituição (campo 02 do Registro 0210)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codInsSubst;
}