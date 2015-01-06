class ThreadDemo implements Runnable  {
	ThreadDemo()  {
		Thread ct = Thread.currentThread();/*obtener una referencia al thread propio. Es lo que hace el método estático currentThread() de la clase Thread. */
		
		Thread t = new Thread(this);
		t.setName("demo Thread"); //Ponemos un nombre L Thread t
		System.out.println("hilo actual: " + ct);
		System.out.println("Hilo creado: " + t);
		t.start();
		try  {
			Thread.sleep(3000);
		}  catch (InterruptedException e)  {
		   	System.out.println("Interrumpido");
		}
		System.out.println("saliendo del hilo main");
    }
	
    public void run()  {
	try  {
		for (int i = 5; i > 0; i--)  { //Ciclo que obtiene el nombre desde el valo 5 a 0
			System.out.println(Thread.currentThread().getName()+" " + i);
			Thread.sleep(1000);
	 	}
	}  catch (InterruptedException e)  {
		System.out.println("hijo interrumpido");
	}
	System.out.println("saliendo del hilo hijo");
    }
    	
    	
    public static void main (String args [])  { //Método main que arranca el programa
    	ThreadDemo hilo = new ThreadDemo();
    	Thread h = new Thread(hilo);
    	
    }
}

