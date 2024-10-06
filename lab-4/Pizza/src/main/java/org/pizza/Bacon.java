package org.pizza;

public class Bacon extends PizzaDecorator {
    public Bacon(Pizza pizza) {
        super(pizza);
    }

    public String descricao() {
        return pizzaComDecorator.descricao() + ", Bacon";
    }

    public double preco() {
        return pizzaComDecorator.preco() + 6.0;
    }
}
