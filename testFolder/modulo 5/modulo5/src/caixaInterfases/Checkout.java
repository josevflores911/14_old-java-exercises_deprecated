package caixaInterfases;

import impressaoInterfases.Impresora;
import pagamentoInterfases.Cartao;
import pagamentoInterfases.Operadora;

public class Checkout {
	
	private Operadora operadora;
	private Impresora impresora;
	
	
	public Checkout(Operadora operadora, Impresora impresora) {
		
		this.operadora = operadora;
		this.impresora = impresora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impresora.imprimir(compra);
					
		}else {
			System.out.println("Pagamento foi negado");
		}
		
		
	}

}
