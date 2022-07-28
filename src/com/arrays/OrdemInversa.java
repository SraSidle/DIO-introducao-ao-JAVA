package com.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1 , 6, 89, 3, 6};
        int count = 0;
          while(count < (vetor.length-1)){
            // System.out.println(vetor[count] + " ");
            count++;
          }

          for(int i = (vetor.length-1) ; i >= 0 ; i--) {
            System.out.println(vetor[i] + " ");
          }
    }
}
