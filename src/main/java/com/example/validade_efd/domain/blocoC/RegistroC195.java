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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC195 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C195\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_OBS", descricao = "Código da observação do lançamento fiscal (campo 02 do Registro 0460)", tipo = TipoCampo.C, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codObs;

    @Campo(numero = 3, nome = "TXT_COMPL", descricao = "Descrição complementar do código de observação.", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String txtCompl;
}