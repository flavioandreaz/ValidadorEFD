package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC300 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C300\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 4, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String sub;

    @Campo(numero = 5, nome = "NUM_DOC_INI", descricao = "Número do documento fiscal inicial", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocIni;

    @Campo(numero = 6, nome = "NUM_DOC_FIN", descricao = "Número do documento fiscal final", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDocFin;

    @Campo(numero = 7, nome = "DT_DOC", descricao = "Data da emissão dos documentos fiscais", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 8, nome = "VL_DOC", descricao = "Valor total dos documentos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 9, nome = "VL_PIS", descricao = "Valor total do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 10, nome = "VL_COFINS", descricao = "Valor total da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;

    @Campo(numero = 11, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codCta;
}