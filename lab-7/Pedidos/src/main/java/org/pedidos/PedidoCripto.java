package org.pedidos;

public class PedidoCripto extends PedidoTemplate {
    public PedidoCripto(int quantidade, double precoItem) {
        super(quantidade, precoItem);
    }

    @Override
    protected void processarPagamento(double valor) {
        System.out.println("Pagamento com criptomoedas processado. Valor total: R$" + valor);
    }

    @Override
    protected boolean necessitaEntrega() {
        return true;
    }
}
