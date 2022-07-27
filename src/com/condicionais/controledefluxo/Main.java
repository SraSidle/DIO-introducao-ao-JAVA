package com.condicionais.controledefluxo;

public class Main {
    public static void main(String[] args){
        int numMes = 4;
    if(numMes == 1 || numMes == 7 || numMes == 12){
        System.out.println("Férias");
    } else {
        System.out.println("Bora trabalhar!! ");
    }
    /*Tem que fazer um para mês indefinido */
       if(numMes == 1){
    System.out.println("Janeiro");
} else if(numMes == 2){
    System.out.println("Fevereiro");
}  else if(numMes == 3){
    System.out.println("Março");
}  else if(numMes == 4){
    System.out.println("Abril");
}  else if(numMes == 5){
    System.out.println("Maio");
}  else if(numMes == 6){
    System.out.println("Junho");
}  else if(numMes == 7){
    System.out.println("Julho");
}  else if(numMes == 8){
    System.out.println("Agosto");
}  else if(numMes == 9){
    System.out.println("Setembro");
}  else if(numMes == 10){
    System.out.println("Outubro");
}  else if(numMes == 11){
    System.out.println("Novembro");
}   else if(numMes == 12){
    System.out.println("Dezembro");
} else {
    System.out.println("Mês indefinido! ");
}

     String dia = "Domingo";

    switch (dia){
        case "Domingo":
        System.out.println(1);
        break;
        case "segunda":
        System.out.println(2);
        break;
        case "Terça":
        System.out.println(3);
        break;
        case "Quarta":
        System.out.println(4);
        break;
        case "Quinta":
        System.out.println(5);
        break;
        case "Sexta":
        System.out.println(6);
        break;
        case "Sábado":
        System.out.println(7);
        break;
          default: 
            System.out.println("Dia inválido! ");
              break;
    }
  }
}
