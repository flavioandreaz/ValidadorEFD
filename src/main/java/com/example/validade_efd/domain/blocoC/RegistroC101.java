package com.example.validade_efd.domain.blocoC;

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
public class RegistroC101 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C101\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "VL_FCP_UF_DEST", descricao = "Valor total relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlFcpUfDest;

    @Campo(numero = 3, nome = "VL_ICMS_UF_DEST", descricao = "Valor total do ICMS Interestadual para a UF de destino", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcmsUfDest;

    @Campo(numero = 4, nome = "VL_ICMS_UF_REM", descricao = "Valor total do ICMS Interestadual para a UF do remetente", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcmsUfRem;
}