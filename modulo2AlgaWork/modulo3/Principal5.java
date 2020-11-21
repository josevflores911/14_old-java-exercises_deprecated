package modulo3;

public class Principal5 {
	
	public static void main(String[] args){
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Producto producto = new Producto();
		producto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Valor venda: " + preco.precoVenda);
		
	}

}
