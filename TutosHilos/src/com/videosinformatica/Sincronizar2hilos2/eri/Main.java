package com.videosinformatica.Sincronizar2hilos2.eri;

 

/**Sigo trabajando con sincronizacion pero en este caso, los hilos serán ellos
 * los que se sincronicen mutuamente, que no intervenga el main para que no quede 
 * bloqueado. */
public class Main {

	public static void main(String[] args) {
				// creamos 2 tareas
				Tarea tarea1 = new Tarea("Tarea 1");
				
				//Creamos los dos hilos, uno x cada tarea, pero alterando el orden, pues
				//la tarea 2 tiene que recibir por parámetro el hilo 1 ya creado
				Thread hilo1= new Thread(tarea1);
				
				Tarea2 tarea2 = new Tarea2("Tarea 2",hilo1);
				Thread hilo2= new Thread(tarea2);

				hilo1.start();
				hilo2.start();
				System.out.println("El hilo principal queda libre");
				
				//Para que el hilo principal espere a que acaben los dos hilos y mostrar después el mensaje
				try {
					hilo2.join();
					System.out.println("Han acabado los dos hilos");
				} catch (Exception e) {
					// TODO: handle exception
				}
	}

}
