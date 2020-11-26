package mod5ClasesAbstractas;

public class ProdutoPerecivel extends Produto {

	
	String dataValidade;
	
	public void imprimirDescricao() {
	
		System.out.println("Descricao: " + super.getDescricao() + " vencendo em: " + dataValidade);
		
	}

}
