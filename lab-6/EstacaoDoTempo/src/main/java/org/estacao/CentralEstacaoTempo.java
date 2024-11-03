package org.estacao;

import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Subject {
    private List<Observer> observers;
    private float temperatura;
    private float umidade;
    private float vento;

    public CentralEstacaoTempo() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, vento);
        }
    }

    public void setDadosClimaticos(float temperatura, float umidade, float vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notifyObservers();
    }
}
