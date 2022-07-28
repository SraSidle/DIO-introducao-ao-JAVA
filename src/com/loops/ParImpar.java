package com.loops;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);   
      int quantidadeNumeros;
      int numero;
      int quantPares = 0, quantImpares = 0;

      System.out.println("Quantidade de números: ");
      quantidadeNumeros = scan.nextInt();
    
      int count = 0;
       do {
        numero = scan.nextInt();
        int verifica = numero % 2;
        if(verifica == 0) {
            quantPares++;
        } else {
            quantImpares++;
        }
        count++;
    } while(count < quantidadeNumeros);
    System.out.println("A quantidade de números pares é: " + quantPares + ". E os números ímpares é: " + quantImpares);
    }  
}