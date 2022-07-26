package com.dio;

public class Main {
    public static void main(String[] args) {
   // Não dá "console.log" em valores vazios  
        int i = 1;
        int I;
        I = 2;
        final int ten = 10;
           System.out.println("O resultado é: " + (i + I * ten));
    // = const(sempre terá o valor 10);
       int quantidadeDeProdutos = 20;
       final int PRECO_PRODUTO = 50; //é uma boa prática essa grafia
           System.out.println("O preço final da compra, deu: R$ " + (quantidadeDeProdutos * PRECO_PRODUTO));   
    /*Números Inteiros, muda apenas a capacidade.*/
        Byte b1 = -128;
        Byte b2 = 127;
            System.out.println("Em Byte, o número mínimo é: " + b1 
            + " e o número máximo é: " + b2);

        Short s1 = -32768;
        short s2 =  32767;
            System.out.println("Em short, o número mínimo é: " + s1 
            + " e o número máximo é: " + s2);

        //int i1 = -2.147.483.648;
        //int i1 = 2.147.483.647;

        long l1 = -9233372036854755L;
        long l2 = 9233372036854755L;
            System.out.println("Em Long, o número mínimo é: " + l1 
            + " e o número máximo é: " + l2 
            + "\n OBS: Tem que ter um 'L' no final, para indicar que é long" );

    /*Números decimais, mudança de capacidade. */
        Float f1 = 4.4F;
            System.out.println("Float, também se coloca um 'F' no final, para indicar que é desse tipo,\n e não d0uble. " + f1);
    
        Double d1 = 3.14169782672;
            System.out.println("Double, também pode colocar um 'F' no final. " + d1);
    
    /*Para textos */
       char c1 = 'B';
       char c2 ='\u0084';
            System.out.println("O char, recebe apenas um caracter ou o código do caracter. => " + c1 + " e "
            + c2 + "\n Recebe o valor em aspas simples.");
     
       String str1 = "Bia Aguiar";
            System.out.println("As strings são envoltas por aspas duplas: " + str1);
            
        Boolean t = true;
        Boolean f = false;
            System.out.println("Executará se for: " + t + " Não executará se for: " + f);
        }
}
