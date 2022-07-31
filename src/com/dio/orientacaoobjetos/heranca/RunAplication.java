package com.dio.orientacaoobjetos.heranca;

public class RunAplication {
    public static void main(String[] args){
        //Funcionario funcionario = new Funcionario();

/*Upcast*/  //Funcionario tem todas as informações de vendedor, gerente e faxineiro e consegue manipular os dados que recebe
        // Funcionario vendedor = new Vendedor();
        // Funcionario gerente = new Gerente();
        // Funcionario faxineiro = new Faxineiro();

/*Downcast*/  //Vendedor não tem todas as informações de funcionário, por isso, recebe os dados e recusa por não sabe o que fazer
       // Vendedor vendedor = (Vendedor) new Funcionario();

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe : classes) {
                classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
                classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
