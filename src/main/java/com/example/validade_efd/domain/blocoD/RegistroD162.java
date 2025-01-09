package com.example.validade_efd.domain.blocoD;

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
public class RegistroD162 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D162\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 4, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDoc;

    @Campo(numero = 5, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = false, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 6, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlDoc;

    @Campo(numero = 7, nome = "VL_MERC", descricao = "Valor das mercadorias constantes no documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlMerc;

    @Campo(numero = 8, nome = "QTD_VOL", descricao = "Quantidade de volumes transportados", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int qtdVol;

    @Campo(numero = 9, nome = "PESO_BRT", descricao = "Peso bruto dos volumes transportados (em Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double pesoBrt;

    @Campo(numero = 10, nome = "PESO_LIQ", descricao = "Peso líquido dos volumes transportados (em Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double pesoLiq;
}