package mod5Treinador;

import mod5Animal.Cachorro;

public class TreinadorCachorro {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}
