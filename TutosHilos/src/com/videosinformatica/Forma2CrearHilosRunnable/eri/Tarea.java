package com.videosinformatica.Forma2CrearHilosRunnable.eri;
/**https://www.youtube.com/watch?v=w883bDxMgS8
 * 
 * La idea de realizar esta otra manera de crear hilos, es por que 
 * as� no tiene que heredar de Threadm si implementa la clase runnable, podr�a heredar de cualquier otra clase
 * esto es util sobre todo para applets.
 * 
 * Al implementar de Runnable es obligatorio implemetar el m�todo Run*/
public class Tarea implements Runnable{
	//creo el estado del hilo y el nombre
	private boolean activado;
	private String nombre;
	
	//Constructor
	public Tarea(String nombre ) {
		this.nombre = nombre;
		activado = true;
	}
	
	public void desactivar() {
		
		activado = false;
		
	}
	
	//Sobreescribimos el m�todo Run
	@Override
	public void run() {
		
		while (activado){
			System.out.println("Soy el: "+nombre);
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.getStackTrace();
			}
		}
		
	}

}
