package org.financeiro;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject{
    private List<Observer> observers;
    private float preco;

    public Acao(float precoInicial) {
        this.preco = precoInicial;
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
            observer.update(preco);
        }
    }

    public void setPreco(float novoPreco) {
        this.preco = novoPreco;
        notifyObservers();
    }

    public float getPreco() {
        return preco;
    }
}
