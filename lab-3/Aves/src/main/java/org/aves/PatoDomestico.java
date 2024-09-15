package org.aves;

public class PatoDomestico extends Pato{

    @Override
    public void voar() {
        System.out.println("O pato doméstico está voando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pato doméstico faz quá quá.");
    }
}
