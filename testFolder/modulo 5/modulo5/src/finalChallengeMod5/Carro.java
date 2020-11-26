package finalChallengeMod5;

public class Carro implements Seguravel{

	private double valorMercado;
	private int anoFabricacao;

	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	public String obterDescricao() {
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " 
			+ this.valorMercado;
	}

	public double calcularValorApolice() {
		// c�lculos fict�cios do valor de uma ap�lice de um carro
		double valorApolice = this.valorMercado * 0.04;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}
}
