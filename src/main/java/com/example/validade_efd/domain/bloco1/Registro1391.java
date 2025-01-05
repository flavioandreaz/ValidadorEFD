package com.example.validade_efd.domain.bloco1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 3, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class Registro1391 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"1391\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "DT_REGISTRO", descricao = "Data de produção (DDMMAAAA)", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtRegistro;

    @Campo(numero = 3, nome = "QTD_MOID", descricao = "Quantidade de cana esmagada (toneladas)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double qtdMoid;

    @Campo(numero = 4, nome = "ESTQ_INI", descricao = "Estoque inicial (litros / Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double estqIni;

    @Campo(numero = 5, nome = "QTD_PRODUZ", descricao = "Quantidade produzida (litros / Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double qtdProduz;

    @Campo(numero = 6, nome = "ENT_ANID_HID", descricao = "Entrada de álcool anidro decorrente da transformação do álcool hidratado ou Entrada de álcool hidratado decorrente da transformação do álcool anidro (litros)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double entAnidHid;

    @Campo(numero = 7, nome = "OUTR_ENTR", descricao = "Outras entradas (litros / Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double outrEntr;

    @Campo(numero = 8, nome = "PERDA", descricao = "Evaporação (litros) ou Quebra de peso (Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double perda;

    @Campo(numero = 9, nome = "CONS", descricao = "Consumo (litros)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double cons;

    @Campo(numero = 10, nome = "SAI_ANI_HID", descricao = "Saída para transformação (litros)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double saiAniHid;

    @Campo(numero = 11, nome = "SAIDAS", descricao = "Saídas (litros / Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double saidas;

    @Campo(numero = 12, nome = "ESTQ_FIN", descricao = "Estoque final (litros / Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = true)
    private double estqFin;

    @Campo(numero = 13, nome = "ESTQ_INI_MEL", descricao = "Estoque inicial de mel residual (Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double estqIniMel;

    @Campo(numero = 14, nome = "PROD_DIA_MEL", descricao = "Produção de mel residual (Kg) e entradas de mel (Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double prodDiaMel;

    @Campo(numero = 15, nome = "UTIL_MEL", descricao = "Mel residual utilizado (Kg) e saídas de mel (Kg)", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double utilMel;

    @Campo(numero = 16, nome = "PROD_ALC_MEL", descricao = "Produção de álcool (litros) ou açúcar (Kg) proveniente do mel residual", tipo = TipoCampo.N, tamanho = 2, obrigatorio = false)
    private Double prodAlcMel;

    @Campo(numero = 17, nome = "OBS", descricao = "Observações", tipo = TipoCampo.C, obrigatorio = false)
    private String obs;
}