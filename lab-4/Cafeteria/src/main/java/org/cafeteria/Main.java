package org.cafeteria;

public class Main {
    public static void main(String[] args) {

        // Espresso
        Bebida espressoComLeiteECanela = new Canela(new Leite(new Espresso()));
        System.out.println(espressoComLeiteECanela.getDescricao() + " custa R$" + espressoComLeiteECanela.calculaCusto());

        // Decaf
        Bebida decafComChocolateEChantilly = new Chantilly(new Chocolate(new Decaf()));
        System.out.println(decafComChocolateEChantilly.getDescricao() + " custa R$" + decafComChocolateEChantilly.calculaCusto());

        // Espresso Completo
        Bebida espressoComTudo = new Chantilly(new Canela(new Chocolate(new Leite(new Espresso()))));
        System.out.println(espressoComTudo.getDescricao() + " custa R$" + espressoComTudo.calculaCusto());

        // Decaf Simples
        Bebida decafSimples = new Decaf();
        System.out.println(decafSimples.getDescricao() + " custa R$" + decafSimples.calculaCusto());
    }
}