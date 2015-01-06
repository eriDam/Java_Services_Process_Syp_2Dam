 // Implementación del interfaz Runnable consiste en declarar una clase que 
//implemente Runnable y sobreescribir el método run():
class NewThread implements Runnable {
	String name; // Creo un atributo
	Thread t;//variable de tipo Thread. Thread es una clase independiente que es el 
	//hilo que va a manejar este proceso 

	  
	NewThread(String threadname) {
	    name = threadname;
	    t = new Thread(this, name);
	    System.out.println("Nuevo hilo: " + t);
	    t.start(); //inicio el hilo y ejecutará lo que hay dentro de run 
	}
	// Cuando se ejecute el método start, inicia el ciclo que hay dentro de run, utilizo el 
	//método sleep que me permite pausar durante 1000 milisegundo, el ciclo entonces se ejecutará 
	//cada 1000 milisegundos
	  
	//Dentro de run() incluimos el código a ejecutar por el nuevo hilo.
	public void run() { 
	    try {
	      for(int i = 5; i > 0; i--) {
	        System.out.println(name + ": " + i); //Imprimimos en cada //ciclo, el nombre mas el valor i 
	        Thread.sleep(1000);/*Durante los 1000 milisegundos que el thread está dormido (sleep()), no
	         *se ejecutará aunque el procesador esté disponible. Cuando haya pasado ese tiempo, el 
	         *thread pasará al estado RUNNABLE otra vez y se ejecutará cuando el procesador esté disponible.*/ 
	      }
	    } catch (InterruptedException e) {
	      	System.out.println(name + "Interrupción del hilo hijo" +name);
	    }
	    
	    System.out.println("Sale del hilo hijo" + name);
	}
}
	
