package modulo5.encapsulamento;

public class ArCondicionado {
	private int temperatura;
	
	void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <= 25) {
			this.setTemperatura(temperatura);
		}
		
	}
	
	int obterTemperatura() {
		return getTemperatura();
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
