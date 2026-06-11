package com.locadora.veiculos.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosClienteService(String cep, String regiao, String uf, String localidade){

    @Override
    public String toString() {
        return """
                CEP = %s
                REGIÃO = %s
                UF = %s
                Localidade = %s
                """.formatted(cep, regiao, uf, localidade);
    }
}
