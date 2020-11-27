package pagamento.operadoras;

import pagamentoInterfases.Autorizavel;
import pagamentoInterfases.Cartao;
import pagamentoInterfases.Operadora;

public class Redecard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456")
				&& autorizavel.getValorTotal()<200;
	}

}
