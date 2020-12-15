package claseString;

public class ExemploClasseString3 {

	public static void main(String[] args) {
		String s ="Cursos Online";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(12));
		
		char[] array = {'O','L','A'};
		
		String s1 = new String(array);
		System.out.println(s1);
		
		
		//----------------------
		
		String s2 = "Desenvolvimento Java";
		System.out.println(s2.substring(16));
		
		String s3 = "Cursos online de desenvolvimento de software";
		String sx = "Cursos_online_de_desenvolvimento_de_software";
		System.out.println(s3.substring(7, 13));
		
		//----------------------------------------------
		
		String s4 = "    AlgAworks   A  ";
		//tira os espacos
		System.out.println(s4.trim());
		
		//--------------------------------------------------
		
		String[] nuevoArray = sx.split("_");
		
		for(int i=0; i < nuevoArray.length; i++) {
			System.out.println("["+i+"]"+nuevoArray[i]);
		}
		//----------------------------------------
		
		
		System.out.println(s4.indexOf('A'));
		System.out.println(s4.lastIndexOf('A'));
		System.out.println(s4.replaceAll("A","a"));
		
		
		
		
		

	}

}
