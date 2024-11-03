package org.financeiro;

public class Investidor implements Observer{
    private float limiteMinimo;
    private float limiteMaximo;
    private AcaoBroker broker;

    public Investidor(float limiteMinimo, float limiteMaximo, AcaoBroker broker) {
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void update(float preco) {
        if (preco >= limiteMaximo) {
            System.out.println("Investidor: Limite máximo atingido! Instruindo venda da ação.");
            broker.venderAcao(new Acao(preco));
        } else if (preco <= limiteMinimo) {
            System.out.println("Investidor: Limite mínimo atingido! Considerando compra da ação.");
            broker.comprarAcao(new Acao(preco));
        }
    }
}
