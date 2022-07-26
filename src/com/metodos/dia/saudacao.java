package com.metodos.dia;

public class saudacao {
    /*O static permite chamar o método a partir de uma classe. => (saudacao.main(par)) */
    public static void main(int hora){
        if(hora >= 06 && hora < 12){
            System.out.println("Bom dia! ");
        } else if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde! ");
        } else if(hora >= 18 && hora <= 23){
            System.out.println("Boa noite! ");
        } else if( hora >= 00 && hora < 06){
            System.out.println("Vai dormir! ");
        } else {
            System.out.println("Hora inválida! ");
        }
    }; 
}

/* Solução prof
public class Mensagem {
    public static void obterMensagem(int hora) {
 * switch (hora) {
 * case 5; 
 * case 6 ... case 12;
 * mensagemBomdia();
 *   break;
 * case 13; ... case 18;
 * mensagemBoaTarde();
 *   break;
 * case 19; ... case 23;
 * mensagemBoaNoite();
 *   break;
 * default
 * System.out.println("Hora inválida! ");
 *   break
 *   }
 * }
 * 
 * public static void mensagemBomDia(){
 *  System.out.println("Bom dia, margarida! ");
 * }
 * 
 * public static void mensagemBoaTarde(){
 *  System.out.println("Boa Tarde, coisa Linda! ");
 * }
 * 
 * public static void mensagemBoaNoite(){
 *  System.out.println("Boa noite, minha vida! ");
 *  }
 * }
 */
