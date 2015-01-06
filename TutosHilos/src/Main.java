
public class Main {

	public static void main(String[] args) {
		// Creamos dos objetos de procesos, el primero hilo y el segundo 
		//hilo 2, el parametro es un nombre uqe se le asigna
		Thread hilo = new Hilo("hilo 1");
		Thread hilo2 = new Hilo("hilo 2");

		//para poder inicializar utilizamos el objeto con el método start
		hilo.start();
		hilo2.start();
	}

}
