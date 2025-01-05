package com.example.validade_efd.enums;

public enum CodigoClasseEnquadramentoIpi {
    I("I", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002 ou Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    II("II", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002"),
    III_M("III-M", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002"),
    III_R("III-R", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002"),
    IV_M("IV-M", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002"),
    IV_R("IV-R", "Cigarros; 24022000; Art. 153 do Decreto 4.544/2002"),
    A("A", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    B("B", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    C("C", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    D("D", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    E("E", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    F("F", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    G("G", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    H("H", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    J("J", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    K("K", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    L("L", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    M("M", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    N("N", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    O("O", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    P("P", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    Q("Q", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    R("R", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    S("S", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    T("T", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    U("U", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    V("V", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    X("X", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    Y("Y", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    Z("Z", "Bebidas \"Quentes\"; 2204 / 2205 / 2206 / 2208; Art. 149 do Decreto 4.544/2002"),
    OUTROS("99999", "Outros produtos");

    private final String codigo;
    private final String descricao;

    CodigoClasseEnquadramentoIpi(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoClasseEnquadramentoIpi fromCodigo(String codigo) {
        for (CodigoClasseEnquadramentoIpi tipo : CodigoClasseEnquadramentoIpi.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}