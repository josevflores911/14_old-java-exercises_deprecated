package modulo5.constructores;

public class Pessoa {
	String nome;
	int idade;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	
	void dizerNome() {
		
	}
	
	Pessoa(String nome, int idade){
		this(nome);
		this.idade = idade;
		
	}
}
