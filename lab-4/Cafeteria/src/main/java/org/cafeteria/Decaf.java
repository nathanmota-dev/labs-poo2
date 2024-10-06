package org.cafeteria;

public class Decaf implements Bebida {
    @Override
    public String getDescricao() {
        return "Café Descafeinado";
    }

    @Override
    public double calculaCusto() {
        return 7.5;
    }
}
