package org.estacao;

public class PrefeituraUberlandia implements Observer{
    private float umidade;

    @Override
    public void update(float temperatura, float umidade, float vento) {
        this.umidade = umidade;
        emitirAlertaDefesaCivil();
    }

    private void emitirAlertaDefesaCivil() {
        if (umidade < 30) {
            System.out.println("Prefeitura de Uberlândia: Alerta de baixa umidade! A umidade está em " + umidade + "%.");
        }
    }
}
