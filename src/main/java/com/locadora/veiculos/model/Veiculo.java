package com.locadora.veiculos.model;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private double valor;

    public Veiculo(int ano, String marca, String modelo, double valor) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return """
                MARCA:      %s
                MODELO:     %s
                ANO:        %d
                VALOR:      R$%.2f
                """.formatted(marca, modelo, ano,  valor);
    }
}
