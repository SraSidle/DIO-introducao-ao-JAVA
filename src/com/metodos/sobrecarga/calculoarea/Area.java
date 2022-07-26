package com.metodos.sobrecarga.calculoarea;

public class Area {
    public static void figura(double lado){
       double area = lado * lado;
        System.out.println("Essa é a área do Quadrado: " + area);
    };

    public static void figura(double lado, double altura){
        double area = lado * altura;
         System.out.println("Essa é a área do Retângulo: " + area);
     };

     public static void figura(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura) / 2;
         System.out.println("Essa é a área do Trapézio: " + area);
     };

     /*Retornos*/
     public static int figura(int lado){
        return (lado * lado);
     };
     /*Tem que ser do tipo igual ao do método*/
}
