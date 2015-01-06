package com.nickTutos.eri;

public class Main {
	public static void main(String[] args) {
		//Creo un par de hilos (creando objetos de la clae mi Thread
		MiThread mThread1 = new MiThread("Hilo1");
		MiThread mThread2 = new MiThread("Hilo2");
		
		//Arranco estos hilos
		mThread1.start();
		mThread2.start();
	}
}
