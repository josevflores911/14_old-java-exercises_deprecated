package testeInterfases;

import caixaInterfases.Checkout;
import caixaInterfases.Compra;
import impresao.impresoras.ImpresoraEpson;
import impresao.impresoras.ImpresoraHP;
import impressaoInterfases.Impresora;
import pagamento.operadoras.Cielo;
import pagamento.operadoras.Redecard;
import pagamentoInterfases.Cartao;
import pagamentoInterfases.Operadora;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Redecard();
		Impresora impresora = new ImpresoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("joao M Couves");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao Mendoca Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impresora);
		checkout.fecharCompra(compra, cartao);
	}

}
