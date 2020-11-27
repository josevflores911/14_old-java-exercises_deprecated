package challenge;



public class ContaPagar extends Conta{
	
	//adicione del solucionario
	private Fornecedor fornecedor;
	
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	//contructores
	
	public ContaPagar() {
		
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		
		/*fornecedor = fornecedor;
		descricao = descricao;
		valor = valor;
		dataVencimento = dataVencimento;*/
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	
	//metodos
	
	public  void exibirDetalhes() {
		System.out.println("Fornecedor: " + this.getFornecedor().getNome() );
		System.out.println("Descricao: " + this.getDescricao() );
	}
	
	public void pagar() throws AlreadyPayedException  {
		
		if(getSituacaoConta().equals(getSituacaoConta().CANCELADA)) {
			
			throw new AlreadyPayedException("Esta conta foi cancelada");
			//System.out.println("Esta conta foi cancelada");
		}else if(getSituacaoConta().equals(getSituacaoConta().PAGA)) {
			
			throw new AlreadyPayedException("Esta conta foi paga");
			//System.out.println("Esta conta foi paga");
		}else {
			situacaoConta = SituacaoConta.PAGA;
			
			
			//fornecedor como protected funciono
			//getCosa() tambien funciona
			System.out.println("-----PAGANDO------");
			System.out.println("Fornecedor: " + fornecedor.getNome());
			System.out.println("Descricao: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Data de Vencimento: " + getDataVencimento());
			System.out.println("--------------------------------");
			
		}
			
	}
	/*correcto
	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Pagando conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do fornecedor " + this.getFornecedor().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	*/
	
	}
	
	



