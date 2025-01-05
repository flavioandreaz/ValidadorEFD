package com.example.validade_efd.enums;

public enum CodigoServico {
    // Assinatura
    ASSINATURA_TELEFONIA("0101", "Assinatura de serviços de telefonia"),
    ASSINATURA_DADOS("0102", "Assinatura de serviços de comunicação de dados"),
    ASSINATURA_TV("0103", "Assinatura de serviços de TV por Assinatura"),
    ASSINATURA_INTERNET("0104", "Assinatura de serviços de provimento à internet"),
    ASSINATURA_MULTIMIDIA("0105", "Assinatura de outros serviços de multimídia"),
    ASSINATURA_OUTROS("0199", "Assinatura de outros serviços"),

    // Habilitação
    HABILITACAO_TELEFONIA("0201", "Habilitação de serviços de telefonia"),
    HABILITACAO_DADOS("0202", "Habilitação de serviços de comunicação de dados"),
    HABILITACAO_TV("0203", "Habilitação de TV por Assinatura"),
    HABILITACAO_INTERNET("0204", "Habilitação de serviços de provimento à internet"),
    HABILITACAO_MULTIMIDIA("0205", "Habilitação de outros serviços multimídia"),
    HABILITACAO_OUTROS("0299", "Habilitação de outros serviços"),

    // Serviço Medido
    SERVICO_MEDIDO_LOCAIS("0301", "Serviço Medido - chamadas locais"),
    SERVICO_MEDIDO_INTERURBANAS_ESTADO("0302", "Serviço Medido - chamadas interurbanas no Estado"),
    SERVICO_MEDIDO_INTERURBANAS_FORA_ESTADO("0303", "Serviço Medido - chamadas interurbanas para fora do Estado"),
    SERVICO_MEDIDO_INTERNACIONAIS("0304", "Serviço Medido - chamadas internacionais"),
    SERVICO_MEDIDO_NUMEROS_ESPECIAIS("0305", "Serviço Medido - Números Especiais (0300/0500/0600/0800/etc.)"),
    SERVICO_MEDIDO_DADOS("0306", "Serviço Medido - comunicação de dados"),
    SERVICO_MEDIDO_ROAMING_ORIGINADAS("0307", "Serviço Medido - chamadas originadas em Roaming"),
    SERVICO_MEDIDO_ROAMING_RECEBIDAS("0308", "Serviço Medido - chamadas recebidas em Roaming"),
    SERVICO_MEDIDO_ADICIONAL_CHAMADA("0309", "Serviço Medido - adicional de chamada"),
    SERVICO_MEDIDO_INTERNET("0310", "Serviço Medido - provimento de acesso à Internet"),
    SERVICO_MEDIDO_PAY_PER_VIEW("0311", "Serviço Medido - pay-per-view (programação TV)"),
    SERVICO_MEDIDO_SMS("0312", "Serviço Medido - Mensagem SMS"),
    SERVICO_MEDIDO_MMS("0313", "Serviço Medido - Mensagem MMS"),
    SERVICO_MEDIDO_OUTRAS_MENSAGENS("0314", "Serviço Medido - outros mensagens"),
    SERVICO_MEDIDO_MULTIMIDIA("0315", "Serviço Medido - serviço multimídia"),
    SERVICO_MEDIDO_OUTROS("0399", "Serviço Medido - outros serviços"),

    // Serviço pré-pago
    PRE_PAGO_CARTAO_FIXA("0401", "Cartão Telefônico - Telefonia Fixa"),
    PRE_PAGO_CARTAO_MOVEL("0402", "Cartão Telefônico - Telefonia Móvel"),
    PRE_PAGO_CARTAO_INTERNET("0403", "Cartão de Provimento de acesso à internet"),
    PRE_PAGO_FICHA("0404", "Ficha Telefônica"),
    PRE_PAGO_RECARGA_FIXA("0405", "Recarga de Créditos - Telefonia Fixa"),
    PRE_PAGO_RECARGA_MOVEL("0406", "Recarga de Créditos - Telefonia Móvel"),
    PRE_PAGO_RECARGA_INTERNET("0407", "Recarga de Créditos - Provimento de acesso à Internet"),
    PRE_PAGO_OUTRAS_COBRANCAS("0499", "Outras cobranças realizadas de assinantes de plano serviço pré-pago"),

    // Outros Serviços
    OUTROS_SERVICOS_ADICIONAL("0501", "Serviço Adicional (substituição de número, troca de aparelho, emissão de 2ª via de conta, conta detalhada, etc.)"),
    OUTROS_SERVICOS_FACILIDADES("0502", "Serviço Facilidades (identificador de chamadas, caixa postal, transferência temporária, não-perturbe, etc.)"),
    OUTROS_SERVICOS_OUTROS("0599", "Outros Serviços"),

    // Energia Elétrica
    ENERGIA_ELETRICA_CONSUMO("0601", "Energia Elétrica - Consumo"),
    ENERGIA_ELETRICA_DEMANDA("0602", "Energia Elétrica - Demanda"),
    ENERGIA_ELETRICA_SERVICOS("0603", "Energia Elétrica - Serviços (Vistoria de unidade consumidora, Aferição de Medidor, Ligação, Religação, Troca de medidor, etc.)"),
    ENERGIA_ELETRICA_ENCARGOS("0604", "Energia Elétrica - Encargos Emergenciais"),
    ENERGIA_ELETRICA_TUSD_CATIVO("0605", "Tarifa de Uso dos Sistemas de Distribuição de Energia Elétrica - TUSD - Consumidor Cativo"),
    ENERGIA_ELETRICA_TUSD_LIVRE("0606", "Tarifa de Uso dos Sistemas de Distribuição de Energia Elétrica - TUSD - Consumidor Livre"),
    ENERGIA_ELETRICA_ENCARGOS_CONEXAO("0607", "Encargos de Conexão"),
    ENERGIA_ELETRICA_TUST_CATIVO("0608", "Tarifa de Uso dos Sistemas de Transmissão de Energia Elétrica - TUST - Consumidor Cativo"),
    ENERGIA_ELETRICA_TUST_LIVRE("0609", "Tarifa de Uso dos Sistemas de Transmissão de Energia Elétrica - TUST - Consumidor Livre"),
    ENERGIA_ELETRICA_SUBVENCAO("0610", "Subvenção econômica para consumidores da subclasse \"baixa renda\""),
    ENERGIA_ELETRICA_OUTROS("0699", "Energia Elétrica - Outros"),

