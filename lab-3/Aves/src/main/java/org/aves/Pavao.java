package org.aves;

public class Pavao implements Ave{
    @Override
    public void voar() {
        throw new UnsupportedOperationException("O pavão não pode voar.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pavão faz qué qué.");
    }
}
