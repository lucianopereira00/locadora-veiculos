package com.locadora.veiculos.service;

import com.locadora.veiculos.model.Carro;
import com.locadora.veiculos.model.Motocicletas;
import com.locadora.veiculos.model.Veiculo;

import java.util.ArrayList;

public class VeiculoService {

    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Motocicletas> moto = new ArrayList<>();

    public VeiculoService() {
        Carros();
        Motocicletas();
    }

    public void Carros(){
        carros.add(new Carro(2022, "X1", "BMW", 1200.00));
        carros.add(new Carro(2018, "CLA-45", "MERCÊDES", 1600.0));
        carros.add(new Carro(2018, "XC-60", "VOLVO", 900.0));

    }
    public void Motocicletas(){
        moto.add(new Motocicletas(2019, "HONDA", "Africa Twin", 599.00));
        moto.add(new Motocicletas(2020, "BMW", "GS 1200", 349.00));
        moto.add(new Motocicletas(2019, "YAMAHA", "XJ-6",300.00));
    }

    public void listarCarros(){
        System.out.println("\n--- CARROS ---");

        for (Carro carro : carros){
            System.out.println(carro);
        }
    }
    public void listarMotocicletas(){
        System.out.println("\n--- MOTOCICLETAS ---");

        for(Motocicletas motocicletas : moto){
            System.out.println(motocicletas);
        }
    }
}
