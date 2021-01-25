import java.util.Scanner;

public class segundoEjercicio {
  public static void main(String[] args) {
    
	Scanner first = new Scanner(System.in);
	System.out.print("Digite o valor:");
	int x = first.nextInt();
	
	System.out.println(x);
	
	int count=0;//variable global

	for(int j=x;j>=0;j--){
		int counter = 0;
		for (int i=j; i > 0; i--) {
			int arreglo = j%i;
			if (arreglo == 0){
				counter += 1;//contador de condicion de primo
			}
		}
		if(counter == 2){
			//System.out.println("arreglo es primo");
			count += 1;//contador de primos variable local
			
		}else{
			//System.out.println("arreglo no es primo");
		}
	}
	
	int primos[];
	primos = new int[count+1];
	int position = 0;
	
	for(int j=x;j>=0;j--){
		int counter = 0;
		for (int i=j; i > 0; i--) {
			int arreglo = j%i;
			if (arreglo == 0){
				counter += 1;//contador de condicion de primo
			}
		}
		if(counter == 2){
			primos[position] = j;
			position +=1;
			
		}else{
	
		}
	}
	primos[count]=1;
	
	
  }
}