package bufferAndString;

public abstract class TesteStrings {

	public static void main(String[] args) {
		String s ="Ola";
		
		s= s + " Pessoal!";
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ola");
		sb.append(" Pessoal!");
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);

	}

}
