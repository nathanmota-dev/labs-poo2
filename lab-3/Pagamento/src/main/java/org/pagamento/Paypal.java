package org.pagamento;

public class Paypal {
    public void enviarPagamento(double valor) {
        System.out.println("Pagamento de " + valor + " processado via PayPal.");
    }

    public void devolverPagamento(double valor) {
        System.out.println("Reembolso de " + valor + " feito via PayPal.");
    }
}
