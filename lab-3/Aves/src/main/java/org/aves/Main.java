package org.aves;

public class Main {
    public static void main(String[] args) {

        Ave pato = new Pato();
        Ave patoDomestico = new PatoDomestico();

        Pavao pavao = new Pavao();
        Ave pavaoAzul = new PavaoAzul();

        Ave pavaoAdaptado = new PavaoAdapter(pavao);

        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nPavão:");
        try {
            pavao.voar();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        pavao.emitirSom();

        System.out.println("\nPavão Azul:");
        try {
            pavaoAzul.voar();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        pavaoAzul.emitirSom();

        System.out.println("\nPavão Adaptado:");
        pavaoAdaptado.voar();
        pavaoAdaptado.emitirSom();
    }
}
