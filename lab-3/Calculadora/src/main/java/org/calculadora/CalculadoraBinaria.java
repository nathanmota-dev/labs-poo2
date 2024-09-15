package org.calculadora;

public class CalculadoraBinaria implements Binaria {
    @Override
    public String somar(String a, String b) {
        int num1 = Integer.parseInt(a, 2);  // Converte binário para decimal
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 + num2;
        return Integer.toBinaryString(resultado);  // Retorna resultado em binário
    }

    @Override
    public String subtrair(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 - num2;
        return Integer.toBinaryString(resultado);
    }
}

