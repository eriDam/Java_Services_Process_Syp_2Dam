class MultiThreadDemo {
	public static void main(String args[]) {
		// comienzan los hilos
		new NewThread("Uno"); // Se crea un objeto de NewThread //creo que falta
								// c�digo:
		// NewThread n1 = new NewThread("Uno");
		new NewThread("Dos");
		new NewThread("Tres");
		try {
			/*
			 * el int�rprete pone al hilo en curso a dormir durante el n�mero de
			 * milisegundos que se indiquen en el par�metro de invocaci�n. Una
			 * vez transcurridos esos milisegundos, dicho hilo volver� a estar
			 * disponible para su ejecuci�n
			 */

			Thread.sleep(10000);
		} catch (InterruptedException e) { // Capturamos la excepci�n, en caso
											// de que no se pueda ejecutar el
											// try saltar� el mensaje
			System.out.println("Interrupción del hilo principal");
		}
		System.out.println("Sale del hilo principal.");
	}
}
