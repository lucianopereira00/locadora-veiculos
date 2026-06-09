package com.locadora.veiculos.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class VerificarCepService extends LocacaoService {

//    private final String URL = "https://viacep.com.br/ws/";
      //private String cep;
//    private final String API_KEY = "&apikey=1ac5d52f&";


    public void ConsultarCep(String cep) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
