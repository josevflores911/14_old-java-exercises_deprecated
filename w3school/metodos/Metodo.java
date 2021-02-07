public class Metodo{
	
	public void menor(int first, int second, int third){
		
		if(first>second){
			if(first>third){
				System.out.println("el numero mas grande es: "+ first);
			}else{
				System.out.println("el numero mas grande es: "+ third);
			}
		}else if(second>third){
			System.out.println("el numero mas grande es: "+ second);
		}else{
			System.out.println("el numero mas grande es: "+ third);
		}
	}

	//Math.min(Math.min(x,y),z)

	/*------------------------------------------------*/


	public int average(int first, int second, int third){
		int total = (first + second + third) / 3;
		//System.out.println("el promedio de los  tres es: "+total);	

		return total;
	}

	/*public void average(int first, int second, int third){
		int total = (first + second + third) / 3;
		System.out.println("el promedio de los  tres es: "+total);	

	}
	*/

	/*------------------------------------------------*/

	public void middle(int valor){
		
		String res;
		int dist,odd,even;  
		
		String s=String.valueOf(valor);  //de integer a string

		
		if(s.length() % 2 == 0){
			dist = ((s.length())/2)-1;
			odd = (dist+2);
			
			res = s.substring(dist,odd);
		}else{
			dist = (s.length())/2;
			even = (dist+1);
			
			res = s.substring(dist,even);
		}

		System.out.println(res);
	}

	/*------------------------------------------------*/
	//ejercicio 4 metodo

	public int vocales(String palabra){
		int counterPalabra = 0;

		for( int i = 0 ; i < palabra.length() ; i++){

			String dist = palabra.substring(i , i+1);

			if(dist.equals("a") || dist.equals("e") || dist.equals("i") || dist.equals("o") || dist.equals("u")){
				counterPalabra++;
			}
		}

		 System.out.println(counterPalabra);

		 return counterPalabra;
	}

	//answer charAt(i) ; i posicion

	/*------------------------------------------------
	//ejercicio 5

		if(dist.equals(" ")){
			counterSpace++;
		}
		}
		counterSpace++;

	*/

	/*------------------------------------------------*/	
	//ejercicio 6
	public int suma(String numero){

		int counterNumber = 0;
		for( int i = 0 ; i < numero.length() ; i++){

			String dist = numero.substring(i , i+1);

			int number = Integer.parseInt(dist);

			switch(number){
				case 1:
					counterNumber=counterNumber+1;
					break;
				case 2:
					counterNumber=counterNumber+2;
					break;
				case 3:
					counterNumber=counterNumber+3;
					break;
				case 4:
					counterNumber=counterNumber+4;
					break;
				case 5:
					counterNumber=counterNumber+5;
					break;
				case 6:
					counterNumber=counterNumber+6;
					break;
				case 7:
					counterNumber=counterNumber+7;
					break;
				case 8:
					counterNumber=counterNumber+8;
					break;
				case 9:
					counterNumber=counterNumber+9;
					break;
				case 0:
					counterNumber=counterNumber;
					break;
			}
		}
		return counterNumber;
	}


}