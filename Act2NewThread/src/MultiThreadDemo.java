class MultiThreadDemo {
	public static void main(String args[]) {
		// comienzan los hilos
		new NewThread("Uno"); // Se crea un objeto de NewThread //creo que falta
								// código:
		// NewThread n1 = new NewThread("Uno");
		new NewThread("Dos");
		new NewThread("Tres");
		try {
			/*
			 * el intérprete pone al hilo en curso a dormir durante el número de
			 * milisegundos que se indiquen en el parámetro de invocación. Una
			 * vez transcurridos esos milisegundos, dicho hilo volverá a estar
			 * disponible para su ejecución
			 */

			Thread.sleep(10000);
		} catch (InterruptedException e) { // Capturamos la excepción, en caso
											// de que no se pueda ejecutar el
											// try saltará el mensaje
			System.out.println("InterrupciÃ³n del hilo principal");
		}
		System.out.println("Sale del hilo principal.");
	}
}
