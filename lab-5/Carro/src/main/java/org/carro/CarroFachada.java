package org.carro;

public class CarroFachada {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(){
        motor = new Motor();
        cinto = new CintoSeguranca();
        porta = new Porta();
        farol = new Farol();
        radio = new Radio();
    }

    public void iniciarCorrida(String estacaoPreferida) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacao(estacaoPreferida);
        System.out.println("Carro pronto para dirigir.");
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado.");
    }
}
