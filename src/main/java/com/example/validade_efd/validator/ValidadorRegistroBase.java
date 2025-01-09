package com.example.validade_efd.validator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.validade_efd.annotations.Campo;
import com.example.validade_efd.domain.Registro;
import com.example.validade_efd.enums.TipoCampo;

public class ValidadorRegistroBase {
    protected String validarLinhaNulaOuVazia(String linha, int numeroDaLinha) {
        if (linha == null || linha.isEmpty()) {
            return "Linha " + numeroDaLinha + ": Linha nula ou vazia.";
        }
        return null; // Retorna null se a linha não for nula nem vazia
    }

    protected String validarTamanhoLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) {
        String[] campos = linha.split("\\|");
        int numeroDeCamposEsperado = Registro.obterNumeroDeCamposAnotados(classeRegistro);
        if (campos.length != numeroDeCamposEsperado) {
            return "Linha " + numeroDaLinha + ": Número incorreto de campos. Esperado: " + numeroDeCamposEsperado + ", encontrado: " + campos.length + ". Registro: " + classeRegistro.getSimpleName();
        }
        return null;
    }

    protected List<String> validarTipoCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class);  
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if (campo.tipo() == TipoCampo.N && !valorCampo.matches("-?\\d+(\\.\\d+)?")) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + campo.numero() + "): Valor '" + valorCampo + "' inválido. Esperado valor numérico (inteiro ou decimal).");
            }
        }
        return erros;
    }

    protected List<String> validarTamanhoLimiteCaracteresCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class); 
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if (campo.tamanho() > 0 &&   valorCampo.length() != campo.tamanho()) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + valorCampo.length() + "): Tamanho inválido. Esperado " + campo.tamanho() + " caracteres.");
                continue;
            }
            if(campo.limiteCaracteres() > 0 && valorCampo.length() > campo.limiteCaracteres()) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + valorCampo.length() + "): Excedeu o limite de " + campo.limiteCaracteres() + " caracteres.");
            }
        }
        return erros;
    }

    protected List<String> validarObrigatorioCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class); 
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if(campo.obrigatorio() && (valorCampo == null || valorCampo.isEmpty()) ) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + campo.numero() + "): Campo obrigatório não preenchido.");
            }
        }
        return erros;
    }

    protected List<String> validarValorEmEnumCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class); 
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if(field.getType().isEnum()){
                Enum<?>[] enumConstants = (Enum<?>[]) field.getType().getEnumConstants();
                boolean valorValido = false;
                for (Enum<?> enumConstant : enumConstants) {
                    if(enumConstant.name().equals(valorCampo)){
                        valorValido = true;
                        break;
                    }
                }
                if(!valorValido){
                    erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + campo.numero() + "): Valor inválido. Esperado um dos valores: " + enumConstants);
                }
            }
        }
        return erros;
    }

    protected List<String> validarObrigatorioEntradaCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class); 
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if(campo.obrigatorioEntrada() && (valorCampo == null || valorCampo.isEmpty()) ) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + campo.numero() + "): Campo obrigatório não preenchido.");
            }
        }
        return erros;
    }

    protected List<String> validarObrigatorioSaidaCamposNaLinha(String linha, int numeroDaLinha, Class<? extends Registro> classeRegistro) { 
        List<String> erros = new ArrayList<>();
        String[] campos = linha.split("\\|");
        for (Field field : classeRegistro.getDeclaredFields()) {
            Campo campo = field.getAnnotation(Campo.class); 
            if (campo == null) {
                continue;
            }
            String valorCampo = campos[campo.numero()].trim();
            if(campo.obrigatorioSaida() && (valorCampo == null || valorCampo.isEmpty()) ) {
                erros.add("Linha " + numeroDaLinha + ", Campo " + campo.nome() + " (" + campo.numero() + "): Campo obrigatório não preenchido.");
            }
        }
        return erros;
    }

    public boolean adicionarErro(String erro, List<String> erros) {
        if (erro != null) {
            erros.add(erro);
            return true;
        }
        return false;
    }

    public boolean adicionarErro(List<String> erro, List<String> erros) {
        if (erro != null) {
            List<String> errosFiltrados = erro.stream()
                    .filter(mensagemErro -> mensagemErro != null) // Filtra elementos nulos
                    .collect(Collectors.toList()); // Coleta os elementos não nulos em uma nova lista
            erros.addAll(errosFiltrados);
            return !errosFiltrados.isEmpty();
        }
        return false;
    }
} 
