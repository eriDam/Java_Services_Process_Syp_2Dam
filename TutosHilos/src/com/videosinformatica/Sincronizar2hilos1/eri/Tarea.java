package com.videosinformatica.Sincronizar2hilos1.eri;

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
		
		//Sobreescribimos el método Run
		@Override
		public void run() {
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
