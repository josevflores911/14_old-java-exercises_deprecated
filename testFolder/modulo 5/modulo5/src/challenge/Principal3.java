package challenge;



public class Principal3 {

	public static void main(String[] args) {
		
		
		
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunica��es");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 
			53200d, "13/05/2012");
		
		// pagamento e cancelamento de contas a pagar
		try {
			contaPagar1.pagar();
		}catch(AlreadyPayedException e){
			System.out.println("aqui 1");
		}
		
		try {
			contaPagar2.cancelar();
		}catch(CancelDebtException e){
			System.out.println("aqui 3");
		}

		// recebimento e cancelamento de contas a receber
		try {
			contaReceber1.receber();
		}catch(AlreadyPayedException e){
			System.out.println("aqui 2");
		}
		
		
		try {
			contaReceber2.cancelar();
		}catch(CancelDebtException e){
			System.out.println("cuenta muy alta para ser cancelada");
		}
	}

}