package org.pagamento;

public class Stripe {
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " processado via Stripe.");
    }

    public void reembolsarPagamento(double valor) {
        System.out.println("Reembolso de " + valor + " feito via Stripe.");
    }
}
