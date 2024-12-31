package com.example.validade_efd.domain.bloco0;

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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class Registro0100 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0100\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "NOME", descricao = "Nome do contabilista", tipo = TipoCampo.C, tamanho = 100, obrigatorio = true)
    private String nome;

    @Campo(numero = 3, nome = "CPF", descricao = "Número de inscrição do contabilista no CPF", tipo = TipoCampo.N, tamanho = 11, obrigatorio = true)
    private String cpf;

    @Campo(numero = 4, nome = "CRC", descricao = "Número de inscrição do contabilista no Conselho Regional de Contabilidade", tipo = TipoCampo.C, tamanho = 15, obrigatorio = true)
    private String crc;

    @Campo(numero = 5, nome = "CNPJ", descricao = "Número de inscrição do escritório de contabilidade no CNPJ, se houver", tipo = TipoCampo.N, tamanho = 14, obrigatorio = false)
    private String cnpj;

    @Campo(numero = 6, nome = "CEP", descricao = "Código de Endereçamento Postal", tipo = TipoCampo.N, tamanho = 8, obrigatorio = false)
    private String cep;

    @Campo(numero = 7, nome = "END", descricao = "Logradouro e endereço do imóvel", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String end;

    @Campo(numero = 8, nome = "NUM", descricao = "Número do imóvel", tipo = TipoCampo.C, tamanho = 10, obrigatorio = false)
    private String num;

    @Campo(numero = 9, nome = "COMPL", descricao = "Dados complementares do endereço", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String compl;

    @Campo(numero = 10, nome = "BAIRRO", descricao = "Bairro em que o imóvel está situado", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String bairro;

    @Campo(numero = 11, nome = "FONE", descricao = "Número do telefone (DDD+FONE)", tipo = TipoCampo.C, tamanho = 11, obrigatorio = false)
    private String fone;

    @Campo(numero = 12, nome = "FAX", descricao = "Número do fax", tipo = TipoCampo.C, tamanho = 11, obrigatorio = false)
    private String fax;

    @Campo(numero = 13, nome = "EMAIL", descricao = "Endereço do correio eletrônico", tipo = TipoCampo.C, obrigatorio = true)
    private String email;

    @Campo(numero = 14, nome = "COD_MUN", descricao = "Código do município, conforme tabela IBGE", tipo = TipoCampo.N, tamanho = 7, obrigatorio = true)
    private String codMun;
}
