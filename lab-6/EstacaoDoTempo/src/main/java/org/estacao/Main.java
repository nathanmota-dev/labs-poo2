package org.estacao;

public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        Observer prefeitura = new PrefeituraUberlandia();
        Observer aeroporto = new AeroportoUberlandia();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        cet.setDadosClimaticos(32, 25, 60);
        cet.setDadosClimaticos(28, 35, 20);
        cet.setDadosClimaticos(30, 29, 55); 
    }
}