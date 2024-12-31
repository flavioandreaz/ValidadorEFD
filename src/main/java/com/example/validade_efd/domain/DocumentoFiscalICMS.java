package com.example.validade_efd.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "documento_fiscal_icms")
public class DocumentoFiscalICMS {

    @Id
    @Column(name = "codigo", nullable = false, length = 2)
    private String codigo;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    @Column(name = "modelo", nullable = false, length = 4)
    private String modelo;

    @Column(name = "registro_pai", length = 255)
    private String registroPai;
}