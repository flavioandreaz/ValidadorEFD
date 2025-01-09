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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroD695 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D695\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 4, nome = "NRO_ORD_INI", descricao = "Número de ordem inicial", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int nroOrdIni;

    @Campo(numero = 5, nome = "NRO_ORD_FIN", descricao = "Número de ordem final", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int nroOrdFin;

    @Campo(numero = 6, nome = "DT_DOC_INI", descricao = "Data de emissão inicial dos documentos / Data inicial de vencimento da fatura", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDocIni;

    @Campo(numero = 7, nome = "DT_DOC_FIN", descricao = "Data de emissão final dos documentos / Data final do vencimento da fatura", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDocFin;

    @Campo(numero = 8, nome = "NOM_MEST", descricao = "Nome do arquivo Mestre de Documento Fiscal", tipo = TipoCampo.C, tamanho = 33, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String nomMest;

    @Campo(numero = 9, nome = "CHV_COD_DIG", descricao = "Chave de codificação digital do arquivo Mestre de Documento Fiscal", tipo = TipoCampo.C, tamanho = 32, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String chvCodDig;
}