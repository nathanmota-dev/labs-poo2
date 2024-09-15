package org.calculadora;

public class CalculadoraAdapter implements Calculadora {
    private Binaria calculadoraBinaria;

    public CalculadoraAdapter(Binaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        // Converte os números decimais para binário
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        // Realiza a operação binária
        String resultadoBinario = calculadoraBinaria.somar(binA, binB);
        // Converte o resultado de volta para decimal
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBinario, 2);
    }
}

