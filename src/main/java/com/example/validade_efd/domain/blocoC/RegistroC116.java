package com.example.validade_efd.domain.blocoC;

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
public class RegistroC116 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C116\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codMod;

    @Campo(numero = 3, nome = "NR_SAT", descricao = "Número de Série do equipamento SAT", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int nrSat;

    @Campo(numero = 4, nome = "CHV_CFE", descricao = "Chave do Cupom Fiscal Eletrônico", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String chvCfe;

    @Campo(numero = 5, nome = "NUM_CFE", descricao = "Número do cupom fiscal eletrônico", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numCfe;

    @Campo(numero = 6, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;
}