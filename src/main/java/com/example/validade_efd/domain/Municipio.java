package com.example.validade_efd.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

@Entity
@Table(name = "municipios")
@Getter 
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@EqualsAndHashCode(of = "id")
@ToString(of = {"codigoIbge", "dataInicio"})
@Builder
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "municipio_id_seq")
    @SequenceGenerator(name = "municipio_id_seq", sequenceName = "municipio_id_sequence", allocationSize = 1) 
    private Long id;

    @CsvBindByName(column = "COD_MUN")
    @Column(name = "codigo_ibge", length = 7, nullable = false)
    private String codigoIbge;

    @CsvBindByName(column = "NOM_MUN" )
    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @CsvDate("ddMMyyyy") 
    @CsvBindByName(column = "DT_INI")
    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @CsvDate("ddMMyyyy") 
    @CsvBindByName(column = "DT_FIM")
    @Column(name = "data_fim")
    private LocalDate dataFim;

    public Municipio(String linhaCsv) {
        String[] campos = linhaCsv.split("\\|");
        if (campos.length >= 3 && campos.length <= 4) {
            this.codigoIbge = campos[0];
            this.nome = campos[1];
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                this.dataInicio = LocalDate.parse(campos[2].trim(), formatter);
                if (campos.length == 4) { 
                    if(isCampoDataFimSemData(campos[3])) {                       
                        this.dataFim = null;
                    }else{
                        this.dataFim = LocalDate.parse(campos[3].trim(), formatter); 
                    }
                } else {
                    this.dataFim = null;
                }
            } catch (DateTimeParseException e) {
                System.err.println("Erro ao converter a data: " + e.getMessage());
                this.dataInicio = null;
                this.dataFim = null;
            }
        } else {
            System.err.println("Linha CSV inválida: " + linhaCsv);
            this.codigoIbge = null;
            this.nome = null;
            this.dataInicio = null;
            this.dataFim = null;
        }
    }  
    
    public boolean isCampoDataFimSemData(String campo) {
        if(campo.trim().equals("")){
            return true;
        }
        return false;
    }
}