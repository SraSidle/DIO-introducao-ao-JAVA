package com.metodos.calculadora;

// Os números serão definidos em Main, quando chamar o método.
public class Calculadora {
    public static void soma(int num1, int num2) {
       int soma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
    }
  
    public static void subtracao(int num1, int num2) {
        int subtracao = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + subtracao);
    }

    public static void multiplicacao(int num1, int num2) {
        int multiplicacao = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
    }

    public static void divisao(int num1, int num2) {
        int divisao = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + divisao);
    }
}