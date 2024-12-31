package com.example.validade_efd.dto;

import lombok.Data;
import java.time.LocalDate;

import com.example.validade_efd.domain.Municipio;
import org.springframework.beans.BeanUtils;

@Data
public class MunicipioDTO {
    private String codigoIbge;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public static MunicipioDTO from(Municipio municipio) {

        MunicipioDTO dto = new MunicipioDTO(); 
        BeanUtils.copyProperties(municipio, dto); 
        return dto;
    }
}