package org.pizza;

public class Pizarria {
    public static void main(String[] args) {

        // Marguerita
        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));
        System.out.println(marguerita.descricao() + " custa R$" + marguerita.preco());

        // Portuguesa
        Pizza portuguesa = new Ovo(new Tomate(new Queijo(new MassaEspessaPizza())));
        System.out.println(portuguesa.descricao() + " custa R$" + portuguesa.preco());

        // Bacon
        Pizza baconComAzeitona = new Azeitona(new Bacon(new MassaFinaPizza()));
        System.out.println(baconComAzeitona.descricao() + " custa R$" + baconComAzeitona.preco());

        //Vegetariana
        Pizza vegetariana = new Azeitona(new Tomate(new Queijo(new MassaEspessaPizza())));
        System.out.println(vegetariana.descricao() + " custa R$" + vegetariana.preco());
    }
}
