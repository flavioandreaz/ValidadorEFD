package com.example.validade_efd.domain.blocoK;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoEstoque;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroK280 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"K280\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_EST", descricao = "Data do estoque final escriturado que está sendo corrigido", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtEst;

    @Campo(numero = 3, nome = "COD_ITEM", descricao = "Código do item (campo 02 do Registro 0200)", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codItem;

    @Campo(numero = 4, nome = "QTD_COR_POS", descricao = "Quantidade de correção positiva de apontamento ocorrido em período de apuração anterior", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdCorPos;

    @Campo(numero = 5, nome = "QTD_COR_NEG", descricao = "Quantidade de correção negativa de apontamento ocorrido em período de apuração anterior", tipo = TipoCampo.N, tamanho = 3, obrigatorio = false)
    private double qtdCorNeg;

    @Campo(numero = 6, nome = "IND_EST", descricao = "Indicador do tipo de estoque: 0 = Estoque de propriedade do informante e em seu poder; 1 = Estoque de propriedade do informante e em posse de terceiros; 2 = Estoque de propriedade de terceiros e em posse do informante", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorTipoEstoque indEst;

    @Campo(numero = 7, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - proprietário/possuidor que não seja o informante do arquivo", tipo = TipoCampo.C, tamanho = 60, obrigatorio = false)
    private String codPart;
}