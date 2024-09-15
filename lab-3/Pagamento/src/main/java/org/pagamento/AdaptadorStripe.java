package org.pagamento;

public class AdaptadorStripe implements Pagamento {
    private Stripe stripe;

    public AdaptadorStripe(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processarPagamento(double valor) {
        stripe.pagar(valor);
    }

    @Override
    public void reembolsar(double valor) {
        stripe.reembolsarPagamento(valor);
    }
}

