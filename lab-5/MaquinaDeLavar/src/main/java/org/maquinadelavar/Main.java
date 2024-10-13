package org.maquinadelavar;

public class Main {
    public static void main(String[] args) {
        // Criando o proxy para a máquina de lavar
        ProxyMaquinaDeLavar maquinaProxy = new ProxyMaquinaDeLavar();

        // Tentativa de iniciar a lavagem com a porta aberta (sem sucesso)
        maquinaProxy.iniciarLavagem();
        System.out.println();

        // Fechando a porta
        maquinaProxy.fecharPorta();

        // Tentativa de iniciar a lavagem com a porta fechada (com sucesso)
        maquinaProxy.iniciarLavagem();
        System.out.println();

        // Abrindo a porta novamente após a lavagem
        maquinaProxy.abrirPorta();
    }
}