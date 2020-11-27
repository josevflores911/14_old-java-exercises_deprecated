package tratandoExcecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
//		int numero = 5/0;
//		System.out.println(numero);
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
		}catch(IllegalArgumentException e) {
			System.out.println("Voce executou uma operacao ilegal: " + e.getMessage());
		}

	}

}
