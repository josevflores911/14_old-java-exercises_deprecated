package javaMath;

import static java.lang.Math.PI;
//import static java.lang.Math.max; linea 21


public class TesteClaseMath {

	public static void main(String[] args) {
		//Comprimento de uma circunferencia 2 x r x PI
		
		int raio = 4;
		//static final double PI = 3.1415;
		//double comprimento = 2 * raio * Math.PI;
		double comprimento = 2 * raio * PI;//linea 3
		
		System.out.println("Comprimento: " + comprimento);
		
		//Maximo e minimo
		double[] precosProdutoA = {30.20,25.49};
		double maiorPreco = Math.max(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("Maior preco: " + maiorPreco);
		
		System.out.println("Menor preco: " + Math.min(precosProdutoA[0], precosProdutoA[1]));
		
		//Potencia
		System.out.println("2^3" + Math.pow(2, 3));
		
		//Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		//Arredondamento ceil, floor e round
		double n = 5.68;
		
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Menor inteiro: " + Math.ceil(n));
		System.out.println("Menor inteiro: " + Math.round(n));
		
		
		//Trigonometria
		System.out.println("Seno: " + Math.sin(40));
		
		//Numeros randomicos
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		

	}

}
