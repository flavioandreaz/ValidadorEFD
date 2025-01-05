package com.example.validade_efd.domain.blocoC;

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
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroC160 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C160\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_PART", descricao = "Código do participante (campo 02 do Registro 0150): - transportador, se houver", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String codPart;

    @Campo(numero = 3, nome = "VEIC_ID", descricao = "Placa de identificação do veículo automotor", tipo = TipoCampo.C, tamanho = 7, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String veicId;

    @Campo(numero = 4, nome = "QTD_VOL", descricao = "Quantidade de volumes transportados", tipo = TipoCampo.N, obrigatorioEntrada = false, obrigatorioSaida = true)
    private int qtdVol;

    @Campo(numero = 5, nome = "PESO_BRT", descricao = "Peso bruto dos volumes transportados (em Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double pesoBrt;

    @Campo(numero = 6, nome = "PESO_LIQ", descricao = "Peso líquido dos volumes transportados (em Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double pesoLiq;

    @Campo(numero = 7, nome = "UF_ID", descricao = "Sigla da UF da placa do veículo", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ufId;
}