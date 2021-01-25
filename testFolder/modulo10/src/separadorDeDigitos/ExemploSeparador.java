package separadorDeDigitos;

public class ExemploSeparador {

	public static void main(String[] args) {
		long populacaoSaoPaulo =  11_000_000;
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;
		
		System.out.printf("Populacao Sao Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("Populacao da Grande Sao Paulo: %d\n", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Preco veiculo: %.3f\n", precoVeiculo);
		
		int x = 1__2__3;
		int y = 1_2_3;
		
		System.out.printf("Sao iguais: %b\n", (x==y));
		

	}

}
