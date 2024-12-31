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
public class Registro0005 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0005\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "FANTASIA", descricao = "Nome de fantasia associado ao nome empresarial", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String fantasia;

    @Campo(numero = 3, nome = "CEP", descricao = "Código de Endereçamento Postal", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private String cep;

    @Campo(numero = 4, nome = "END", descricao = "Logradouro e endereço do imóvel", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String end;

    @Campo(numero = 5, nome = "NUM", descricao = "Número do imóvel", tipo = TipoCampo.C, tamanho = 10, obrigatorio = false)
    private String num;

    @Campo(numero = 6, nome = "COMPL", descricao = "Dados complementares do endereço", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String compl;

    @Campo(numero = 7, nome = "BAIRRO", descricao = "Bairro em que o imóvel está situado", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String bairro;

    @Campo(numero = 8, nome = "FONE", descricao = "Número do telefone (DDD+FONE)", tipo = TipoCampo.C, tamanho = 11, obrigatorio = false)
    private String fone;

    @Campo(numero = 9, nome = "FAX", descricao = "Número do fax", tipo = TipoCampo.C, tamanho = 11, obrigatorio = false)
    private String fax;

    @Campo(numero = 10, nome = "EMAIL", descricao = "Endereço do correio eletrônico", tipo = TipoCampo.C, obrigatorio = false)
    private String email;
}
