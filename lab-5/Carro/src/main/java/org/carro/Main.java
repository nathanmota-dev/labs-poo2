package org.carro;

public class Main {
    public static void main(String[] args) {
        CarroFachada carro = new CarroFachada();

        carro.iniciarCorrida("97.1 FM - Ribeirão é Difusora!");

        System.out.println();
        System.out.println("============= ");
        System.out.println();

        carro.finalizarCorrida();
    }
}