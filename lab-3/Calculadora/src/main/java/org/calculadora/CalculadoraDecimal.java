package org.calculadora;

public class CalculadoraDecimal implements Decimal {
    private Calculadora calculadoraAdapter;

    public CalculadoraDecimal(Calculadora calculadoraAdapter) {
        this.calculadoraAdapter = calculadoraAdapter;
    }

    @Override
    public int somar(int a, int b) {
        return calculadoraAdapter.somar(a, b);  // Usa o Adapter para soma
    }

    @Override
    public int subtrair(int a, int b) {
        return calculadoraAdapter.subtrair(a, b);  // Usa o Adapter para subtração
    }

    @Override
    public int multiplicar(int a, int b) {
        // Implementa multiplicação diretamente em decimal
        return a * b;
    }
}

