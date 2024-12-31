package com.example.validade_efd.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.validade_efd.domain.Municipio;
import com.example.validade_efd.dto.MunicipioDTO;
import com.example.validade_efd.repository.MunicipioRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class MunicipioService {
    @Autowired
    private MunicipioRepository municipioRepository;

    public MunicipioDTO buscarMunicipioPorCodigoIbge(String codigoIbge) {
        return municipioRepository.findByCodigoIbge(codigoIbge)
                .map(MunicipioDTO::from)
                .orElse(null); // ou lançar uma exceção
    }

    public MunicipioDTO salvarMunicipio(MunicipioDTO municipioDTO) {
        Municipio municipio = new Municipio();
        try {
            BeanUtils.copyProperties(municipio, municipioDTO);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error(this.getClass().getCanonicalName() + " erro ao copiar propriedades", e);
            throw new RuntimeException("Erro ao copiar propriedades", e);
        }
        municipio = municipioRepository.save(municipio);
        try {
            MunicipioDTO dtoRetorno = new MunicipioDTO();
            BeanUtils.copyProperties(dtoRetorno, municipio);
            return dtoRetorno;
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error(this.getClass().getCanonicalName() + " erro ao copiar propriedades", e);
            throw new RuntimeException("Erro ao copiar propriedades", e);
        }
    }
}
