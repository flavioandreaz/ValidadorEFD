package com.example.validade_efd.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.validade_efd.enums.TipoRegistro;

@Service
public class OpenCSVService {   
    public void lerCSV(String filePath) throws IOException {
        List<String> erros = new ArrayList<String>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String linha;
            int numeroDaLinha = 1;            
            while ((linha = reader.readLine()) != null) {
                erros.addAll(validarLinhaCSV(linha, numeroDaLinha)) ;
                numeroDaLinha++;
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + filePath + ": " + e.getMessage());
            throw e; 
        }
    }

 
    private List<String> validarLinhaCSV(String linha, int numeroDaLinha) {
        List<String> erros = TipoRegistro.fromIdentificador(obterIdentificadorRegistro(linha)).getValidador().validarLinha(linha, numeroDaLinha);
        return erros;
    }

    public static String obterIdentificadorRegistro(String linha) {
        if (linha == null || linha.isEmpty()) {
            return null;
        }
    
        String[] campos = linha.split("\\|", -1);
    
        if (campos.length > 0) {
            return campos[0].trim();
        } else {
            return null;
        }
    }
}
