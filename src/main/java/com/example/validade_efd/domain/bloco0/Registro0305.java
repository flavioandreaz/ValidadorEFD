package com.example.validade_efd.domain.bloco0;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class Registro0305 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0305\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_CCUS", descricao = "Código do centro de custo onde o bem está sendo ou será utilizado (campo 03 do Registro 0600)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codCcus;

    @Campo(numero = 3, nome = "FUNC", descricao = "Descrição sucinta da função do bem na atividade do estabelecimento", tipo = TipoCampo.C, obrigatorio = true)
    private String func;

    @Campo(numero = 4, nome = "VIDA_UTIL", descricao = "Vida útil estimada do bem, em número de meses", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Integer vidaUtil;
}