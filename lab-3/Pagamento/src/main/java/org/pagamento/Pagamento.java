package org.pagamento;

public interface Pagamento {
    void processarPagamento(double valor);
    void reembolsar(double valor);
}

