package com.videosinformatica.Forma3CrearHilos.eri;
/**Es una forma muy rápida de crearlos pero no la mas elegante, se va a hacer utilizando una clase
 * anónima interna, se va a hacer todo en la clase principal, creando un hilo y pasandole como parámetro
 * una clase anónima que hacemos directamente implementando desde la interfaz*/
public class Main {
	  final static int N = 5;
	public static void main(String[] args) {
		Thread hilo = new Thread(new Runnable(){
			public void run(){
				for (int i=0;i < N;i++){
					System.out.println("Soy el hilo: "+Thread.currentThread().getName());
					
					//hacemos que duerma un determinado espacio de tiempo
					
					try {
						System.out.println("durmiendo...");
						Thread.sleep(500);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}//fin for
			}//final run
		});//fin nuevo hilo
		hilo.start();
		//Si se quiere crear otro hilo hay que implementar todo de nuevo. 
		
	}//fin main

}//fin clase
