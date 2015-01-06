 // Implementaci�n del interfaz Runnable consiste en declarar una clase que 
//implemente Runnable y sobreescribir el m�todo run():
class NewThread implements Runnable {
	String name; // Creo un atributo
	Thread t;//variable de tipo Thread. Thread es una clase independiente que es el 
	//hilo que va a manejar este proceso 

	  
	NewThread(String threadname) {
	    name = threadname;
	    t = new Thread(this, name);
	    System.out.println("Nuevo hilo: " + t);
	    t.start(); //inicio el hilo y ejecutar� lo que hay dentro de run 
	}
	// Cuando se ejecute el m�todo start, inicia el ciclo que hay dentro de run, utilizo el 
	//m�todo sleep que me permite pausar durante 1000 milisegundo, el ciclo entonces se ejecutar� 
	//cada 1000 milisegundos
	  
	//Dentro de run() incluimos el c�digo a ejecutar por el nuevo hilo.
	public void run() { 
	    try {
	      for(int i = 5; i > 0; i--) {
	        System.out.println(name + ": " + i); //Imprimimos en cada //ciclo, el nombre mas el valor i 
	        Thread.sleep(1000);/*Durante los 1000 milisegundos que el thread est� dormido (sleep()), no
	         *se ejecutar� aunque el procesador est� disponible. Cuando haya pasado ese tiempo, el 
	         *thread pasar� al estado RUNNABLE otra vez y se ejecutar� cuando el procesador est� disponible.*/ 
	      }
	    } catch (InterruptedException e) {
	      	System.out.println(name + "Interrupci�n del hilo hijo" +name);
	    }
	    
	    System.out.println("Sale del hilo hijo" + name);
	}
}
	
