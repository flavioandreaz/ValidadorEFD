package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroD350 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D350\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "ECF_MOD", descricao = "Modelo do equipamento", tipo = TipoCampo.C, tamanho = 20, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ecfMod;

    @Campo(numero = 4, nome = "ECF_FAB", descricao = "Número de série de fabricação do ECF", tipo = TipoCampo.C, tamanho = 21, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ecfFab;

    @Campo(numero = 5, nome = "ECF_CX", descricao = "Número do caixa atribuído ao ECF", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int ecfCx;
}