package challenge;



public class ContaReceber extends Conta {
	
	//adicione del solucionario
	private Cliente cliente;
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//constructores
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		/*this();
		cliente = cliente;
		descricao = descricao;
		valor = valor;
		dataVencimento = dataVencimento;*/
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	//metodos
	
	public  void exibirDetalhes() {
		System.out.println("Cliente: " + this.getCliente().getNome() );
		System.out.println("Descricao: " + this.getDescricao() );
	}
	
	/*public void cancelar() {
		
		super.cancelar();
		
		getSituacaoConta();
		if(getSituacaoConta().equals(SituacaoConta.CANCELADA)) {
			
			System.out.println("Esta conta foi cancelada");
			
		} else {
			
			getSituacaoConta();
			if(getSituacaoConta().equals(SituacaoConta.PAGA)) {
				
				System.out.println("Esta conta foi paga");
				
			}else if(getValor()< 50000d){

				situacaoConta = CANCELADA;
				System.out.println("-----CANCELANDO------");
							
			}else {
				System.out.println("No podemos cancelar cuentas acima de 50000$");
			}
		}
	}
	*/
	
	public void cancelar() {
		if (this.getValor() > 50000d) {
			System.out.println("Essa conta a receber não pode ser cancelada. " +
				"É muito dinheiro para deixar de receber: " + this.getDescricao());
		} else {
			super.cancelar();
		}
	}
	
	public void receber() {
		if(getSituacaoConta().equals(getSituacaoConta().CANCELADA)) {
			System.out.println("Esta conta foi cancelada");
		}else if(getSituacaoConta().equals(getSituacaoConta().PAGA)) {
			System.out.println("Esta conta foi paga");
		}else {
			situacaoConta = SituacaoConta.PAGA;
			
			
			//fornecedor como protected funciono
			//getCosa() tambien funciona
			System.out.println("-----RECEBENDO------");
			System.out.println("Fornecedor: " + getCliente().getNome());
			System.out.println("Descricao: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Data de Vencimento: " + getDataVencimento());
			System.out.println("--------------------------------");
			
		}
		
	}
	
	/*correcto 
	  public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	*/

}
