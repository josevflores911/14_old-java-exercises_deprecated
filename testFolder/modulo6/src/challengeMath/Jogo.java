package challengeMath;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Jogo {
	public static void main(String[] args) {
		
		 double[] valor = new double[6];
		 double aleatorio;
		 double entero;
		 
		 int i = 0;
		 while( i < 6) {
			 aleatorio = random() * 100;
		     entero =round(aleatorio);
		    		  
		     if(entero>=1 && entero<=60) {
			     valor[i] = entero;
			     i++;
		     }
		 }
		 
		 for (int j = 0; j < 6; j++) {
			 System.out.println(valor[j]);
		 }
		 
		 //convertir en metodo llamar desde principal y adicionar el numero de juegos
		 //adicionar una impresion similar a un boleto

	}
}


