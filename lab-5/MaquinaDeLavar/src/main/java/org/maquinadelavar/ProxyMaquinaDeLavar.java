package org.maquinadelavar;

public class ProxyMaquinaDeLavar implements MaquinaDeLavar{

    private MaquinaDeLavarReal maquinaReal;
    private boolean portaFechada;

    // Construtor inicializando com a porta aberta
    public ProxyMaquinaDeLavar() {
        this.maquinaReal = new MaquinaDeLavarReal();
        this.portaFechada = false; // Simula que a porta está inicialmente aberta
    }

    // Método para simular o fechamento da porta
    public void fecharPorta() {
        System.out.println("Porta fechada.");
        this.portaFechada = true;
    }

    // Método para simular a abertura da porta
    public void abrirPorta() {
        System.out.println("Porta aberta.");
        this.portaFechada = false;
    }

    @Override
    public void iniciarLavagem() {
        // O Proxy verifica se a porta está fechada antes de iniciar o ciclo de lavagem
        if (portaFechada) {
            System.out.println("Verificação concluída: Porta está fechada.");
            maquinaReal.iniciarLavagem(); // Chama a operação real se a porta estiver fechada
        } else {
            System.out.println("Erro: Não é possível iniciar a lavagem. A porta está aberta!");
        }
    }
}
