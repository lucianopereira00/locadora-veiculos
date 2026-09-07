package com.locadora.veiculos.service.ProcessoPagamento;

import java.util.Scanner;

public class PagamentoCartao {
    Scanner sc = new Scanner(System.in);

    public void PagarNoCartao(){
        System.out.println("-PAGAMENTO VIA CARTAO-");
        System.out.println("1 - Debito");
        System.out.println("2 - Credito");

        var Opcao = sc.nextInt();
        sc.nextLine();
        while (true){
            if (Opcao == 1 || Opcao == 2) {
                DadosCartao cartao = new DadosCartao(
                        lerCampo("Digite o nome do titular:"),
                        lerCampo("Digite o número do cartão:"),
                        lerCampo("Digite a data de validade:"),
                        lerCampo("Digite o CVV:")
                );
                break;
            }else{
                Opcao = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.println("Pagamento sendo processado...");
        System.out.println("Pagamento concluido");
    }
    private String lerCampo(String mensagem) {
        System.out.println(mensagem);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        new PagamentoCartao().PagarNoCartao();
    }
}
