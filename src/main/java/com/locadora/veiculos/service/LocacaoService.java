package com.locadora.veiculos.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class LocacaoService {

    public void alugarVeiculo() throws JsonProcessingException {
        System.out.println("--ALUGAR VEICULO--");
        System.out.println("\nPreencha com seus dados abaixo:");
        Scanner scDadosP = new Scanner(System.in);

        System.out.println("NOME:");
        String nome = scDadosP.nextLine();

        System.out.println("CEP:");
        String cep = scDadosP.nextLine();
        VerificarCepService verificarCep = new VerificarCepService();

        String json = verificarCep.ConsultarCep(cep);

        ObjectMapper mapper = new ObjectMapper();
        DadosClienteService dados =
                mapper.readValue(json, DadosClienteService.class);

        System.out.println(dados);
        
    }
}