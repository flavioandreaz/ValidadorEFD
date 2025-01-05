package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoTransporte;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC115 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C115\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_CARGA", descricao = "Indicador do tipo de transporte: 0 – Rodoviário; 1 – Ferroviário; 2 – Rodo-Ferroviário; 3 – Aquaviário; 4 – Dutoviário; 5 – Aéreo; 9 – Outros.", tipo = TipoCampo.N, tamanho = 1, obrigatorioEntrada = false, obrigatorioSaida = true)
    private IndicadorTipoTransporte indCarga;

    @Campo(numero = 3, nome = "CNPJ_COL", descricao = "Número do CNPJ do contribuinte do local de coleta", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String cnpjCol;

    @Campo(numero = 4, nome = "IE_COL", descricao = "Inscrição Estadual do contribuinte do local de coleta", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String ieCol;

    @Campo(numero = 5, nome = "CPF_COL", descricao = "CPF do contribuinte do local de coleta das mercadorias.", tipo = TipoCampo.N, tamanho = 11, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String cpfCol;

    @Campo(numero = 6, nome = "COD_MUN_COL", descricao = "Código do Município do local de coleta", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codMunCol;

    @Campo(numero = 7, nome = "CNPJ_ENTG", descricao = "Número do CNPJ do contribuinte do local de entrega", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String cnpjEntg;

    @Campo(numero = 8, nome = "IE_ENTG", descricao = "Inscrição Estadual do contribuinte do local de entrega", tipo = TipoCampo.C, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String ieEntg;

    @Campo(numero = 9, nome = "CPF_ENTG", descricao = "CPF do contribuinte do local de entrega", tipo = TipoCampo.N, tamanho = 11, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String cpfEntg;

    @Campo(numero = 10, nome = "COD_MUN_ENTG", descricao = "Código do Município do local de entrega", tipo = TipoCampo.N, tamanho = 7, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String codMunEntg;
}