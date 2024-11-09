package org.pedidos;

public class PedidoOnline extends PedidoTemplate{
    public PedidoOnline(int quantidade, double precoItem) {
        super(quantidade, precoItem);
    }

    @Override
    protected void processarPagamento(double valor) {
        System.out.println("Pagamento online processado. Valor total: R$" + valor);
    }

    @Override
    protected boolean necessitaEntrega() {
        return true;
    }
}
