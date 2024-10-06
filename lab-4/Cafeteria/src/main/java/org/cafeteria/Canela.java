package org.cafeteria;

public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComDecorator.getDescricao() + ", Canela";
    }

    @Override
    public double calculaCusto() {
        return bebidaComDecorator.calculaCusto() + 1.5;
    }
}
