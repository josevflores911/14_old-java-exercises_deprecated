package switchString;

public class SwitchCaseComString {

	public static void main(String[] args) {
		String carro = args.length >0 ? args[0] : "";
		
		/*
		 * if(carro.equals("Audi){
		 * system.out.pruntln("alemao");
		 * }else if(carro.equals("ferrari"){
		 * systen.out.println("italiano")
		 * }
		 * */
		
		switch(carro) {
		case "Audi":
			System.out.println("Alemao");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda":
			System.out.println("Japones");
			break;
		default:
			System.out.println("Nao informou nenhum carro!");
		}

	}

}
