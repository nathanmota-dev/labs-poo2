package org.cafeteria;

public class Chantilly extends BebidaDecorator{
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComDecorator.getDescricao() + ", Chantilly";
    }

    @Override
    public double calculaCusto() {
        return bebidaComDecorator.calculaCusto() + 5.0;
    }
}
