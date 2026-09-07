package com.locadora.veiculos.service.ProcessoPagamento;

import java.util.Scanner;

public class ProcessoPagamentoService {
    public void iniciarPagamento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Página de Pagamento ===\n");

        System.out.println(" -ESCOLHA SEU METODO DE PAGAMENTO-");
        System.out.println("1 - Cartão ");
        System.out.println("2 - Pix ");

        var escolhaOpc = sc.nextInt();


        while (true) {
            if (escolhaOpc == 1) {
                System.out.println("\nMeio de pagamento escolhido: CARTÃO\n");
                System.out.println("aguarde alguns instantes...");
                new PagamentoCartao().PagarNoCartao();
                break;
            }else if (escolhaOpc == 2) {
                System.out.println("\nMeio de pagamento escolhido: Pix\n");
                System.out.println("aguarde alguns instantes...");
                new PagamentoPix().PagarNoPix();
                break;
            }else{
                System.out.println("\nOpção inválida! Tente novamente:");
                escolhaOpc = sc.nextInt();
            }
        }
    }
}
