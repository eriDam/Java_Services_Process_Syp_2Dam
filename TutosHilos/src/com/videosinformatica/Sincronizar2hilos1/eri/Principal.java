package com.videosinformatica.Sincronizar2hilos1.eri;
/**Este progtama va a crear dos hilos y har� que primero se ejcute
 * uno y cuando termine de hacer su tarea se ejecute el siguiente, utilizando la sincronizaci�n*/
public class Principal {

	public static void main(String[] args) {
		// creamos 2 tareas
		Tarea tarea1 = new Tarea("Tarea 1");
		Tarea tarea2 = new Tarea("Tarea 2");
		
		//Creamos los dos hilos, uno x cada tarea
		Thread hilo1= new Thread(tarea1);
		Thread hilo2= new Thread(tarea2);

		hilo1.start();
		/**El m�todo Join se utiliza dentro de un try catch para captura la expecepci�n, 
		 * La llamada al m�todo join es la operacion mas b�scica de sincronizacion de hilos
		 * se utiliza para esperar la ejecucion de un hilo, es decir esperar a que la ejecucion termine,
		 * el hilo principal crea las tareas, crea los hilos, sigue 
		 * ejecutando, ejecuta el metodo join, la tarea principal del main sera esperar a que el hilo termine 
		 * y el hilo 2 se lanzar� cuando el 1 haya terminado. */
		
		try {
			hilo1.join();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		hilo2.start();
		/**Si queremos esperar y notificar cuando terminan las 2 operaciones, seria sincrinizar el main con la segunda tarea*/
		try {
			hilo2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Fin del main, las dos tareas han terminado :)");
	}

}
