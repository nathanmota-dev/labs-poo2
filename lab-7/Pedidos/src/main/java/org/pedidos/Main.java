package org.pedidos;

/*
* O padrão de projeto Template Method define a estrutura de um algoritmo na superclasse,
* permitindo que subclasses implementem partes específicas desse algoritmo.
* Ele é usado para criar uma sequência fixa de passos, onde algumas etapas podem
* ser sobrescritas ou personalizadas, mas a ordem de execução permanece a mesma.
* Esse padrão é ideal quando se quer definir um fluxo fixo, mas com variações em algumas etapas.
* Por outro lado, o padrão Decorator permite adicionar
* funcionalidades extras a objetos de forma dinâmica,
* sem alterar a classe original. Ele envolve a criação de classes "decoradoras"
* que envolvem o objeto base, adicionando novos comportamentos ou responsabilidades.
* Esse padrão é útil para estender funcionalidades de maneira flexível e em tempo de execução,
* ao contrário do Template Method, que define a estrutura no momento de criação da classe.
* Resumindo, o Template Method é voltado para estruturar e organizar
* a lógica do algoritmo, enquanto o Decorator se concentra em adicionar responsabilidades
* a objetos sem alterar sua estrutura.
*/

public class Main {
    public static void main(String[] args) {
        PedidoTemplate pedidoOnline = new PedidoOnline(5, 12.0);
        System.out.println("Processando pedido online:");
        pedidoOnline.processarPedido();

        PedidoTemplate pedidoLoja = new PedidoLoja(3, 43.0);
        System.out.println("\nProcessando pedido na loja:");
        pedidoLoja.processarPedido();

        PedidoTemplate pedidoCripto = new PedidoCripto(2, 67.0);
        System.out.println("\nProcessando pedido com pagamento em criptomoedas:");
        pedidoCripto.processarPedido();
    }
}