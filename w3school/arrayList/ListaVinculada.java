/*

When To Use
	It is best to use an ArrayList when:

You want to access random items frequently
You only need to add or remove elements at the end of the list
	
	It is best to use a LinkedList when:

You only use the list by looping through it instead of accessing random items
You frequently need to add and remove items from the beginning, middle or end of the
list


*/

import java.util.*;

public class ListaVinculada{
	public static void main(String[] args){

		LinkedList<String> primero = new LinkedList<String>();

		primero.add("uno");
		primero.add("dos");
		primero.add("tres");
		primero.add("cuatro");
		primero.add("cinco");

		System.out.println(primero);
	}
}