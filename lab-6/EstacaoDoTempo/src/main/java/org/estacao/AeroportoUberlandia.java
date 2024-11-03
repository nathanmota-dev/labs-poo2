package org.estacao;

public class AeroportoUberlandia implements Observer {
    private float vento;

    @Override
    public void update(float temperatura, float umidade, float vento) {
        this.vento = vento;
        emitirAlertaVento();
    }

    private void emitirAlertaVento() {
        if (vento > 50) {
            System.out.println("Aeroporto de Uberlândia: Alerta de ventos fortes! A velocidade do vento é " + vento + " km/h.");
        }
    }
}

