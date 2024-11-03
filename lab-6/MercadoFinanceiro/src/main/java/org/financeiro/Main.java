package org.financeiro;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao(100); // Preço inicial da ação
        AcaoBroker broker = new AcaoBroker();

        Investidor investidor1 = new Investidor(90, 110, broker);

        acao.addObserver(investidor1);

        System.out.println("Alterando preço da ação para 105:");
        acao.setPreco(105);

        System.out.println("Alterando preço da ação para 115:");
        acao.setPreco(115);

        System.out.println("Alterando preço da ação para 85:");
        acao.setPreco(85);
    }
}