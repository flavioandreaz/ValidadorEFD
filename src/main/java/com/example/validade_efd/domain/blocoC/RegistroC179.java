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
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC179 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C179\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "BC_ST_ORIG_DEST", descricao = "Valor da base de cálculo ST na origem/destino em operações interestaduais.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double bcStOrigDest;

    @Campo(numero = 3, nome = "ICMS_ST_REP", descricao = "Valor do ICMS-ST a repassar/deduzir em operações interestaduais", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double icmsStRep;

    @Campo(numero = 4, nome = "ICMS_ST_COMPL", descricao = "Valor do ICMS-ST a complementar à UF de destino", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double icmsStCompl;

    @Campo(numero = 5, nome = "BC_RET", descricao = "Valor da BC de retenção em remessa promovida por Substituído intermediário", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double bcRet;

    @Campo(numero = 6, nome = "ICMS_RET", descricao = "Valor da parcela do imposto retido em remessa promovida por substituído intermediário", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double icmsRet;
}