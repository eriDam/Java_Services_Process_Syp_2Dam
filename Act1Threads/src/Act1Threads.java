import java.lang.Math;

public class Act1Threads extends Thread{//Extiende (hereda) de la clase Thread
		int numero;		
		public void run() {
			try {
				while (true){
					System.out.println(this.getName());
					sleep((long)(10000*Math.random())); /*El método sleep() provoca que el intérprete ponga al hilo en curso a dormir durante el número de milisegundos que se indiquen en el parámetro de invocación.El hilo estará PARADO. Una vez transcurridos esos milisegundos, dicho hilo volverá a estar disponible para su ejecución*/
				}
			} catch (InterruptedException ex) {
				return;
		}				
	}
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			Act1Threads hilos = new Act1Threads();//crea un nuevo hilo de ejecución pero no lo arranca vacio
			hilos.start();}//Arranco o Inicio el thread el hilo, y ejecutará lo que haya dentro de run
	/*La llamada al método start() creará los recursos del sistema necesarios
	para que el hilo puede ejecutarse, lo incorpora a la lista de procesos
	disponibles para ejecución del sistema y llama al método run() del hilo
	de ejecución*/
		
	}
	}

