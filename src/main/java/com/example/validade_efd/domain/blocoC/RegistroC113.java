package com.example.validade_efd.domain.blocoC;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorTipoOperacao;
import com.example.validade_efd.enums.IndicadorEmitenteDocumento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroC113 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"C113\"", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_OPER", descricao = "Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorTipoOperacao indOper;

    @Campo(numero = 3, nome = "IND_EMIT", descricao = "Indicador do emitente do título: 0- Emissão própria; 1- Terceiros", tipo = TipoCampo.C, tamanho = 1, obrigatorioEntrada = true, obrigatorioSaida = true)
    private IndicadorEmitenteDocumento indEmit;

    @Campo(numero = 4, nome = "COD_PART", descricao = "Código do participante emitente (campo 02 do Registro 0150) do documento referenciado.", tipo = TipoCampo.C, tamanho = 60, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codPart;

    @Campo(numero = 5, nome = "COD_MOD", descricao = "Código do documento fiscal, conforme a Tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorioEntrada = true, obrigatorioSaida = true)
    private String codMod;

    @Campo(numero = 6, nome = "SER", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 4, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String ser;

    @Campo(numero = 7, nome = "SUB", descricao = "Subsérie do documento fiscal", tipo = TipoCampo.N, tamanho = 3, obrigatorioEntrada = false, obrigatorioSaida = false)
    private Integer sub;

    @Campo(numero = 8, nome = "NUM_DOC", descricao = "Número do documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorioEntrada = true, obrigatorioSaida = true)
    private Integer numDoc;

    @Campo(numero = 9, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal.", tipo = TipoCampo.N, tamanho = 8, obrigatorioEntrada = true, obrigatorioSaida = true)
    private LocalDate dtDoc;

    @Campo(numero = 10, nome = "CHV_DOCe", descricao = "Chave do Documento Eletrônico", tipo = TipoCampo.N, tamanho = 44, obrigatorioEntrada = false, obrigatorioSaida = false)
    private String chvDocE;
}