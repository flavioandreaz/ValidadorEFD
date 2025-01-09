package com.example.validade_efd.domain;

import com.example.validade_efd.annotations.Campo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Registro {

    protected static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public abstract String getReg();

    protected <T extends Registro> T criarRegistroAPartirDaLinha(String[] campos, Class<T> registroClass) {
        try {
            T registro = registroClass.getDeclaredConstructor().newInstance();

            for (Field field : registroClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Campo.class)) {
                    Campo campoAnnotation = field.getAnnotation(Campo.class);
                    int indiceCampo = campoAnnotation.numero();

                    if (indiceCampo > 0 && indiceCampo < campos.length) {
                        String valorCampoStr = campos[indiceCampo].trim();

                        if (!valorCampoStr.isEmpty()) {
                            field.setAccessible(true);
                            try { // Adicionado bloco try-catch para conversão
                                Object valorConvertido = converterValor(valorCampoStr, field.getType(), campoAnnotation.nome());
                                field.set(registro, valorConvertido);
                            } catch (IllegalArgumentException e) {
                                throw new IllegalArgumentException("Erro ao converter campo '" + campoAnnotation.nome() + "': " + e.getMessage());
                            }
                        }
                    }
                }
            }
            return registro;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Erro ao criar registro: " + e.getMessage(), e);
        }
    }

    private Object converterValor(String valor, Class<?> tipo, String nomeCampo) {
        try {
            if (tipo == String.class) {
                return valor;
            } else if (tipo == Integer.class || tipo == int.class) {
                return Integer.parseInt(valor);
            } else if (tipo == Long.class || tipo == long.class) {
                return Long.parseLong(valor);
            } else if (tipo == LocalDate.class) {
                return LocalDate.parse(valor, DATE_FORMATTER);
            } else if (tipo.isEnum()) {
                return Enum.valueOf((Class<Enum>) tipo, valor);
            } else {
                throw new IllegalArgumentException("Tipo de campo não suportado: " + tipo.getName() + " para o campo " + nomeCampo);
            }
        } catch (DateTimeParseException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro ao converter valor '" + valor + "' para o tipo " + tipo.getSimpleName() + " no campo "+ nomeCampo +": " + e.getMessage());
        }
    }

    public static int obterNumeroDeCamposAnotados(Class<?> classeRegistro) {
        int contador = 0;
        for (Field field : classeRegistro.getDeclaredFields()) {
            if (field.isAnnotationPresent(Campo.class)) {
                contador++;
            }
        }
        return contador;
    }
}