package modulo2AlgaWork;

public class Principal {

	public static void main(String[] args) {
		
		//declaramos a variavel
		Carro meuCarro = new Carro();//instanciamos a variavel com um objeto do tipo carro
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		
		System.out.println("Meu carro");
		System.out.println("------------------------");
		System.out.println("Modelo: "+ meuCarro.modelo);
		System.out.println("Modelo: "+ meuCarro.anoDeFabricacao);
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("------------------------");
		System.out.println("Modelo: "+ seuCarro.modelo);
		System.out.println("Modelo: "+ seuCarro.anoDeFabricacao);
		
		

	}

}
