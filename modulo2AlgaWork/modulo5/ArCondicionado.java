package modulo5;

public class ArCondicionado {
	
	public int temperatura;
	
	public void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}
	
	
	public int obterTemperatura() {
		return temperatura;
	}

}
