package modulo4;

import modulo2AlgaWork.Carro;

public class TesteArray {

	public static void main(String[] args) {
		//int[] notas1 = new int[3];
		
		int[] notas;
		notas = new int[4];
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 6;
		notas[3] = 9;
		
		for(int i=0; i < notas.length; i++) {
			System.out.println("nota do aluno: " + notas[i]);
		}
		
		Carro[] carros = new Carro[4];
		carros[0]= new Carro();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano de fa babricacao: " + carros[0].anoDeFabricacao);
		
			
		

	}

}
