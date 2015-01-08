package com.eriDam2.sypAda2;
/**
 * 2.	Dado el siguiente código, explica cual es su comportamiento,
 *  comentando las líneas que se han dejado explícitamente para ello y 
 *  explica cual sería su salida por pantalla:
 * */
//////Ejemplo 1 - CountThreadTest.java Inicio /////////////
	
	
	/**
	 * En la salida por pantalla se observa que los 10 Thread imprimen por pantalla una cuenta de 0 a 99, 
	 * Por otra parte no salen ordenados aunque están dentro de un for, aparece el nombre del hilo y su prioridad.
	 * */
class CountThreadTest extends Thread {
	int from; //
	int to; //
	public CountThreadTest(int from, int to) { //Constructor con 2 parametros integer from y to
		this.from = from;
		this.to = to;
	}

	public void run() {
		for (int i = from; i < to; i++) {
			System.out.println(toString() + " i : " + i);
			/* El método to string nos convierte el resultado de la devolucion del objeto a String

*/
		}
	}
	/* 
	Empieza el main, inicio del programa, donde se crean 10 Threads, 
	cada uno se ejecuta cuando tenga sitio en el procesador y se arrancaran
*/
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //ciclo for que creará 10 objetos(Hilos) de CountThreadTest
			CountThreadTest t = new CountThreadTest(i * 10, (i + 1) * 10);
			t.start(); // start invoca a run de CountThreadTest
		}
	}
}
// ////// Ejemplo CountThreadTest.java Fin /////////////
