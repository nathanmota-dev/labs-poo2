package org.calculadora;


public class Main {
    public static void main(String[] args) {

        Binaria calculadoraBinaria = new CalculadoraBinaria();

        Calculadora adapter = new CalculadoraAdapter(calculadoraBinaria);

        Decimal calculadoraDecimal = new CalculadoraDecimal(adapter);

        int a = 14;
        int b = 7;

        System.out.println("Operações com números decimais:");
        System.out.println("Soma: " + calculadoraDecimal.somar(a, b));
        System.out.println("Subtração: " + calculadoraDecimal.subtrair(a, b));
        System.out.println("Multiplicação: " + calculadoraDecimal.multiplicar(a, b));
    }
}