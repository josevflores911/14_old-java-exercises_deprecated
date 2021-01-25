import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import lendoObjetos.Pessoa;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Joao Silva");
		p.setIdade(25);
		p.setProfissao("Motorista");
		
		try (ObjectOutput out =  new ObjectOutputStream(new FileOutputStream("Joao.obj"))){
			
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso");
			
		}catch(IOException e) {
			System.out.println("Erro salvando o objeto." + e.getMessage());
		}
	}

}
