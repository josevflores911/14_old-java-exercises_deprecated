package pagamento.operadoras;

import pagamentoInterfases.Autorizavel;
import pagamentoInterfases.Cartao;
import pagamentoInterfases.Operadora;

public class Cielo implements Operadora{
	
	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal()<100;
	}

}
