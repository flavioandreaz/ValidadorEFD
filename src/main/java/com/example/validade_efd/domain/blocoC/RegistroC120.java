package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.CodigoDocumentoImportacao;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC120 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C120\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = false)
    private String reg;

    @Campo(numero = 2, nome = "COD_DOC_IMP", descricao = "Documento de importação: 0 – Declaração de Importação; 1 – Declaração Simplificada de Importação.", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = false)
    private CodigoDocumentoImportacao codDocImp;

    @Campo(numero = 3, nome = "NUM_DOC_IMP", descricao = "Número do documento de Importação.", tipo = TipoCampo.C, tamanho = 12, obrigatorioEntrada = true, obrigatorioSaida = false)
    private String numDocImp;

    @Campo(numero = 4, nome = "PIS_IMP", descricao = "Valor pago de PIS na importação", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double pisImp;

    @Campo(numero = 5, nome = "COFINS_IMP", descricao = "Valor pago de COFINS na importação", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = false)
    private double cofinsImp;

    @Campo(numero = 6, nome = "NUM_ACDRAW", descricao = "Número do Ato Concessório do regime Drawback", tipo = TipoCampo.C, tamanho = 20, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String numAcDraw;
}