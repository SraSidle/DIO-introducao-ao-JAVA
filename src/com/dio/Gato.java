package com.dio;

public class Gato { private String nome;
	private String cor;
	private Integer idade;
	
	Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
}
/*
 * Para criar o construtor automatico, Ctrl + 3 e digita "Constructor" e gerará
 * a sintaxe.
 * cada . representa uma pasta "com.dio"
 */