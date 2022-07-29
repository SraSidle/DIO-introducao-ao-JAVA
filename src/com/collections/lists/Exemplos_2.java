package com.collections.lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Exemplos_2 {
    public static void main(String[] args) {
        List <Double> notas2 = new ArrayList<Double>(Arrays.asList(6.0, 0.0, 7.0, 8.5, 10.0, 5.5, 9.0));
        System.out.println("Exiba a terceira nota adicionada: " + notas2.get(2));
        System.out.println("Exiba o menor número da Lista: " + Collections.min(notas2)); //Não é nativo do List. Os numericos tem um "comparable"
        System.out.println("Exiba o maior número da Lista: " + Collections.max(notas2));
        notas2.iterator();
        Iterator<Double> iterator = notas2.iterator();
        Double soma = 0D;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos componentes da lista: " + soma);
        System.out.println("Exiba a média dos componentes da lista: " + (soma / notas2.size()));//.size retorna um inteiro com o número de elementos na lista
        notas2.remove(0D); //
        System.out.println("Remova o zero da Lista: " + notas2);  //coloca o D, pq senão vai retornar o int da posição 0;      
        Iterator<Double> iterator2 = notas2.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println("Remova os números menores que 7 da lista: " + notas2);
        notas2.clear();
        System.out.println( "Lista não está vazia? " + notas2.isEmpty()); //vai retornar um boolean, se está vazia ou não
        System.out.println("Apague toda a Lista: " + notas2);
    }
}
