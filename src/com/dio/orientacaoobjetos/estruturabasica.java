package com.dio.orientacaoobjetos;

public class estruturabasica {
/*Classe carro*/
    class carro{
/*Atributos carro*/
            String cor;
            String modelo;
            int capacidadeTanque; //prof criou com int
/*Construtor carro(tem que ter mesmo nome da classe, deve estar abaixo dos atributos e acima dos get/sets*/
    carro () {

    }
/*Sobrecarga do construtor */
    carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
/*Void não retornará nada, pois apenas guardará o valor do atributo */
    void setCor(String cor){
           this.cor = cor;  
        }
/*o getCor receberá como retorno, o valor guardado em setCor */
    String getCor() {
        return cor;
    };
   
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    double getCapacidadeTanque(){
        return capacidadeTanque;
    }
/*Operações mais complexas vem depois; */
    double valorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
  }
}

class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}