# Padrões de Projeto - Programação Orientada a Objetos 2

Este repositório foi criado para armazenar os exercícios práticos desenvolvidos na disciplina de **Programação Orientada a Objetos 2** (POO2) com foco no estudo e implementação de **padrões de projeto**. Os padrões de projeto são soluções comprovadas e reutilizáveis para problemas recorrentes no desenvolvimento de software orientado a objetos, facilitando a manutenção, escalabilidade e flexibilidade dos sistemas.

Abaixo, estão descritos os laboratórios realizados durante a disciplina, com os padrões de projeto abordados em cada um deles.

---

## Laboratório 2 - Singleton e Factory

Neste laboratório, o foco foi a implementação de dois padrões de criação: **Singleton** e **Factory**. Esses padrões ajudam a controlar como os objetos são criados, permitindo maior flexibilidade e controle sobre o processo de instanciação.

### Padrões de Projeto:
- **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.
- **Factory**: Define uma interface para criar objetos, mas deixa as subclasses decidirem quais classes instanciar. 

### Exercícios:
1. Implementação de fabricantes de celulares utilizando os padrões **Singleton** e **Factory**.
2. Simulação de fábricas de veículos, com os fabricantes Toyota e Honda, aplicando os padrões **Singleton** e **Factory**.

---

## Laboratório 3 - Adapter (Wrapper)

Neste laboratório, o objetivo foi entender e implementar o padrão estrutural **Adapter**. Esse padrão é usado para permitir que interfaces incompatíveis trabalhem juntas, agindo como um "adaptador" entre classes.

### Padrão de Projeto:
- **Adapter (Wrapper)**: Converte a interface de uma classe em outra interface esperada pelos clientes, permitindo que classes com interfaces incompatíveis trabalhem juntas.

### Exercícios:
1. Implementação de habilidades de aves (como Pato e Pavão), utilizando o padrão **Adapter** para permitir que diferentes tipos de aves compartilhem comportamentos.
2. Implementação de uma calculadora que funciona tanto com números binários quanto decimais, usando o padrão **Adapter** para unificar as operações.
3. **Proposta e implementação de um sistema de pagamento**: Neste exercício, foi criado um sistema de pagamento utilizando o padrão **Adapter**. As classes envolvidas foram: `AdaptadorPayPal.java`, `AdaptadorStripe.java`, `Main.java`, `Pagamento.java`, `Paypal.java`, `SistemaPagamento.java` e `Stripe.java`.

---

## Laboratório 4 - Decorator

Neste laboratório, o foco foi o padrão **Decorator**, que permite adicionar responsabilidades a objetos de forma dinâmica, sem modificar suas classes.

### Padrão de Projeto:
- **Decorator**: Anexa responsabilidades adicionais a um objeto dinamicamente. Decoradores oferecem uma alternativa flexível à subclasse para estender funcionalidades.

### Exercícios:
1. Implementação do padrão **Decorator** em uma pizzaria, onde diferentes massas e ingredientes são combinados para criar pizzas personalizadas.
2. Implementação do padrão **Decorator** em uma cafeteria, onde diferentes tipos de cafés recebem complementos (como leite, canela e chocolate) dinamicamente.

---

## Laboratório 5 - Fachada e Proxy

Este laboratório abrangeu dois padrões estruturais: **Fachada** e **Proxy**. Ambos os padrões lidam com a simplificação do acesso a sistemas complexos e o controle de acesso a objetos.

### Padrões de Projeto:
- **Fachada**: Fornece uma interface simplificada para um subsistema complexo, facilitando o uso do cliente e escondendo os detalhes internos.
- **Proxy**: Fornece um substituto ou intermediário para outro objeto, controlando o acesso a ele e adicionando funcionalidades extras como controle de acesso ou criação retardada.

### Exercícios:
1. Implementação de um sistema de home theater utilizando o padrão **Fachada**, que facilita a interação com vários dispositivos eletrônicos ao assistir um filme.
2. Implementação de um sistema de carro onde o padrão **Fachada** é utilizado para automatizar as ações necessárias para iniciar e desligar o carro.
3. **Implementação de uma máquina de lavar roupas utilizando o padrão Proxy**: Neste exercício, foi implementado um proxy para controlar o acesso à máquina de lavar, garantindo que o ciclo de lavagem só seja iniciado se a porta estiver corretamente fechada.

---

## Laboratório 6 - Observer

Neste laboratório, o foco foi o padrão **Observer**, que permite que objetos sejam notificados automaticamente quando o estado de outro objeto muda. Esse padrão é particularmente útil em cenários onde um objeto precisa atualizar múltiplos outros sem criar uma dependência direta entre eles.

### Padrão de Projeto:
- **Observer**: Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

### Exercícios:
1. **Central de Estação do Tempo**: Implementação de uma aplicação onde uma Central de Estação do Tempo (CET) notifica os observadores interessados, como a Prefeitura e o Aeroporto, sobre variações de temperatura, umidade e vento. Cada observador reage de acordo com suas necessidades específicas.
2. **Mercado Financeiro**: Simulação de um sistema onde investidores acompanham variações no preço de ações e definem limites de compra e venda. O corretor de ações (AcaoBroker) realiza operações automaticamente quando os limites de preço são atingidos, usando o padrão Observer para notificar os investidores.

---

Este repositório representa uma parte fundamental da aprendizagem sobre padrões de projeto e oferece exemplos práticos que podem ser aplicados em diversos contextos de desenvolvimento de software.
