package com.example.validade_efd.domain.blocoD;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoTransporte;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;
import com.example.validade_efd.domain.Municipio;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_UM)
public class RegistroD161 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"D161\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_CARGA", descricao = "Indicador do tipo de transporte da carga coletada", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoTransporte indCarga;

    @Campo(numero = 3, nome = "CNPJ_CPF_COL", descricao = "Número do CNPJ ou CPF do local da coleta", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpfCol;

    @Campo(numero = 4, nome = "IE_COL", descricao = "Inscrição Estadual do contribuinte do local de coleta", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieCol;

    @Campo(numero = 5, nome = "COD_MUN_COL", descricao = "Código do Município do local de coleta, conforme tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunCol;

    @Campo(numero = 6, nome = "CNPJ_CPF_ENTG", descricao = "Número do CNPJ ou CPF do local da entrega", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpfEntg;

    @Campo(numero = 7, nome = "IE_ENTG", descricao = "Inscrição Estadual do contribuinte do local de entrega", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String ieEntg;

    @Campo(numero = 8, nome = "COD_MUN_ENTG", descricao = "Código do Município do local de entrega, conforme tabela IBGE (Preencher com 9999999, se Exterior)", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Municipio codMunEntg;
}