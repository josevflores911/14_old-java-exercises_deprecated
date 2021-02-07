import java.util.Calendar;
/**
Calendar class in Java is an abstract class that provides methods for 
converting date between a specific instant in time and a set of calendar
 fields such as MONTH, YEAR, HOUR, etc. It inherits Object class and
  implements the Comparable, Serializable, Cloneable interfaces.
*/
class Fecha{

	int cosa;

	//constructor va en mayuscula metodo va en minuscula
	Fecha(int cosa){
		this.cosa = cosa*2;
	}


	public void anho(){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2020);
		System.out.println("Ano: "+c.get(Calendar.YEAR));
	}

	public void dia(){
		Calendar c = Calendar.getInstance();
		System.out.println("Data/Hora atual: "+c.getTime());
	}

	
	//   ejercicio 7
	public void last(){
		Calendar c = Calendar.getInstance();

		System.out.println("ultimo dia");
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("primer dia");
		System.out.println(c.getActualMinimum(Calendar.DAY_OF_MONTH));
	}

	


}