package com.condicionais.oprclogicas;

public class Main {
    public static void main(String[] args){
    /*Conjução- verdadeira apenas se os dois valore sforem verdadeiros */
    boolean conjuncaoT = true;
    boolean conjuncaoF = false;
        System.out.println("conjuncaoT && conjuncaoF" + " = " + (conjuncaoT && conjuncaoF));
        System.out.println("conjuncaoT && !conjuncaoF" + " = " + (conjuncaoT && !conjuncaoF));
    
    /*Disjunção- falsa apenas quando os dois valores são falsos */
    boolean disjuncaoT = true;
    boolean disjuncaoF = false;
        System.out.println("disjuncaoT || disjuncaoF" + " = " + (disjuncaoT || disjuncaoF));
        System.out.println("!disjuncaoT || disjuncaoF" + " = " + (!disjuncaoT || disjuncaoF));

    /*Disjunção Exclusiva- Operação que só é verdadeira quando ambas são opostas */
    boolean disjuncaoExT = true;
    boolean disjuncaoExF = false;
        System.out.println("disjuncaoExT ^ disjuncaoExF" + " = " + (disjuncaoExT ^ disjuncaoExF));
        System.out.println("disjuncaoExT ^ disjuncaoExF" + " = " + (!disjuncaoExT ^ disjuncaoExF));

    /*Negação- Inverte o valor de um operando */
    boolean negacaoT = true;
    boolean negacaoF = false;
        System.out.println("!negacaoT && !negacaoF" + " = " + (!negacaoT  && !negacaoF));
        System.out.println("!negacaoT && !negacaoF" + " = " + !(negacaoT && negacaoF));

    }
}
