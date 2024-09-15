package org.aves;

public class PavaoAdapter implements Ave{
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        // Aqui foi adaptado o comportamento do pavão
        System.out.println("O pavão não voava, mas agora ele pode.");
    }

    @Override
    public void emitirSom() {
        pavao.emitirSom();
    }
}
