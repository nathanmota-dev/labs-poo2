package org.pedidos;

abstract class PedidoTemplate {
    protected int quantidade;
    protected double precoItem;

    protected abstract void processarPagamento(double valor);
    protected abstract boolean necessitaEntrega();

    public PedidoTemplate(int quantidade, double precoItem) {
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    private double calcularValorTotal() {
        return quantidade * precoItem;
    }

    public final void processarPedido() {
        double valorTotal = calcularValorTotal();
        processarPagamento(valorTotal);
        if (necessitaEntrega()) {
            organizarEntrega();
        } else {
            System.out.println("Pedido pronto para retirada.");
        }
    }

    protected void organizarEntrega() {
        System.out.println("Pedido será entregue no endereço do cliente.");
    }
}
