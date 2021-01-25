
 import java.util.Scanner;

public class minimoComunMultiplo {
  public static void main(String[] args) {
    //se ingresan los 3 valores a calcular
	int datos[];
	datos = new int[4];
	
	
	Scanner first = new Scanner(System.in);
	System.out.print("Digite o valor:");
	int x = first.nextInt();
	datos[0] = x;
	
	System.out.println(x);
	System.out.println("------------------------------");
	Scanner second = new Scanner(System.in);
	System.out.print("Digite o valor:");
	int y = second.nextInt();
	datos[1] = y;
	
	System.out.println(y);
	System.out.println("------------------------------");
	
	Scanner third = new Scanner(System.in);
	System.out.print("Digite o valor:");
	int h = third.nextInt();
	datos[2] = h;
	
	System.out.println(h);
	System.out.println("------------------------------");
	
	//estas 4 lineas van con el teste de la linea 294 
	Scanner th = new Scanner(System.in);
	System.out.print("Digite o teste:");
	int de = th.nextInt();
	datos[3] = datos[0]*datos[1]*datos[2];
	
	System.out.println("------------------------------");
	
	
	//se determina quien es el mayor de los 3
	
	int z = 0;//mayor de los 3
	  
	if (x > y && x > h) {
		System.out.println("x is greater than y & h");
		z = x;
	}else if (h > y && h > x) {
		System.out.println("h is greater than x & y");
		z = h;
	} else if(y>x && y>h ){
		System.out.println("y is greater than x & h");
		z = y;
	} else {
		System.out.println("all the three are the same");
		z=x;
	}
	
	//aqui calculamos el menor pero no lo estamos usando tener cuidado con la variable z hay sustituir
	
	/*int menor = 0;
	
	if (x < y && x < h) {
		System.out.println("x is greater than y & h");
		z = x;
	}else if (h < y && h < x) {
		System.out.println("h is greater than x & y");
		z = h;
	} else if(y < x && y < h ){
		System.out.println("y is greater than x & h");
		z = y;
	} else {
		System.out.println("all the three are the same");
		z=x;
	}*/
	
	System.out.println("------------------------------");
	
	//calcula los numeros primos del mayor
	
	int count=0;//variable global

	for(int j=z;j>=0;j--){
		int counter = 0;
		for (int i=j; i > 0; i--) {
			int arreglo = j%i;
			if (arreglo == 0){
				counter += 1;//contador de condicion de primo (condicion para ser primo)
			}
		}
		if(counter == 2){
			//System.out.println("arreglo es primo");
			count += 1;//contador de primos variable local (tamaño de la matriz
			
		}else{
			//System.out.println("arreglo no es primo");
		}
	}
	
	
	//coloca esos primos en un arreglo (este bloque se puede simplificar con el anteriorclc) 
	
	int primos[];
	primos = new int[count+1];
	int position = 0;
	
	for(int j=z;j>=0;j--){
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
	
	for (int i = 0; i < primos.length; i++) {
		System.out.println(primos[i]);
	}
	
	System.out.println("-alter---------cond1-----------cond2");
/*	remover altera linea 315
//coloca los minimos en 3 arreglos diferentes
	int mcm1[];
	mcm1 = new int[30];
	int mcm2[];
	mcm2 = new int[30];
	int mcm3[];
	mcm3 = new int[30];
	
	
	for(int i = 0;i < 3;i++){
		
		int cond1=0;//contador resto igual a cero
		int cond2=0;//contador divisor del numero
		int alfa=-1;//posicion de las 3 matrices de multiplos 
		int nveces = 0;
		for (int j=count-1;j>=0;j--){
			
			cond1=datos[i]%primos[j];
			
			while (cond1 == 0){
		
				cond2=datos[i];
				cond2=cond2/primos[j];
				datos[i]=cond2;
				cond1=cond2%primos[j];
									
					if(i==0){
						alfa=alfa+1;
						mcm1[alfa]=primos[j];
					}
					if(i==1){
						alfa=alfa+1;
						mcm2[alfa]=primos[j];
					}
					if(i==2){
						alfa=alfa+1;
						mcm3[alfa]=primos[j];
					}			
					
				System.out.println(primos[j]+"-----"+cond1+"----"+cond2+"  B  "+j+"  C->  "+alfa+"---"+mcm1[alfa]);
				
				
			}
			
			
		}
		
			
		System.out.println(i+"while"+alfa+"n"+nveces);
	}
	//------------determina cuantos cambios de numero ocurren pero no es necesario
	int acumCambioA=-1;
	int cambioPrimoPasA=0;
	int cambioPrimoFutA=0;
	
	for(int i = 0;i < mcm1.length;i++){
		cambioPrimoPasA = mcm1[i];			
		if(cambioPrimoPasA != cambioPrimoFutA){
			
			acumCambioA +=1;
			}
		cambioPrimoFutA = mcm1[i];	
	}
	
	
	System.out.println("cambios: "+acumCambioA);
	int acumCambioB=-1;
	int cambioPrimoPasB=0;
	int cambioPrimoFutB=0;
	
	for(int i = 0;i < mcm2.length;i++){
		cambioPrimoPasB = mcm2[i];		
		if(cambioPrimoPasB != cambioPrimoFutB){
			
			acumCambioB +=1;
			}
		cambioPrimoFutB = mcm2[i];	
	}
	
	
	System.out.println("cambios: "+acumCambioB);
	
	int acumCambioC=-1;
	int cambioPrimoPasC=0;
	int cambioPrimoFutC=0;
	
	for(int i = 0;i < mcm3.length;i++){
		cambioPrimoPasC = mcm3[i];		
		if(cambioPrimoPasC != cambioPrimoFutC){
			
			acumCambioC +=1;
			}
		cambioPrimoFutC = mcm3[i];	
	}
	
	
	System.out.println("cambios: "+acumCambioC);
	//-----------------------------------------------------
	
	for(int i = 0;i < mcm3.length;i++){
		//System.out.println(mcm1[i]+"_"+mcm2[i]+"_"+mcm3[i]);
	}
	
	
	
	//----------suma los 3 arreglos en un solo arreglo con todos los minimo comum multiplos--------------
	int sumaArray[];
	sumaArray = new int[30];
	int a = 0;
	int b = 0;
	for(int i = 0;i < sumaArray.length;i++){
		if(mcm1[i]!=0){
			a=i;
			sumaArray[a]=mcm1[i];
			
		}else{
			b=a+1;
		}
			
	}
	//--------------------------------------------
	
	for(int i = 0;i < sumaArray.length;i++){
		if(mcm2[i]!=0){
			a=i+b;
			sumaArray[a]=mcm2[i];
			
		}else{
			b=a+1;
		}
		
	
	}
	
	//---------------------------------------------------
	
	for(int i = 0;i < sumaArray.length;i++){
		if(mcm3[i]!=0){
			a=i+b;
			sumaArray[a]=mcm2[i];
			
		}else{
			b=a+1;
		}
		
	//	System.out.println(sumaArray[i]);
	}
	
	//System.out.println(a);


*/ //remover altera linea 315

	//---------------separar los primos  (ejercicio)------------------------
	
	
	
	
	
	
	
	//teste(multiplica los valores ingresados y los descompone  esto los deja organizado) funciono pero no es necesario organizar y hay que buscar un modo de organizar el arreglo sin multiplicar
	
		int mcmtest[];
		mcmtest = new int[30];
	
		int cond1=0;//contador resto igual a cero
		int cond2=0;//contador divisor del numero
		int alfa=-1;//posicion de las 3 matrices de multiplos 
				
		for (int j=count-1;j>=0;j--){
			cond1=datos[3]%primos[j];
			while (cond1 == 0){
				cond2=datos[3];
				cond2=cond2/primos[j];
				datos[3]=cond2;
				cond1=cond2%primos[j];
		
				alfa=alfa+1;
				mcmtest[alfa]=primos[j];
			}
		}
	//----divido y calculo el resto para reducir los valores, los valores cuyo resto sea cero van a ser los mcm1

		int al=0;
		int bl=0;
		int cl=0;
		int mcm=1;

		for(int i = 0;i < mcmtest.length;i++){
			
			if (mcmtest[i]!=0){
				
				al=datos[0]%mcmtest[i];
				bl=datos[1]%mcmtest[i];
				cl=datos[2]%mcmtest[i];
				System.out.println(mcmtest[i]+"_"+al+"_"+mcm);
				if(al==0 || bl==0 ||cl==0){
					mcm=mcm*mcmtest[i];
					if(al==0){	
						datos[0]=datos[0]/mcmtest[i];
					}
					if(bl==0){
						datos[1]=datos[1]/mcmtest[i];
					}	
					if(cl==0){
						datos[2]=datos[2]/mcmtest[i];
					}
				}			
			}
		
		}
	
	System.out.println(mcm);
	
	
  }
}