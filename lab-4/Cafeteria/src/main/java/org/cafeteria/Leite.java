package org.cafeteria;

public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComDecorator.getDescricao() + ", Leite";
    }

    @Override
    public double calculaCusto() {
        return bebidaComDecorator.calculaCusto() + 2.5;
    }
}
