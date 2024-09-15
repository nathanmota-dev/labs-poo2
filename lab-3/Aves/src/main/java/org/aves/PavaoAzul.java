package org.aves;

public class PavaoAzul extends Pavao{

    @Override
    public void voar() {
        throw new UnsupportedOperationException("O pavão azul não pode voar.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pavão azul faz qué qué.");
    }
}
