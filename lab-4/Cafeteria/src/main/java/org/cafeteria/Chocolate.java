package org.cafeteria;

public class Chocolate extends BebidaDecorator{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComDecorator.getDescricao() + ", Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebidaComDecorator.calculaCusto() + 7.0;
    }
}
