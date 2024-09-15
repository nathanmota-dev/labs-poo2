package org.pagamento;

public class AdaptadorPayPal implements Pagamento {
    private Paypal paypal;

    public AdaptadorPayPal(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processarPagamento(double valor) {
        paypal.enviarPagamento(valor);
    }

    @Override
    public void reembolsar(double valor) {
        paypal.devolverPagamento(valor);
    }
}

