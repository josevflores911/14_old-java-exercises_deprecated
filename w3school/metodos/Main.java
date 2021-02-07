public class Main{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Metodo variable = new Metodo();

		variable.menor(-3,-2,-30);
		variable.menor(100,0,1);

		/*------------------------------------------------*/

		variable.average(20,30,40);//30

		System.out.println(variable.average(20,30,40)+1);

		/*------------------------------------------------*/

		/*las interfases obligan a ejecutar un conjunto de 
		acciones predeterminadas, como por ejemplo un crud, para 
		establecer un contrato por lo que si no sigue esas normas
		es ignorado*/

		Accion pitbull = new Perro(); //polymorfismo
		pitbull.habla();
		pitbull.ataque();

		Accion faraon = new Gato();
		faraon.ataque();

		/*------------------------------------------------*/
		
		variable.middle(7965232);

		/*------------------------------------------------*/

		//variable.vocales("perro"); output:2
		System.out.println("aqui" + variable.vocales("perro"));

		
		/*------------------------------------------------*/
		//ejercicio 6
		System.out.println(variable.suma("123994"));		
	}
}