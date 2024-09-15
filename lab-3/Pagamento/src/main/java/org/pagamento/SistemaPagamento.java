package org.pagamento;

public class SistemaPagamento {
    private Pagamento pagamento;

    public SistemaPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento(double valor) {
        pagamento.processarPagamento(valor);
    }

    public void realizarReembolso(double valor) {
        pagamento.reembolsar(valor);
    }
}

