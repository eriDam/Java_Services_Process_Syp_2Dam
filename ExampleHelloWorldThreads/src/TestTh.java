// Definimos unos sencillos hilos. Se detendrán un rato 
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
		 public void run() { // Retrasamos la ejecución el tiempo especificado
			 try { 
				 /*El método sleep() provoca que el intérprete ponga al hilo en curso a dormir
				durante el número de milisegundos que se indiquen en el parámetro de
				invocación. Una vez transcurridos esos milisegundos, dicho hilo volverá a estar
				disponible para su ejecución*/
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
		//concurrentemente invocaremos el método start
		t1.start(); 
		t2.start();
		t3.start(); 
		
	}//fin main
	}//Fin class multihola
 
