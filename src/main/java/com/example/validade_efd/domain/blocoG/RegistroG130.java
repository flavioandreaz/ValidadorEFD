package com.example.validade_efd.domain.blocoG;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.annotations.MetadadosRegistro;
import com.example.validade_efd.enums.IndicadorEmitenteDocumento;
import com.example.validade_efd.enums.OcorrenciaRegistro;
import com.example.validade_efd.enums.TipoCampo;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@MetadadosRegistro(nivelHierarquico = 4, ocorrencia = OcorrenciaRegistro.UM_PARA_N)
public class RegistroG130 {

    @Campo(numero = 1, nome = "REG", descricao = "Texto fixo contendo \"G130\"", tipo = TipoCampo.C, tamanho = 4, obrigatorio = true)
    private String reg;

    @Campo(numero = 2, nome = "IND_EMIT", descricao = "Indicador do emitente do documento fiscal: 0- Emissão própria; 1- Terceiros", tipo = TipoCampo.C, tamanho = 1, obrigatorio = true)
    private IndicadorEmitenteDocumento indEmit;

    @Campo(numero = 3, nome = "COD_PART", descricao = "Código do participante: - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas", tipo = TipoCampo.C, tamanho = 60, obrigatorio = true)
    private String codPart;

    @Campo(numero = 4, nome = "COD_MOD", descricao = "Código do modelo de documento fiscal, conforme tabela 4.1.1", tipo = TipoCampo.C, tamanho = 2, obrigatorio = true)
    private String codMod;

    @Campo(numero = 5, nome = "SERIE", descricao = "Série do documento fiscal", tipo = TipoCampo.C, tamanho = 3, obrigatorio = false)
    private String serie;

    @Campo(numero = 6, nome = "NUM_DOC", descricao = "Número de documento fiscal", tipo = TipoCampo.N, tamanho = 9, obrigatorio = true)
    private int numDoc;

    @Campo(numero = 7, nome = "CHV_NFE_CTE", descricao = "Chave do documento fiscal eletrônico", tipo = TipoCampo.N, tamanho = 44, obrigatorio = false)
    private String chvNfeCte;

    @Campo(numero = 8, nome = "DT_DOC", descricao = "Data da emissão do documento fiscal", tipo = TipoCampo.N, tamanho = 8, obrigatorio = true)
    private LocalDate dtDoc;
}