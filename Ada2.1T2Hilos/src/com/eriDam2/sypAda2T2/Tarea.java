package com.eriDam2.sypAda2T2;

public class Tarea implements Runnable {
		
	//creo la variable que va a almacenar el nombre del hilo
			private String nombre;
			
			//Constructor
			public Tarea(String nombre ) {
				this.nombre = nombre;
			}
			
			
			//Sobreescribimos el método Run
			@Override
			public void run() {
				System.out.println("Comienzo...");
				for (int i=0;i<10;i++){
				 
					System.out.println("Bienvenidos a los hilos!! yo soy el hilo: "+nombre+" y voy por la iteración "+i);
				
					try {
						Thread.sleep(500);
					} catch (InterruptedException ie) {
						ie.getStackTrace();
					}
				}
				System.out.println("Soy el hilo: "+nombre+" y he acabado mi tarea");
				
			}

		}
