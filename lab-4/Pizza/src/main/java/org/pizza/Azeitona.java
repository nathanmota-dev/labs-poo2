package org.pizza;

public class Azeitona extends PizzaDecorator {
    public Azeitona(Pizza pizza) {
        super(pizza);
    }

    public String descricao() {
        return pizzaComDecorator.descricao() + ", Azeitona";
    }

    public double preco() {
        return pizzaComDecorator.preco() + 2.5;
    }
}
