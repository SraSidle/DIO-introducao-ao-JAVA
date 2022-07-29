package com.collections.set;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args){
        System.out.println("Crie um conjunto de Notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7D, 8d, 9.0, 10.0, 3.5, 5.0, 7D));

        System.out.print(notas.toString());
        System.out.print("\n Confira se no conjunto, contém o número 5.0: " + notas.contains(5.0));
        System.out.print("\n Exiba a menor Nota: " + Collections.min(notas));
        System.out.print("\n Exiba a maior Nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next; 
        }

        System.out.println("\n Exiba a soma de todos os elementos: " + soma);
        System.out.println("Exiba a media dos elementos: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(7.0);
        System.out.print(notas);
        
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.print("\n Exiba as notas maiores que 7: " + notas);

        System.out.println("\n Exiba as notas em ordem de inserção: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(4D);
        notas2.add(5D);
        notas2.add(10D);
        System.out.print(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("\n Exiba todas as notas em ordem crescente: " + notas3);

        notas3.clear();
        System.out.print(notas3);
        System.out.print("\n Conjunto 3 está vazio? " + notas3.isEmpty());
    }
}
 /*      
         *Não pode substituir os Itens. 
         *Aqui não se pode acessar a posição do Item.
           Não é perimitido valores repetidos
        */