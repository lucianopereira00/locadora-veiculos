package com.locadora.veiculos.service;

import java.net.http.HttpClient;
import java.util.Scanner;

public class MenuInicialService {

    private VeiculoService veiculoService = new VeiculoService();

    public void exibirMenu() {

        Scanner sc = new Scanner(System.in);
        String msgInicial = """
                    ALOCADORA DE VEICULOS 
                
                Bem-vindo(a), confira nosso menu:
                """;
        System.out.println(msgInicial);

        System.out.println("Veiculos disponiveis:");
        System.out.println("1 - Motocicletas");
        System.out.println("2 - Carros");
        System.out.println("Digite o numero do tipo de veiculo desejado: ");

        int respostaMenu = sc.nextInt();

        while (respostaMenu != 1 && respostaMenu != 2) {
            System.out.println("Você escolheu: " + respostaMenu);
            System.out.println("Opção inválida!");
            System.out.println("Tente novamente:");
            respostaMenu = sc.nextInt();
        }
        switch (respostaMenu) {
            case 1:
                veiculoService.listarMotocicletas();
                break;
            case 2:
                veiculoService.listarCarros();
                break;
        }
        sc.nextLine();
        System.out.println("Deseja continuar para alugar seu veiculo? (S/N)");
        String respContinuacao = sc.nextLine();
        if (!respContinuacao.equalsIgnoreCase("S")) {
            System.out.println("Sistema encerrado!");
            return;
        }
        System.out.println("Seguindo para a pagina de alocação...");
        }
    }