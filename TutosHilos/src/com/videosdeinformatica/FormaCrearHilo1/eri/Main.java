package com.videosdeinformatica.FormaCrearHilo1.eri;

//https://www.youtube.com/watch?v=oOVj1fGXQrc
public class Main {

	public static void main(String[] args) {
		// Creo los hilos correspondientes
		MTread hilo1 = new MTread();
		MTread hilo2 = new MTread();
		
		//Debemos llamar al método start()para que 
		//inicie el método run de cada hilo
		hilo1.start();
		hilo2.start();
		
		hilo1.desactivar();
		hilo2.desactivar();
	}

}
