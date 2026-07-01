package com.locadora.veiculos.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class VerificarCepService {

    public String ConsultarCep() {

        HttpClient client = HttpClient.newHttpClient();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o CEP (8 números): ");
            String cep = sc.nextLine();

            if (!cep.matches("\\d{8}")) {
                System.out.println("CEP inválido! Digite exatamente 8 números.");
                continue;
            }
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                        .build();

                HttpResponse<String> response = client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );
                return response.body();

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Erro ao consultar CEP", e);
            }
        }
    }
}