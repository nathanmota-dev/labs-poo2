package org.pedidos;

public class PedidoLoja extends PedidoTemplate{
    public PedidoLoja(int quantidade, double precoItem) {
        super(quantidade, precoItem);
    }

    @Override
    protected void processarPagamento(double valor) {
        System.out.println("Pagamento na loja processado. Valor total: R$" + valor);
    }

    @Override
    protected boolean necessitaEntrega() {
        return false;
    }
}
