package com.collections.map;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MetodosMap1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione o modelo e seus respectivos consumos. ");
        Map <String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol ",  14.4);
            put("Uno ",  15.6);
            put("Mob ",  16.1);
            put("HB20 ", 14.5);
            put("Kwid ", 15.6);
        }};
        System.out.print(carrosPopulares);
        System.out.print("Substitua uma chave: ");
        carrosPopulares.put("Gol", 15.6);//Não se adiciona, altera a chave já existente
        System.out.println("\n" + carrosPopulares);

        System.out.println("Confira se o modelo tucsom está em carrosPopulares: " + carrosPopulares.containsKey("Tucsom"));
        System.out.println("Exiba o valor através da chave: " + carrosPopulares.get("Uno "));
       
        Set <String> modelos = carrosPopulares.keySet();
        System.out.print("Exiba o modelo dos carros: " + modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("\n Exiba os valores pelo seu consumo: " + consumos);

        Double consumoEficiente = Collections.max(carrosPopulares.values());
        System.out.println("Exiba o consumo mais eficiente: " + consumoEficiente);

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoEficiente)) modeloEficiente = entry.getKey(); 
        }
        System.out.println("Modelo mais eficiente: " + modeloEficiente + "- " + consumoEficiente);

        Double consMenosEficiente =  Collections.min(carrosPopulares.values());
        System.out.println("Exiba o consumo menos eficiente: " + consMenosEficiente);

        String modMenosEficiente = "";
        for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consMenosEficiente)) modMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente: " + modMenosEficiente + "- " + consMenosEficiente);

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0D;
          while(iterator.hasNext()){
            soma += iterator.next();
          }
        System.out.println("Exiba a soma dos elementos: " + soma);

        System.out.println("Exiba a media da soma dos elementos: " + (soma / carrosPopulares.size()));

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
       // Double soma = 0D;
          while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
          }
          System.out.println("Remova os elementos com valor 15.6: " + carrosPopulares);


        //   Erro por algum motivo 
        //Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
        //     put("Gols ",  14.4);
        //     put("Unos ",  15.6);
        //     put("Mob ",  16.1);
        //     put("HB20 ", 14.5);
        //     put("Kwid ", 15.6);
        // }};
        // System.out.println("Imprima os Itens por ordem de iserção " + carrosPopulares2);


        Map<String, Double> carrosPopulares3 = new TreeMap<>(){{
          put("Gols ",  14.4);
          put("Unos ",  15.6);
          put("Mob ",  16.1);
          put("HB20 ", 14.5);
          put("Kwid ", 15.6);
            }};
    System.out.println("Imprima os Itens por ordem das chaves" + carrosPopulares3);

    carrosPopulares.clear();
    System.out.print("Verifique se a lista está vazia: " + carrosPopulares.isEmpty());
    }
}

/* 
 * Aqui, o método add não funciona 
 * Não apresenta por ordem de inserção
*/