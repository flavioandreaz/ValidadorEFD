package com.example.validade_efd.domain.bloco0;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.Registro;
import com.example.validade_efd.enums.CodigoFinalidade;
import com.example.validade_efd.enums.CodigoVersao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.PerfilArquivo;
import com.example.validade_efd.enums.TipoAtividade;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.UnidadeFederativa;

@Getter
@ToString


@NoArgsConstructor
@MetadadosRegistro(nivelHierarquico = 0, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class Registro0000 extends Registro {
    
    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0000\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;
    
    @Campo(numero = 2, nome = "COD_VER", descricao = "Código da versão do leiaute conforme a tabela indicada no Ato COTEPE", tipo = TipoCampo.N, tamanho = 3, obrigatorio = true)
    private CodigoVersao codVer;
    
    @Campo(numero = 3, nome = "COD_FIN", descricao = "Código da finalidade do arquivo:", tipo = TipoCampo.N, tamanho = 1, obrigatorio = true)
    private CodigoFinalidade codFim;

    @Campo(numero = 4, nome = "DT_INI", descricao = "Data inicial das informações contidas no arquivo", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtIni;
   
    @Campo(numero = 5, nome = "DT_FIN", descricao = "Data final das informações contidas no arquivo", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtFin;    

    @Campo(numero = 6, nome = "NOME", descricao = "Nome empresarial da entidade", tipo = TipoCampo.C, limiteCaracteres = 100, obrigatorio = true)
    private String nome;

    @Campo(numero = 7, nome = "CNPJ", descricao = "Número de inscrição da entidade no CNPJ", tipo = TipoCampo.N, tamanho = 14, obrigatorio = false)
    private String cnpj;

    @Campo(numero = 8, nome = "CPF", descricao = "Número de inscrição da entidade no CPF", tipo = TipoCampo.N, tamanho = 11, obrigatorio = false)
    private String cpf;

    @Campo(numero = 9, nome = "UF", descricao = "Sigla da unidade da federação da entidade", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private UnidadeFederativa uf;

    @Campo(numero = 10, nome = "IE", descricao = "Inscrição Estadual da entidade", tipo = TipoCampo.C, tamanho = 14, obrigatorio = true)
    private String ie;

    @Campo(numero = 11, nome = "COD_MUN", descricao = "Código do município do domicílio fiscal da entidade, conforme a tabela IBGE", tipo = TipoCampo.N, tamanho = 7, obrigatorio = true)
    private int codMun;

    @Campo(numero = 12, nome = "IM", descricao = "Inscrição Municipal da entidade", tipo = TipoCampo.C, obrigatorio = false)
    private String im;

    @Campo(numero = 13, nome = "SUFRAMA", descricao = "Inscrição da entidade na SUFRAMA", tipo = TipoCampo.C, tamanho = 9, obrigatorio = false)
    private String suframa;

    @Campo(numero = 14, nome = "IND_PERFIL", descricao = "Perfil de apresentação do arquivo fiscal", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private PerfilArquivo indPerfil;

    @Campo(numero = 15, nome = "IND_ATIV", descricao = "Indicador de tipo de atividade", tipo = TipoCampo.N, tamanho = 1, obrigatorio = true)
    private TipoAtividade indAtiv;
}   