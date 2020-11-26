package challenge;

public class RelatorioContas {
	
	
	public void exibirListagem(Conta[] contas) {
		
		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");

		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		
		System.out.println("*************************************"+contas);
		
		
	}
}
