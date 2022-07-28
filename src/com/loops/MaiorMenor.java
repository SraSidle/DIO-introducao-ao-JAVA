package com.loops;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;    
        int count = 0;
        int soma = 0;

    do {
        System.out.println("Digite um número: ");
          numero = scan.nextInt();
          if(numero > maior) maior = numero;
          count++;
          soma += numero;
        //System.out.println("O número maior da lista é: " + maior); => aqui ficará atualizando toda vez
        } while(count < 5);
        System.out.println("O número maior da lista é: " + maior);
        double media = soma / 5;
        System.out.println("A média desses número é: " + media);

    }
}
