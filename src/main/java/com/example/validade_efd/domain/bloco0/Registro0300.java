package com.example.validade_efd.domain.bloco0;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.enums.TipoMercadoria;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class Registro0300 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"0300\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_IND_BEM", descricao = "Código individualizado do bem ou componente adotado no controle patrimonial do estabelecimento informante", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codIndBem;

    @Campo(numero = 3, nome = "IDENT_MERC", descricao = "Identificação do tipo de mercadoria: 1 = bem; 2 = componente.", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private TipoMercadoria identMerc;

    @Campo(numero = 4, nome = "DESCR_ITEM", descricao = "Descrição do bem ou componente (modelo, marca e outras características necessárias a sua individualização)", tipo = TipoCampo.C, obrigatorio = true)
    private String descrItem;

    @Campo(numero = 5, nome = "COD_PRNC", descricao = "Código de cadastro do bem principal nos casos em que o bem ou componente (campo 02) esteja vinculado a um bem principal.", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codPrnc;

    @Campo(numero = 6, nome = "COD_CTA", descricao = "Código da conta analítica de contabilização do bem ou componente (campo 06 do Registro 0500)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codCta;

    @Campo(numero = 7, nome = "NR_PARC", descricao = "Número total de parcelas a serem apropriadas, segundo a legislação de cada unidade federada", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private Integer nrParc;
}