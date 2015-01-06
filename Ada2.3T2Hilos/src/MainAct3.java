 

/**Act 3.	Modifica el código anterior para que sea implementado con Runnable Ver codigo act 2.2*/
/** 
	 * En la salida por pantalla se observa que los 10 Thread imprimen por pantalla una cuenta de 0 a 99, 
	 * Por otra parte no salen ordenados aunque están dentro de un for
	 *  
	 *  */
public class MainAct3 {

	/*
	Empieza el main, inicio del programa, donde se crean 10 Threads, 
	cada uno se ejecuta cuando tenga sitio en el procesador y se arrancaran
*/
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //ciclo for que creará 10 objetos(Hilos) de Act3Runnable
			Act3Runnable tarea = new Act3Runnable(i * 10, (i + 1) * 10);
			Thread miTh = new Thread(tarea); //Al ser runnable es necesario crear un objeto de tipo Thread y pasarle la tarea creada
			miTh.start(); // start invoca a run de Act3Runnable
		}
	}

}
