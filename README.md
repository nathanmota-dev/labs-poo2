# Padrões de Projeto - Programação Orientada a Objetos

Este repositório foi criado para armazenar os ensinamentos e atividades práticas da disciplina de Programação Orientada a Objetos 2, com foco em padrões de projeto. Os padrões de projeto são soluções reutilizáveis para problemas comuns na construção de software orientado a objetos. Neste repositório, você encontrará tanto a parte prática (Laboratórios), quanto a parte teórica.

## 1. Factory Method

O **Factory Method** é um padrão de projeto de criação que lida com a criação de objetos. Ele permite que subclasses decidam quais classes instanciar, desacoplando o código cliente do processo de criação de objetos.

**Características do Factory Method**:
- Oculta a lógica de criação de objetos do cliente.
- O método fábrica é responsável por instanciar as classes desejadas, separando a criação do objeto da sua utilização.
- Promove o princípio **OCP (Open/Closed Principle)**, permitindo a extensão de fábricas sem alterar o código cliente.
- Flexibiliza o código, já que a criação de novos objetos pode ser controlada por subclasses.

### Exemplo prático (em TypeScript)

Apesar de os exercícios do repositório serem feitos em Java, o exemplo abaixo em TypeScript ajuda a ilustrar o conceito de forma clara:

```typescript
interface Product {
    sayHi(): void;
}

class ConcreteProduct implements Product {
    sayHi(): void {
        console.log('Hi');
    }
}

abstract class Creator {
    abstract factoryMethod(): Product;

    createAndShow(): void {
        const product = this.factoryMethod();
        console.log(product);
    }
}

class ConcreteCreator extends Creator {
    factoryMethod(): Product {
        return new ConcreteProduct();
    }
}

const creator = new ConcreteCreator();
const product = creator.factoryMethod();
product.sayHi(); // Hi
creator.createAndShow(); // ConcreteProduct {}
```

Nesse exemplo, a classe Creator define o método factoryMethod(), que é implementado pela subclasse ConcreteCreator para retornar o produto concreto. Isso permite que o cliente (main()) possa criar e interagir com o produto sem se preocupar com a classe concreta que está sendo usada.

## 2. Singleton
O Singleton é um padrão de projeto criacional que garante que uma classe tenha apenas uma única instância, fornecendo um ponto de acesso global a essa instância.

**Características do Singleton**:

- Garante que uma classe tenha apenas uma instância.
- Fornece um ponto de acesso global para essa instância.
- Controla o ciclo de vida do objeto, permitindo a criação apenas quando necessário.

### Prós:

- Evita a criação de múltiplas instâncias desnecessárias de uma classe.
- Facilita o gerenciamento de recursos compartilhados.

### Contras:

- Pode introduzir forte acoplamento, o que dificulta testes e manutenção do código.
- Exemplo de Singleton (em TypeScript)

```typescript
class Singleton {
    private static instance: Singleton;

    private constructor() { }

    public static getInstance(): Singleton {
        if (!Singleton.instance) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}
```

Nesse exemplo, o construtor da classe Singleton é privado, impedindo que novas instâncias sejam criadas diretamente. O método estático getInstance() garante que apenas uma instância da classe será criada e reutilizada sempre que for necessária.