package com.locadora.veiculos.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class LocacaoService {

    public void alugarVeiculo() throws JsonProcessingException {
        System.out.println("--ALUGAR VEICULO--");
        System.out.println("\nPreencha com seus dados abaixo:");
        Scanner scDadosP = new Scanner(System.in);

        System.out.println("NOME:");
        String nome = scDadosP.nextLine();

        VerificarCepService verificarCep = new VerificarCepService();

        String json = verificarCep.ConsultarCep();

        ObjectMapper mapper = new ObjectMapper();
        LocacaoService dados =
                mapper.readValue(json, LocacaoService.class);

        System.out.println("\nDADOS DO CLIENTE : "+
                nome+"\n"+dados);
        
    }
}