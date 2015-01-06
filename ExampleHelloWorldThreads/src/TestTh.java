// Definimos unos sencillos hilos. Se detendr�n un rato 
// antes de imprimir sus nombres y retardos
 class TestTh extends Thread {
		private String nombre; 
		private int retardo;
		
		// Constructor para almacenar nuestro nombre y el retardo 
		
		public TestTh( String s,int d ) { 
			nombre = s;
			retardo = d;
		}
		// El metodorun() es similar al main(), pero para 
		// threads. Cuando run() termina el thread muere.
		 public void run() { // Retrasamos la ejecuci�n el tiempo especificado
			 try { 
				 /*El m�todo sleep() provoca que el int�rprete ponga al hilo en curso a dormir
				durante el n�mero de milisegundos que se indiquen en el par�metro de
				invocaci�n. Una vez transcurridos esos milisegundos, dicho hilo volver� a estar
				disponible para su ejecuci�n*/
				 sleep( retardo); 
			 } catch( InterruptedException e ) 
			 {
				 ;
			 }
		
		// Ahora imprimimos el nombre 
		System.out.println( "Hola Mundo! "+nombre+" "+retardo );
		
		}
 
	 
	 
	public static void main( String args[] ) { 
		TestTh t1,t2,t3;
	
		// Creamos los threads
		System.out.println ("Todos los hilos saludan :)");
		
		t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) ); 
		t2 = new TestTh( "Thread 2",(int)(Math.random()*2000) ); 
		t3 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
		
		// Arrancamoslos threads, si lo que queremos es que los hijos sean ejecutados
		//concurrentemente invocaremos el m�todo start
		t1.start(); 
		t2.start();
		t3.start(); 
		
	}//fin main
	}//Fin class multihola
 
