package com.example.validade_efd.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "codigo_ajuste_apuracao_icms")
public class CodigoAjusteApuracaoICMS {

    @Id
    @Column(name = "codigo", nullable = false, length = 8)
    private String codigo;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
}