package org.aves;

public class Pato implements Ave{
    @Override
    public void voar() {
        System.out.println("O pato está voando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pato faz quá quá.");
    }
}
