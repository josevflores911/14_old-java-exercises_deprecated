package challengeNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		new Principal();
	}
	
	public Principal() {
		double aleatorio;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese valor para calcular el diez por ciento:");
		Double valor = entrada.nextDouble();
	
		//System.out.println("El diez porciento es: " + this.calcularPorcentaje(valor));
		
		
		//-----------------------------------------------
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.println("El diez porciento es: " + formatador.format(this.calcularPorcentaje(valor)));
	}
	
	
	
	
	
	
	private BigDecimal calcularPorcentaje(double valor) {
		
		BigDecimal percent = new BigDecimal(valor);
		percent = percent.divide(BigDecimal.TEN);
		
		return percent;
	}
			
	
}
