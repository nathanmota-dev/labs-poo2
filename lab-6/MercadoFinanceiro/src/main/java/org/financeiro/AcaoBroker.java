package org.financeiro;

public class AcaoBroker {
    public void venderAcao(Acao acao) {
        System.out.println("AcaoBroker: Vendendo ação ao preço de " + acao.getPreco());
    }

    public void comprarAcao(Acao acao) {
        System.out.println("AcaoBroker: Comprando ação ao preço de " + acao.getPreco());
    }
}
