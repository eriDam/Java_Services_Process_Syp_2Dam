package com.videosinformatica.Forma2CrearHilosRunnable.eri;
//https://www.youtube.com/watch?v=w883bDxMgS8

public class Main {

	public static void main(String[] args) {
		//En primer lugar, será la tare auqe va a hacer el hilo, po rque la forma 
		//de crearlos es diferente con Runnable hay que crear un objeto de tipo Thread 
		//y pasarle por parámetro el objeto ya que hemos creado una clase ejecutable
		Tarea tarea = new Tarea ("Primer Hilo");
		Thread hilo = new Thread(tarea);
		Tarea tarea2 = new Tarea ("Segundo Hilo");
		Thread hilo2 = new Thread(tarea2);
		//Ahora podemos lanzar el hilo iniciando el run con start()
		hilo.start();
		hilo2.start();
	}

}
