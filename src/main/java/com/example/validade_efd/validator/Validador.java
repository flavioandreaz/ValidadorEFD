package com.example.validade_efd.validator;

import java.util.List;

public interface Validador {
    List<String> validarLinha(String linha, int numeroDaLinha);
}