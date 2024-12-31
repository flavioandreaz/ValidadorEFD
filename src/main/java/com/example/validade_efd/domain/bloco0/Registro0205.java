package com.example.validade_efd.domain.bloco0;

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
public class Registro0205 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0205\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DESCR_ANT_ITEM", descricao = "Descrição anterior do item", tipo = TipoCampo.C, obrigatorio = false)
    private String descrAntItem;

    @Campo(numero = 3, nome = "DT_INI", descricao = "Data inicial de utilização da descrição do item", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;

    @Campo(numero = 4, nome = "DT_FIM", descricao = "Data final de utilização da descrição do item", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFim;

    @Campo(numero = 5, nome = "COD_ANT_ITEM", descricao = "Código anterior do item com relação à última informação apresentada", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codAntItem;
}
