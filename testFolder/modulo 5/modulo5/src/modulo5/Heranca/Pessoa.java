package modulo5.Heranca;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Ola, eu sou: " + nome + " e tenho " + idade + " anos.");
	}
}
