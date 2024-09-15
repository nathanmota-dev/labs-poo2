package org.pagamento;


public class Main {
    public static void main(String[] args) {

        Paypal paypal = new Paypal();
        Pagamento adaptadorPayPal = new AdaptadorPayPal(paypal);
        SistemaPagamento sistemaPagamentoPayPal = new SistemaPagamento(adaptadorPayPal);

        sistemaPagamentoPayPal.realizarPagamento(150.00);
        sistemaPagamentoPayPal.realizarReembolso(50.00);

        Stripe stripe = new Stripe();
        Pagamento adaptadorStripe = new AdaptadorStripe(stripe);
        SistemaPagamento sistemaPagamentoStripe = new SistemaPagamento(adaptadorStripe);

        sistemaPagamentoStripe.realizarPagamento(200.00);
        sistemaPagamentoStripe.realizarReembolso(80.00);
        }
    }
