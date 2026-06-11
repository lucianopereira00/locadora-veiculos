package com.locadora.veiculos;

import com.locadora.veiculos.service.LocacaoService;
import com.locadora.veiculos.service.MenuInicialService;
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

        MenuInicialService menu = new MenuInicialService();
        menu.exibirMenu();

        LocacaoService alocarVeiculo = new LocacaoService();
        alocarVeiculo.alugarVeiculo();
    }
    public static void main(String[] args) {
		SpringApplication.run(AlocadoraApplication.class, args);
    }
}
