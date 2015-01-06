package com.videosdeinformatica.FormaCrearHilo1.eri;

public class MTread extends Thread{
	private boolean activado;
	// Creo el constructor
	public MTread() {
		activado = true;	
	}
	
	public void desactivar(){
		activado = false;
		
	}
	
	public void run(){
		//Creamos un while para que el hilo permanezca activado, en caso de llamar al
		//m�todo desactivar, el m�todo run terminar�a
		//mientras est� activado, nos mostrar� su nombre asignado por thread ya que no ke he puesto
		//
		while (activado) {
			System.out.println("Hola soy el hilo "+getName());
			
			//Utilizo la llamada al m�todo sleep para que los hilos duerman un determinado espacio de tiempo
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		}
		System.out.println("He acabado");
	}
}
