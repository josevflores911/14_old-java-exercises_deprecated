package modulo5;

public class TesteContador {

	public static void main(String[] args) {
		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.COUNT);
		
		Contador.COUNT++;
		System.out.println(Contador.COUNT);
		
		Contador.imprimirContador();

	}

}
