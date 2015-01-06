package com.nickTutos.eri;
//https://www.youtube.com/watch?v=pk2eC5ab7Ww

//Indico que hereda de la clase Thread
public class MiThread extends Thread{
	
	//Creo una variable para el nombre del Thread(hilo)
	private String nombre;
	
	//Creo el constructor, donde le paso por parámetro el nombre del hilo que crearé
	public MiThread(String nombre){
		this.nombre = nombre;
	}
	
	//Implemento el método run que será lo que se realice cunado se ejecute con 
	//strart() en la clase principal.
	public void run(){
		try {
			//Utilizo la clase Thread el metodo sleep, casteando a long que es lo q recibe el sleep,
			//utilizamos math random, hay que pasr a milisegundos por eso se hace el por mil, será de unos 0-5 segundos
			//Puede acabar aletoriamente el thread ya que cada uno duerme un tiempo aleatoriamente entre 0 y 5
			Thread.sleep((long)(Math.random()*5)*1000);
			System.out.println("Soy el hilo"+nombre+" y mi grupo es: "+getThreadGroup());
			
		} catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
	}
}
