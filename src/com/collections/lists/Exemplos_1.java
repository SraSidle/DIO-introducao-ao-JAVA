package com.collections.lists;
import java.util.ArrayList;
import java.util.List;

public class Exemplos_1 {
    public static void main(String[] args){
/*Dada uma lista com 7 notas de um aluno: [6.0, 0.0, 7.0, 8.5, 10.0, 5.5, 9.0] */
    System.out.println("Crie uma lista e adicione as 7 notas: ");
    List <Double> notas = new ArrayList<Double>(); // <Double> => Diamond operation
// List <Double> notas2 = new ArrayList<Double>(Arrays.asList(6.0, 0.0, 7.0, 8.5, 10.0, 5.5, 9.0));  
    System.out.println(notas); 
        notas.add(0, 7D);
        notas.add(1, 6D);
        notas.add(10.0);
        notas.add(3, 9.0);
        notas.add(3.5);
        notas.add(0.0);
        notas.add(6,  8.6 );
        System.out.println(notas); //notas.toString() => Se quiser
        System.out.println("Acessse o indice de um elemento através de seu valor: " + notas.indexOf(10D));
        System.out.println("Coloque o valor 8.0 na posição 4.");
        notas.add(4, 8.0);
        System.out.print("Substitua a nota 6 pela 7");
        notas.set(notas.indexOf(6.0), 7.0); //pode ser o índice direto ou esse método
        System.out.print(notas);
        System.out.println("\n Verifique se na lista contém a nota 3.5 " + notas.contains(3.5));
       // for(Double nota : notas) System.out.print(nota); => no list já vem ordenado por ordem de inserção, mas se quiser;  
    }
}