    // Disponibilização de meios ou equipamentos
    DISPONIBILIZACAO_APARELHO_TELEFONICO("0701", "de Aparelho Telefônico"),
    DISPONIBILIZACAO_IDENTIFICADOR_CHAMADAS("0702", "de Aparelho Identificador de chamadas"),
    DISPONIBILIZACAO_MODEM("0703", "de Modem"),
    DISPONIBILIZACAO_RACK("0704", "de Rack"),
    DISPONIBILIZACAO_SALA("0705", "de Sala/Recinto"),
    DISPONIBILIZACAO_ROTEADOR("0706", "de Roteador"),
    DISPONIBILIZACAO_SERVIDOR("0707", "de Servidor"),
    DISPONIBILIZACAO_MULTIPLEXADOR("0708", "de Multiplexador"),
    DISPONIBILIZACAO_DECODIFICADOR("0709", "de Decodificador/Conversor"),
    DISPONIBILIZACAO_OUTRAS("0799", "Outras disponibilizações"),

    // Cobranças
    COBRANCA_SERVICOS_TERCEIROS("0801", "Cobrança de Serviços de Terceiros"),
    COBRANCA_SEGUROS("0802", "Cobrança de Seguros"),
    COBRANCA_FINANCIAMENTO("0803", "Cobrança de Financiamento de Aparelho/Serviços"),
    COBRANCA_JUROS_MORA("0804", "Cobrança de Juros de Mora"),
    COBRANCA_MULTA_MORA("0805", "Cobrança de Multa de Mora"),
    COBRANCA_MESES_ANTERIORES("0806", "Cobrança de Conta de meses anteriores"),
    COBRANCA_TAXA_ILUMINACAO("0807", "Cobrança de Taxa Iluminação Pública"),
    COBRANCA_RETENCAO_ICMS("0808", "Retenção de ICMS-ST"),
    COBRANCA_OUTRAS("0899", "Outras Cobranças"),

    // Deduções
    DEDUCAO_IMPUGNACAO("0901", "Dedução relativa a impugnação de serviços"),
    DEDUCAO_AJUSTE_CONTA("0902", "Dedução referente ajuste de conta"),
    DEDUCAO_ENERGIA_ELETRICA("0903", "Redutor - Energia Elétrica - IN Nº 306/2003 (PIS/COFINS/IRPJ/CSLL)"),
    DEDUCAO_MULTA_INTERRUPCAO("0904", "Dedução relativa à multa pela interrupção de fornecimento"),
    DEDUCAO_DISTRIBUICAO_DIVIDENDOS("0905", "Dedução relativa à distribuição de dividendos Eletrobrás"),
    DEDUCAO_SUBVENCAO("0906", "Dedução relativa à subvenção econômica para consumidores da subclasse \"baixa renda\""),
    DEDUCAO_OUTRAS("0999", "Outras deduções"),

    // Serviço não medido
    SERVICO_NAO_MEDIDO_TELEFONIA("1001", "Serviço não medido de serviços de telefonia"),
    SERVICO_NAO_MEDIDO_DADOS("1002", "Serviço não medido de serviços de comunicação de dados"),
    SERVICO_NAO_MEDIDO_TV("1003", "Serviço não medido de serviços de TV por Assinatura"),
    SERVICO_NAO_MEDIDO_INTERNET("1004", "Serviço não medido de serviços de provimento à internet"),
    SERVICO_NAO_MEDIDO_MULTIMIDIA("1005", "Serviço não medido de outros serviços de multimídia"),
    SERVICO_NAO_MEDIDO_OUTROS("1099", "Serviço não medido de outros serviços"),

    // Cessão de Meios de Rede
    CESSAO_MEIOS_INTERCONEXAO("1101", "Interconexão: Detraf, SMS, MMS"),
    CESSAO_MEIOS_DETRAT("1102", "Detrat, Transmissão"),
    CESSAO_MEIOS_ROAMING("1103", "Roaming"),
    CESSAO_MEIOS_EILD("1104", "Exploração Industrial de Linha Dedicada - EILD"),
    CESSAO_MEIOS_ICMS_PROPORCIONAL("1105", "Lançamento de ICMS proporcional às saídas isentas, não tributadas ou com redução de base de cálculo"),
    CESSAO_MEIOS_CONSUMO_PROPRIO("1106", "Lançamento de ICMS proporcional às cessões de meios destinada a consumo próprio"),
    CESSAO_MEIOS_ICMS_COMPLEMENTAR("1107", "Lançamento de ICMS complementar, na condição de responsável tributário"),
    CESSAO_MEIOS_OUTRAS("1199", "Outras Cessões de Meios de Rede");

    private final String codigo;
    private final String descricao;

    CodigoServico(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CodigoServico fromCodigo(String codigo) {
        for (CodigoServico servico : CodigoServico.values()) {
            if (servico.getCodigo().equals(codigo)) {
                return servico;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}