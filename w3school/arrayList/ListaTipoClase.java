import java.util.*;
public class ListaTipoClase{
	private String nome;
	private String apelido;
	private int idade;

	public ListaTipoClase(){

	}

	public ListaTipoClase(String nome, String apelido, int idade){
		this.nome=nome;
		this.apelido=apelido;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public static void main(String [] args) {
		ListaTipoClase test = new ListaTipoClase("Jao", "macho", 666);

		ListaTipoClase p = new ListaTipoClase();
		p.setNome("A");

		List<ListaTipoClase> lista = new ArrayList<ListaTipoClase>();
		lista.add(p);
		lista.add(test);


		//System.out.println("Nome: " + p.getApelido());

		System.out.println("Nome: " + lista.get(0).getNome()+ " apelido: " + lista.get(0).getApelido());



		//System.out.println("Nome: " + test.getNome() + "  Apelido: " + test.getApelido() + "  dade: " + test.getIdade());


		for (ListaTipoClase x:lista){
			System.out.println(x.getNome());
		}
	}

}