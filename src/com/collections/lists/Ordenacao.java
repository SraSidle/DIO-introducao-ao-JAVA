package com.collections.lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Código da camila que depois compararei com o meu para ver onde errei;*/
public class Ordenacao {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(Comparator.comparing(Gato::getNome));


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;

// /*Esse arquivo apresenta erro que eu não sei ainda como resolver*/

// public class Ordenacao {
//     public static void main(String[] args){
//         List<Gato> meusGatos = new ArrayList<>(){{
//             // add(new Gato( nome: "Kevin", idade: 1, cor: "branco"));
//         }};
//     System.out.println("--\t Ordem de inserção: \t---");
//     System.out.println(meusGatos);

//     System.out.println("--\t Ordem de Aleatória: \t---");
//     Collections.shuffle(meusGatos);
//     System.out.println(meusGatos);

//     System.out.println("--\t Ordem Natural(Nome): \t---");
//     Collections.sort(meusGatos); // receberá a lista que recebe o comparable;
//     System.out.println(meusGatos);

//     System.out.println("--\t Ordem Natural(Idade): \t---");
    
//     System.out.println(meusGatos);
//     }
// }

// class Gato implements Comparable<Gato> {
//     private String nome;
//     private Integer idade;
//     private String cor;

//     public Gato(String nome, Integer idade, String cor){
//         this.nome = nome;
//         this.idade = idade;
//         this.cor = cor;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public Integer getIdade() {
//         return idade;
//     }

//     public String getCor() {
//         return cor;
//     }

//   //  @override 
//     public String toString() {
//         return "Gato {" +
//         "nome = '" + nome + '\'' +
//         "idade = '" + idade +
//         ", cor = '" + cor + '\'' + 
//         '}';
//     }

//  // @override
//    public int compareTo(Gato gato) { //interface comparable
//     return this.getNome().compareToIgnoreCase(gato.getNome()); // 0 => igual 1=> comparado > comparando -1 => comparando < comparado
//    }
// }

