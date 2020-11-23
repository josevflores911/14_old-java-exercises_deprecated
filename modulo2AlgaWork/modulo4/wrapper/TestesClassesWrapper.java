package modulo4;

public class TestesClassesWrapper {
	
	public static void main(String[] args) {
		
		int x = 5;
		Integer i = new Integer(5);
		
		byte y = i.byteValue();
		
		String valor ="15.5";
		
		Float v = new Float(valor);
		System.out.println(v+3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos voce tera: " + (idade+5) + " anos.");
		
		/*try {
			double custo = Double.parseDouble("23.5");
			System.out.println("Custo total: " + custo);
		}catch(NumberFormatException e) {
			System.err.println("NUmero invalido para conversao");
		}*/
		
		
		
		
		
	}
}
