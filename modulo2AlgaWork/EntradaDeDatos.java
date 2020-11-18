import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();//nao colocar . exemplo 1,23
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);
		
		
		if(imc < 18.5){
			System.out.println("Abaixo do peso ideal");
		}else if (imc < 25){
			System.out.println("Peso Ideal");
		}else if(imc < 40){
			System.out.println("obesidade grau 1 ou 2");
		}else{
			System.out.println("Obesidade Grau 3");
			System.out.println("Muito cuidado com seu peso");
		}
		
	}
}