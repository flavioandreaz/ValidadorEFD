package com.example.validade_efd.enums;

public enum PerfilArquivo {
    A("Perfil A"), // Exemplo: Perfil completo
    B("Perfil B"), // Exemplo: Perfil simplificado
    C("Perfil C"); // Exemplo: Perfil específico

    private final String descricao;

    PerfilArquivo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao; // Retorna a descrição para melhor visualização
    }
}