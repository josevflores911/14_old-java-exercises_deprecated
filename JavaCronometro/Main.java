import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Main{
	public static void main(String[] args){
		int minutos = 0;
		int segundos = 0;
		int horas = 0;
		for(horas=0; horas<10001; horas++){
			for(minutos=0; minutos<60;minutos++){
				for(segundos=0;segundos<60;segundos++){
					
					salir();

					System.out.println(minutos+":"+segundos);
					delaySegundo();
				}
			}
		}	
	}

	private void salir(KeyEvent evt){
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			break;
		}
	}	

	private static void delaySegundo()
	{
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){}
	}
}


//boton de inicio de cronometro y boton de stop
//con el stop imprimo la hora final y la guardo en el archivo
//con el inicio leo la hora guardada y sumo lo nuevo

