public class Perro implements Accion{
	@Override
	public void habla(){
		System.out.println("wow wow");
	}

	@Override
	public void ataque(){
		System.out.println("ladrido");
	}

	@Override
	public void senha(){
		System.out.println("123");
	}	
}