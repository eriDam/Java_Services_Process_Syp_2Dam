import java.lang.Math;

public class Act1Threads extends Thread{//Extiende (hereda) de la clase Thread
		int numero;		
		public void run() {
			try {
				while (true){
					System.out.println(this.getName());
					sleep((long)(10000*Math.random())); /*El m�todo sleep() provoca que el int�rprete ponga al hilo en curso a dormir durante el n�mero de milisegundos que se indiquen en el par�metro de invocaci�n.El hilo estar� PARADO. Una vez transcurridos esos milisegundos, dicho hilo volver� a estar disponible para su ejecuci�n*/
				}
			} catch (InterruptedException ex) {
				return;
		}				
	}
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			Act1Threads hilos = new Act1Threads();//crea un nuevo hilo de ejecuci�n pero no lo arranca vacio
			hilos.start();}//Arranco o Inicio el thread el hilo, y ejecutar� lo que haya dentro de run
	/*La llamada al m�todo start() crear� los recursos del sistema necesarios
	para que el hilo puede ejecutarse, lo incorpora a la lista de procesos
	disponibles para ejecuci�n del sistema y llama al m�todo run() del hilo
	de ejecuci�n*/
		
	}
	}

