import java.util.ArrayList;
import java.util.*;//what i need exactly

//ejercicio 1, 2, 3, 4, 5, 6

public class Color{
	public static void main(String[] args){
		ArrayList<String> colores = new ArrayList<String>();

		colores.add("amarillo");
		colores.add("azul");
		colores.add("rojo");

		System.out.println(colores);
		System.out.println(colores.get(1));
		System.out.println("--------------------");

		for(int i=0; i < 3 ;i++){
			System.out.println(colores.get(i));
		}

		System.out.println("--------------------");



		colores.add(0,"verde");

		for(int i=0; i < 4 ;i++){
			System.out.println(colores.get(i));
		}

		colores.set(0,"naranja");

		colores.remove(3);

		System.out.println("--------------------");

		for(int i=0; i < 3 ;i++){

			if(colores.get(i).equals("amarillo")){
				System.out.println("founded");
			}else{
				System.out.println("not_founded");
			}

			

			if(colores.get(i).contains("rojo")){
				System.out.println("founded");
			}else{
				System.out.println("not_founded");
			
			}
			System.out.println("--------------------");
		}

		//aqui  iria otro codigo pero va el mismo -> rehacer llamando methodos

		

		ArrayList<String> listofcountries = new ArrayList<String>();

		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("china");
		listofcountries.add("Denmark");

		//mayusculas primeros minusculas despues

		/*lista desordenada*/	

		System.out.println("Before Sorting");
		for(String counter : listofcountries){
			System.out.println(counter);
		}


		/*Sort Statement*/
		Collections.sort(listofcountries);

		/*Sorted List*/
		System.out.println("After Sorting");

		for(String counter : listofcountries){
			System.out.println(counter);
		}


	}
}


