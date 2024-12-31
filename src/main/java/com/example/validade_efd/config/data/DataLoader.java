package com.example.validade_efd.config.data;

import com.example.validade_efd.domain.Municipio;
import com.example.validade_efd.repository.MunicipioRepository;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private MunicipioRepository municipioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String arquivoCsv = "data/municipios.csv";

        try (InputStreamReader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream(arquivoCsv), StandardCharsets.UTF_8)) {

            List<Municipio> municipios = new CsvToBeanBuilder<Municipio>(reader)
                    .withType(Municipio.class)
                    .withSeparator('|')
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();

            municipioRepository.saveAll(municipios);

        } catch (Exception e) {
            System.err.println("Erro ao ler/processar o arquivo CSV: " + e.getMessage());
            e.printStackTrace(); // Para debug, remova em produção
        }
    }
}
