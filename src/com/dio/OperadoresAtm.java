package com.dio;

public class OperadoresAtm {
    public static void main(String[] args) {
    /*Pré/pós fixado */
       int K = 10;
       int L = 10;
       int M = 10;
       int N = 10;
       int K1 = K++; /*Pq tá recebendo o mesmo valor?*/
       int K2 = ++L;
       int K3 = M--;
       int K4 = --N;
          System.out.println("Esse valor é da soma pós-fixada: " + K1);
          System.out.println("Esse valor é da soma prefixada: " + K2);
          System.out.println("Esse valor é da subtração pós-fixada: " + K3);
          System.out.println("Esse valor é da subtração prefixada: " + K4);
    /*Aritméticos */
       int soma = K + K4;
       int subtracao = K2 - K;
       int multiplicacao = K3 * 3;
       int divisao = K / 2;
       double resto = K / 3;
          System.out.println("Esse valor é da soma: de K + K4 = " + soma);
          System.out.println("Esse valor é da subtração de K2 - K = " + subtracao);
          System.out.println("Esse valor é da multiplicação de K3 * 3 = " + multiplicacao);
          System.out.println("Esse valor é da divisão de K / 2 = " + divisao);
          System.out.println("Esse valor do resto da divisão de K % 3 = " + resto);
    /*Atribuições */
        int atribuido = 1;
        float atrbDiv = 10;
        atribuido += 5;
          System.out.println("Esse valor é da atribuição de soma: " + atribuido);
        atribuido -= 5;
         System.out.println("Esse valor é da atribuição de subtração: " + atribuido);
        atribuido *= 5;
         System.out.println("Esse valor é da atribuição de multiplicação: " + atribuido);
        atrbDiv /= 5;
         System.out.println("Esse valor é da atribuição de divisão: " + atrbDiv);
        atribuido %= 5;
         System.out.println("Esse valor é da atribuição de resto: " + atrbDiv);
    }
}
