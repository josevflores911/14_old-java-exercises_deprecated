package challengeMath;

public class MegaSena {

	public static final int NUMERO_MAXIMO = 60;
	public static final int QUANTIDADE_NUMEROS = 6;
	
	private int[] numerosSorteados;
	
	public void sortear() {
		this.numerosSorteados = new int[QUANTIDADE_NUMEROS];
		
		for (int i = 1; i <= QUANTIDADE_NUMEROS; i++) {
			// gera n�mero aleat�rio, arredonda e converte para inteiro
			int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);
			
			// verifica se n�mero ainda n�o foi sorteado e n�o � 0
			if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
				// adiciona o n�mero sorteado no array de n�meros sorteados
				this.numerosSorteados[i-1] = numeroSorteado;
			} else {
				// decrementa i para refazer o sorteio da mesma posi��o
				i--;
			}
		}
	}
	
	public void exibirNumeros() {
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		// quebra de linha
		System.out.println();
	}
	
	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numerosSorteados.length; i++) {
			if (this.numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

}
