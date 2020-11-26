package modulo5.enumeracoes;

public class TesteEnum {

	public static void main(String[] args) {
		Carta tresPaus = new Carta(3);
		
		tresPaus.imprimirCarta();
		
		Carta quatroPaus = new Carta(4, Naipe.PAUS);
		
		quatroPaus.imprimirCarta();

	}
	
	

}
