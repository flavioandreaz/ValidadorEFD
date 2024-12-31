package com.example.validade_efd.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para o registro 0001, usado para o mapeamento com o OpenCSV.
 */
@Data
@NoArgsConstructor
public class Registro0001DTO {

    /**
     * REG: Tipo de registro (mapeado do CSV).
     */
    @CsvBindByName(column = "reg")
    private String reg;

    /**
     * IND_DAD: Indicador de dados informados (mapeado do CSV).
     */
    @CsvBindByName(column = "indDad")
    private int indDad;
}