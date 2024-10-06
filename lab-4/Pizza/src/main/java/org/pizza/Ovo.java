package org.pizza;

public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public String descricao() {
        return pizzaComDecorator.descricao() + ", Ovo";
    }

    public double preco() {
        return pizzaComDecorator.preco() + 4.0;
    }
}