package org.filmes;

public class HomeTheaterFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca pipoca;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public HomeTheaterFachada() {
        amplificador = new Amplificador();
        luzes = new Luzes();
        pipoca = new MaquinaPipoca();
        projetor = new Projetor();
        player = new PlayerStreaming();
        telao = new Telao();
    }

    public void assistirFilme(String filme) {
        pipoca.ligar();
        pipoca.rebentarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        player.ligar();
        player.play(filme);
        System.out.println("O Filme foi iniciado!");
    }

    public void fimDoFilme() {
        player.desligar();
        amplificador.desligar();
        projetor.desligar();
        telao.subir();
        luzes.ligar();
        pipoca.desligar();
        System.out.println("O filme chegou ao Fim!");
    }
}
