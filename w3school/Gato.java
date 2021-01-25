public class Gato implements Accion{
	@Override
	public void habla(){
		System.out.println("miau miau");
	}

	@Override
	public void ataque(){
		System.out.println("aranhar");
	}

	@Override
	public void senha(){
		System.out.println("456");
	}	
}