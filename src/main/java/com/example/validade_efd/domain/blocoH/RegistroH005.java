package com.example.validade_efd.domain.blocoH;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.MotivoInventario;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 1, ocorrencia = OcorrenciaRegistro.UMA_VEZ)
public class RegistroH005 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"H005\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_INV", descricao = "Data do inventário", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtInv;

    @Campo(numero = 3, nome = "VL_INV", descricao = "Valor total do estoque", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double vlInv;

    @Campo(numero = 4, nome = "MOT_INV", descricao = "Informe o motivo do Inventário: 01 – No final no período; 02 – Na mudança de forma de tributação da mercadoria (ICMS); 03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações; 04 – Na alteração de regime de pagamento – condição do contribuinte; 05 – Por determinação dos fiscos.", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private MotivoInventario motInv;
}