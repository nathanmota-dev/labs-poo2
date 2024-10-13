package org.filmes;

public class PlayerStreaming {
    public void ligar() {
        System.out.println("O Player de streaming está ligado");
    }

    public void play(String filme) {
        System.out.println("O Player está reproduzindo o filme: " + filme);
    }

    public void desligar() {
        System.out.println("O Player de streaming está desligado");
    }
}
