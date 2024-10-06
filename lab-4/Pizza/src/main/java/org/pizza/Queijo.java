package org.pizza;

public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza){
        super(pizza);
    }

    public String descricao() {
        return pizzaComDecorator.descricao() + ", Queijo";
    }

    public double preco() {
        return pizzaComDecorator.preco() + 5.0;
    }
}
