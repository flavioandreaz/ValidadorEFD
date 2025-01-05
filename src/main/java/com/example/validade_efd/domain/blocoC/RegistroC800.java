package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.domain.DocumentoFiscalICMS;
import com.example.validade_efd.enums.CodigoSituacaoDocumento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 2, ocorrencia = OcorrenciaRegistro.VARIAS_VEZES)
public class RegistroC800 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C800\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "COD_MOD", descricao = "Código do modelo do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private DocumentoFiscalICMS codMod;

    @Campo(numero = 3, nome = "COD_SIT", descricao = "Código da situação do documento fiscal, conforme a Tabela 4.1.2", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private CodigoSituacaoDocumento codSit;

    @Campo(numero = 4, nome = "NUM_CFE", descricao = "Número do Cupom Fiscal Eletrônico", tipo = TipoCampo.N, tamanho = 6, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int numCfe;

    @Campo(numero = 5, nome = "DT_DOC", descricao = "Data da emissão do Cupom Fiscal Eletrônico", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 6, nome = "VL_CFE", descricao = "Valor total do Cupom Fiscal Eletrônico", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlCfe;

    @Campo(numero = 7, nome = "VL_PIS", descricao = "Valor total do PIS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlPis;

    @Campo(numero = 8, nome = "VL_COFINS", descricao = "Valor total da COFINS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = false, obrigatorioSaida = true)
    private double vlCofins;

    @Campo(numero = 9, nome = "CNPJ_CPF", descricao = "CNPJ ou CPF do destinatário", tipo = TipoCampo.N, tamanho = 14, obrigatorioEntrada = false, obrigatorioSaida = true)
    private String cnpjCpf;

    @Campo(numero = 10, nome = "NR_SAT", descricao = "Número de Série do equipamento SAT", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private int nrSat;

    @Campo(numero = 11, nome = "CHV_CFE", descricao = "Chave do Cupom Fiscal Eletrônico", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String chvCfe;

    @Campo(numero = 12, nome = "VL_DESC", descricao = "Valor total de descontos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlDesc;

    @Campo(numero = 13, nome = "VL_MERC", descricao = "Valor total das mercadorias e serviços", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlMerc;

    @Campo(numero = 14, nome = "VL_OUT_DA", descricao = "Valor total de outras despesas acessórias e acréscimos", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlOutDa;

    @Campo(numero = 15, nome = "VL_ICMS", descricao = "Valor do ICMS", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlIcms;

    @Campo(numero = 16, nome = "VL_PIS_ST", descricao = "Valor total do PIS retido por subst. trib.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlPisSt;

    @Campo(numero = 17, nome = "VL_COFINS_ST", descricao = "Valor total da COFINS retido por subst. trib.", tipo = TipoCampo.N, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private double vlCofinsSt;
}