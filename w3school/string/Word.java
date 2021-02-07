public class Word{

	//constructor sin argumentos
	Word(){
	//this();
	}

	public char letter(String letra, int posicion){

		
		//-------ejercicio 1
		String save;
		char save1;

		//tipo string debe returnar un tipo string en el metodo
		save = letra.substring( posicion , posicion + 1);

		//tipo char debe returnar un tipo char en el metodo
		save1 = letra.charAt(posicion); 

		



		return save1;
	}

	//-------ejercicio 2

	public int ucp(String letra, int posicion){

		int ucp = letra.codePointBefore(posicion);

		return ucp;

	}

}