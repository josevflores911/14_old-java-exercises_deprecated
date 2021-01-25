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


}