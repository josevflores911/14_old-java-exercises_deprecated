import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class Principal{

	public static void main(String[] args) {

		//-------ejercicio 7 date

		Fecha c = new Fecha();

		//c.anho();
		//c.dia();
		c.last();

		/*Calendar c = Calendar.getInstance();
		c.set(2013, Calendar.FEBRUARY, 28);
		Date data = c.getTime();
		System.out.println("Data atual sem formatação: "+data);

			//Formata a data
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: "+ formataData.format(data));

		//Formata Hora
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: "+hora.format(data));

		//Formata Data e Hora
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.println(dtHora.format(data));*/


		//---------test
		Fecha c = new Fecha(4);

		System.out.println(c.cosa);
	}
}