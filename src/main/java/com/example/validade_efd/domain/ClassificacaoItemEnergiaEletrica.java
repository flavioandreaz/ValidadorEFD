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
@Table(name = "classificacao_item_energia_eletrica")
public class ClassificacaoItemEnergiaEletrica {

    @Id
    @Column(name = "codigo", nullable = false, length = 4)
    private String codigo;

    @Column(name = "grupo", nullable = false, length = 60)
    private String grupo;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
}