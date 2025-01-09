package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.domain.Municipio;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroD160 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D160\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "DESPACHO", descricao = "Identificação do número do despacho", tipo = TipoCampo.C, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String despacho;

    @Campo(numero = 3, nome = "CNPJ_CPF_REM", descricao = "CNPJ ou CPF do remetente das mercadorias que constam na nota fiscal", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpfRem;

    @Campo(numero = 4, nome = "IE_REM", descricao = "Inscrição Estadual do remetente das mercadorias que constam na nota fiscal", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieRem;

    @Campo(numero = 5, nome = "COD_MUN_ORI", descricao = "Código do Município de origem, conforme tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunOri;

    @Campo(numero = 6, nome = "CNPJ_CPF_DEST", descricao = "CNPJ ou CPF do destinatário das mercadorias que constam na nota fiscal", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpfDest;

    @Campo(numero = 7, nome = "IE_DEST", descricao = "Inscrição Estadual do destinatário das mercadorias que constam na nota fiscal", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieDest;

    @Campo(numero = 8, nome = "COD_MUN_DEST", descricao = "Código do Município de destino, conforme tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunDest;
}