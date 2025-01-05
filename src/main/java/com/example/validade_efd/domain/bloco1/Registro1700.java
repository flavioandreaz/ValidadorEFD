package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.CodigoDispositivoAutorizado;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString 
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro1700 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1700\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_DISP", descricao = "Código dispositivo autorizado", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private CodigoDispositivoAutorizado codDisp;

    @Campo(numero = 3, nome = "COD_MOD", descricao = "Código do modelo do dispositivo autorizado, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 4, nome = "SER", descricao = "Série do dispositivo autorizado", tipo = TipoCampo.C, tamanho = 4, obrigatorio = false)
    private String ser;

    @Campo(numero = 5, nome = "SUB", descricao = "Subsérie do dispositivo autorizado", tipo = TipoCampo.C, tamanho = 3, obrigatorio = false)
    private String sub;

    @Campo(numero = 6, nome = "NUM_DOC_INI", descricao = "Número do dispositivo autorizado (utilizado) inicial", tipo = TipoCampo.N, tamanho = 12, obrigatorio = true)
    private long numDocIni;

    @Campo(numero = 7, nome = "NUM_DOC_FIN", descricao = "Número do dispositivo autorizado (utilizado) final", tipo = TipoCampo.N, tamanho = 12, obrigatorio = true)
    private long numDocFin;

    @Campo(numero = 8, nome = "NUM_AUT", descricao = "Número da autorização, conforme dispositivo autorizado", tipo = TipoCampo.N, tamanho = 60, obrigatorio = true)
    private long numAut;
}