package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.IndicadorEmitente;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;
import com.example.validade_efd.domain.Municipio;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD180 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D180\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "NUM_SEQ", descricao = "Número de ordem sequencial do modal", tipo = TipoCampo.N, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numSeq;

    @Campo(numero = 3, nome = "IND_EMIT", descricao = "Indicador do emitente do documento fiscal", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorEmitente indEmit;

    @Campo(numero = 4, nome = "CNPJ_CPF_EMIT", descricao = "CNPJ ou CPF do participante emitente do modal", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String cnpjCpfEmit;

    @Campo(numero = 5, nome = "UF_EMIT", descricao = "Sigla da unidade da federação do participante emitente do modal", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private UnidadeFederativa ufEmit;

    @Campo(numero = 6, nome = "IE_EMIT", descricao = "Inscrição Estadual do participante emitente do modal", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieEmit;

    @Campo(numero = 7, nome = "COD_MUN_ORIG", descricao = "Código do município de origem do serviço, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOrig;

    @Campo(numero = 8, nome = "CNPJ_CPF_TOM", descricao = "CNPJ/CPF do participante tomador do serviço", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String cnpjCpfTom;

    @Campo(numero = 9, nome = "UF_TOM", descricao = "Sigla da unidade da federação do participante tomador do serviço", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private UnidadeFederativa ufTom;

    @Campo(numero = 10, nome = "IE_TOM", descricao = "Inscrição Estadual do participante tomador do serviço", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieTom;

    @Campo(numero = 11, nome = "COD_MUN_DEST", descricao = "Código do município de destino, conforme a tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;

    @Campo(numero = 12, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 13, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String ser;

    @Campo(numero = 14, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int sub;

    @Campo(numero = 15, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numDoc;

    @Campo(numero = 16, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 17, nome = "VL_DOC", descricao = "Valor total do documento fiscal", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDoc;
}