package com.videosinformatica.Sincronizar2hilos2.eri;
/**
 * 
 * Esta tarea será capaz de esperar a la otra tarea/hilo
 * 
 * */
public class Tarea2 implements Runnable {
	//creo la variable que va a almacenar el nombre del hilo
	//Tiene que esperar a otro hilo que le pasaremos como parámetro a parte del nombre
	private Thread hilo;
	private String nombre;
	
	//Constructor
	public Tarea2(String nombre, Thread hilo) {
		this.nombre = nombre;
		this.hilo  =hilo;
	
	}
	
	//Sobreescribimos el método Run
	@Override
	public void run() {
		try {
			//cuando esta tarea se ejecute lo primer q hara ser llamar al metodo join de
			//manera que esperara a que el otro hilo termine y no podrá ejecutarse hasta 
			//que acabe
			hilo.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Comienzo...");
		for (int i=0;i<10;i++){
		 
			System.out.println(i+" iteración, soy el hilo: "+nombre);
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.getStackTrace();
			}
		}
		System.out.println("Acabé");
		
	}

}
