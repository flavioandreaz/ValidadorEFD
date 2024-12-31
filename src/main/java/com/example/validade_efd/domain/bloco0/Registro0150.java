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
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro0150 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0150\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART", descricao = "Código de identificação do participante no arquivo", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codPart;

    @Campo(numero = 3, nome = "NOME", descricao = "Nome pessoal ou empresarial do participante", tipo = TipoCampo.C, tamanho = 100, obrigatorio = true)
    private String nome;

    @Campo(numero = 4, nome = "COD_PAIS", descricao = "Código do país do participante, conforme a tabela indicada no item 3.2.1", tipo = TipoCampo.N, tamanho = 5, obrigatorio = true)
    private String codPais;

    @Campo(numero = 5, nome = "CNPJ", descricao = "CNPJ do participante", tipo = TipoCampo.N, tamanho = 14, obrigatorio = false)
    private String cnpj;

    @Campo(numero = 6, nome = "CPF", descricao = "CPF do participante", tipo = TipoCampo.N, tamanho = 11, obrigatorio = false)
    private String cpf;

    @Campo(numero = 7, nome = "IE", descricao = "Inscrição Estadual do participante", tipo = TipoCampo.C, tamanho = 14, obrigatorio = false)
    private String ie;

    @Campo(numero = 8, nome = "COD_MUN", descricao = "Código do município, conforme a tabela IBGE", tipo = TipoCampo.N, tamanho = 7, obrigatorio = false)
    private String codMun;

    @Campo(numero = 9, nome = "SUFRAMA", descricao = "Número de inscrição do participante na SUFRAMA", tipo = TipoCampo.C, tamanho = 9, obrigatorio = false)
    private String suframa;

    @Campo(numero = 10, nome = "END", descricao = "Logradouro e endereço do imóvel", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String end;

    @Campo(numero = 11, nome = "NUM", descricao = "Número do imóvel", tipo = TipoCampo.C, tamanho = 10, obrigatorio = false)
    private String num;

    @Campo(numero = 12, nome = "COMPL", descricao = "Dados complementares do endereço", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String compl;

    @Campo(numero = 13, nome = "BAIRRO", descricao = "Bairro em que o imóvel está situado", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String bairro;
}
