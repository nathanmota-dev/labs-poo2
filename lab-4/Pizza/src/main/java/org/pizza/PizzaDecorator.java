package org.pizza;

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaComDecorator;

    public PizzaDecorator(Pizza pizza){
        this.pizzaComDecorator = pizza;
    }

    public String descricao(){
        return pizzaComDecorator.descricao();
    }

    public double preco() {
        return pizzaComDecorator.preco();
    }
}
