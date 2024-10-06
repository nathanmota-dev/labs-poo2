package org.cafeteria;

abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaComDecorator;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaComDecorator = bebida;
    }

    @Override
    public String getDescricao() {
        return bebidaComDecorator.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return bebidaComDecorator.calculaCusto();
    }
}
