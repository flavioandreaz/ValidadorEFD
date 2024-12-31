package com.example.validade_efd.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import com.opencsv.bean.CsvBindByName;

@Entity
@Table(name = "genero_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "codigo")
@ToString(of = {"codigo", "descricao"})
@Builder
public class GeneroItem {

    @Id
    @CsvBindByName(column = "COD_GEN")
    @Column(name = "codigo", length = 2, nullable = false)
    private String codigo;

    @CsvBindByName(column = "DESCR")
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    public GeneroItem(String linhaCsv) {
        String[] campos = linhaCsv.split("\\|");
        if (campos.length == 2) {
            this.codigo = campos[0];
            this.descricao = campos[1];
        } else {
            System.err.println("Linha CSV inválida: " + linhaCsv);
            this.codigo = null;
            this.descricao = null;
        }
    }
}
