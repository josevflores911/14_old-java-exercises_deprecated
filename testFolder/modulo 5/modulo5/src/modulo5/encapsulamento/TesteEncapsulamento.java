package modulo5.encapsulamento;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		
		ar.setTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura());
		
		//encapsulamento cuida el valor inicial sino cumple las condiciones
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura());
		
		
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura());
		
		

	}

}
