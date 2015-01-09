/*
 * Crea dos hilos productor y consumidor, uno pone con put , cada vez que pone aumenta,
 * y otro quita con get. He tratado de hacer el proyecto en 4 clases separadas y no me
 * funciona, he optado por crear un nuevo proyecto y colocarlo todo en una clase java,
 * no sé si me falla a mi o está mal el código ya que no lo
 * acabo de entender bien del todo.
 * 
 *  */

class PC {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Pulsa Control-C para parar.");
	}
}

//clase para los métodos
class Q {
	int n;
	boolean valueSet = false;
	
	/* 
	 *  La utilidad de synchronized es para que se 
	 *  sincronicen los threads, si uno empieza el otro espera, se aplica en el
 	 *  nombre del método get, esto quiere decir que Consumidor pasado al objeto q, 
 	 *  tiene el monitor del control sobre este método, para que realice toda la accion del método
 	 *  cuando esta termine (en este caso cuando añada el otro thread con su metodo put) y se libera 
 	 *  el monitor.
	*/
	synchronized int get() {
	
		if (!valueSet)
			try {
				wait();// Espera a que termine, este método detiene la ejecucion de un hilo u objeto
			} catch (InterruptedException e) {// se captura la excepcion
				System.out.println("InterruptedException capturada");
			}
		System.out.println("Obtengo: " + n);
		valueSet = false;
		notify();//reactiva el hilo u objeto
		return n;
	}
	synchronized void put(int n) {
		if (valueSet)
			try {
				wait();// Espera a que termine, este método detiene la ejecucion de un hilo u objeto
			} catch (InterruptedException e) {
				System.out.println("InterruptedException capturada");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Pongo: " + n);
		notify();//reactiva el hilo u objeto
	}
}
class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Productor").start();// crea un nuevo Thread y lo
												// inicia(inicia su metodo run)
	}
	public void run() {
		int i = 0;// declaramos i a 0
		while (true) {// mientras sea verdadero
			q.put(i++);// q utiliza su metodo put e i aumenta en uno
		}
	}
}
class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumidor").start();// crea el hilo consumidor y
												// arranca su método run
	}
	public void run() {
		while (true) {// Mientras sea verdadero,
			q.get();// utiliza get para coger y decontar uno de i
		}
	}
}
