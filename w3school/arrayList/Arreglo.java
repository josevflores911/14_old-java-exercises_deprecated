import java.util.*;

public class Arreglo{
	public static void main(String[] args){

		//--------------------------------------------------
		/*list es una interfase, arraylist es la clase no se 
		puede instaciar una interfase*/
		List<String> conjunto = new ArrayList<String>();

		List<String> grupo = new ArrayList<String>();


		conjunto.add("uno");
		conjunto.add("dos");
		conjunto.add("tres");
		conjunto.add("cuatro");


		grupo.add("amarillo");
		grupo.add("verde");
//-----no se puede convertir string a number(counter)
/*
		for(String counter : conjunto){
			grupo.add(conjunto.get(counter));
		}
*/

		for(int i=0; i < conjunto.size(); i++){
			grupo.add(conjunto.get(i));	
		}
		//answer 9: Collections.copy(List1, List2); 	


		//Collections.shuffle(grupo);   //answer 10
		System.out.println(grupo);
	
	//---------------------------------------------------

		for(int i=0; i < Math.ceil((grupo.size())/2) ; i++){
			
			String suport = grupo.get(i);

			grupo.set(i, grupo.get((grupo.size())-i-1));

				//System.out.println(grupo.get(i));

			grupo.set((grupo.size())-i-1, suport);

				//System.out.println(grupo.get((grupo.size())-i-1));
			
		}

		System.out.println(grupo);

		//answer 11:  Collections.reverse(grupo);

		//------------------------------------------------------
		/*Question 12*/


		int valorInicial = 2 ; 
		int valorFinal = 4;
		
		List<String> sublist = new ArrayList<String>();

		for(int i=2; i <= 4; i++){
			sublist.add(grupo.get(i));
		}
		
		System.out.println(sublist);		

		//answer 12:  List<String> sublist = grupo.subList(0, 3);

		//-----------------------------------------------------------------
		/*Question 13*/

		List<String> comparado = new ArrayList<String>();

		comparado.add("cuatro");
		comparado.add("tres");
		comparado.add("dos");
		comparado.add("uno");
		comparado.add("amarillo");
		comparado.add("verde");

		
		//este bucle compara 1 a 1 los elementos en el arreglo, si falla 1 ya no son iguales

		if(comparado.size()==grupo.size()){
			System.out.println("iguales en dimension");
			for(int i=0; i<grupo.size();i++){
				if(comparado.get(i)==grupo.get(i)){
					System.out.println("elemento"+i+"son iguales");
				}else{
					System.out.println("no son iguales");
				}
			}
		}else{
			System.out.println("diferentes dimensiones");			
		}



		/*
		operador ternario asigna un valor a un elemento si se
		cumple una condicion dada

		int alfa = (condicion ? valor_true : valor_false )


		*/

		//este bucle abajo revisa si tiene el elemento independiente de la posicion debe correrse a partir del arreglo de dimensiones mayores

		for (String e : grupo){
			String alfa =(comparado.contains(e)?"yes":"no");
			System.out.println(alfa);				
		}

		//-------------------------------------------
		/*Question 14*/

		/*

		|A|B|C|D|E|F| -> |1|2|3|4|5|6|

		get A
		temporal= get A
		get B
		set(a_position,getB)
		set(b_position,temporal)

		solucion: Collection.swap(arreglo,posicion_A,posicion_B)

	*/


	//---------------------------------------------------------
	
		
	}
}

