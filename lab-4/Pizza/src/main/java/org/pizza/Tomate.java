package org.pizza;

public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    public String descricao() {
        return pizzaComDecorator.descricao() + ", Tomate";
    }

    public double preco() {
        return pizzaComDecorator.preco() + 3.0;
    }
}
