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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroC350 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C350\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 3, nome = "SUB_SER", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String subSer;

    @Campo(numero = 4, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDoc;

    @Campo(numero = 5, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 6, nome = "CNPJ_CPF", descricao = "CNPJ ou CPF do destinatário", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpf;

    @Campo(numero = 7, nome = "VL_MERC", descricao = "Valor das mercadorias constantes no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlMerc;

    @Campo(numero = 8, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 9, nome = "VL_DESC", descricao = "Valor total do desconto", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 10, nome = "VL_PIS", descricao = "Valor total do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 11, nome = "VL_COFINS", descricao = "Valor total da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;

    @Campo(numero = 12, nome = "COD_CTA", descricao = "Código da conta analítica contábil debitada/creditada", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codCta;
}