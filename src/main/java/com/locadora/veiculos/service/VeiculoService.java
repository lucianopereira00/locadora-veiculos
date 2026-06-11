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
        carros.add(new Carro(2022, "BMW", "X1", 1200.00));
        carros.add(new Carro(2018, "MERCÊDES", "CLA-45", 1600.0));
        carros.add(new Carro(2018, "VOLVO", "XC-60", 900.0));

    }
    public void Motocicletas(){
        moto.add(new Motocicletas(2019, "HONDA", "Africa Twin", 599.00));
        moto.add(new Motocicletas(2020, "BMW", "GS 1200", 349.00));
        moto.add(new Motocicletas(2019, "YAMAHA", "XJ-6",300.00));
    }

    public void listarCarros(){
        System.out.println("\n--- CARROS ---");

        for (int i = 0; i < carros.size(); i++) {
            System.out.println((i + 1) + "-\n" + carros.get(i));
        }
    }
    public void listarMotocicletas(){
        System.out.println("\n--- MOTOCICLETAS ---");

        for(int i = 0; i < moto.size(); i++){
            System.out.println((i + 1)+"-\n"+ moto.get(i));
        }
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public ArrayList<Motocicletas> getMotocicletas(){
        return moto;
    }
}
