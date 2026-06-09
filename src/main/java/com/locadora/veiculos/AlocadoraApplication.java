package com.locadora.veiculos;

import com.locadora.veiculos.service.LocacaoService;
import com.locadora.veiculos.service.VeiculoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlocadoraApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        VeiculoService veiculoService = new VeiculoService();
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
            default:
                System.out.println("Opção invalida!");
        }

        System.out.println("Deseja continuar para alugar seu veiculo? (S/N)");
        sc.nextLine();
        String respContinuacao = sc.nextLine();
        if(!respContinuacao.equalsIgnoreCase("S")) {
            System.out.println("Sistema encerrado!");
            return;
        }
        System.out.println("Seguindo para a pagina de alocação...");

        LocacaoService alocarVeiculo = new LocacaoService();
        alocarVeiculo.alugarVeiculo();
    }
    public static void main(String[] args) {
		SpringApplication.run(AlocadoraApplication.class, args);
    }
}
