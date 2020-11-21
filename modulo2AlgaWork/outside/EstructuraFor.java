import java.util.Scanner;

public class EstructuraFor{
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ultimo numero: ");
		int numeroFinal = entrada.nextInt();
		
		
		for(int i = 1; i <= numeroFinal; i++){
			System.out.println(i);
		}
		
		
		
	}
}