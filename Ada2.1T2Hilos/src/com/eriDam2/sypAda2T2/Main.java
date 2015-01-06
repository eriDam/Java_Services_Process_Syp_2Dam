package com.eriDam2.sypAda2T2;

 

/*1.	Crea dos hilos, los cuales no se ejecuten secuencialmente, 
 * de tal manera que el hilo 1 muestre por pantalla la palabra un mensaje de bienvenida 
 * y la iteración en la que se encuentra y el hilo 2 muestre pon pantalla “soy el hilo 2 y 
 * es mi ciclo número” durante 10 ciclos, y que una vez finalizados muestre un mensaje 
 * que diga”Finaliza el hilo**” y además una vez finalizados muestre el mensaje “main terminado”.
 *  (Recordar que para que aparezca 
 * el mensaje del main cuando acaban los hilos hay que usar .join)*/
public class Main {

	/**Trabajando con sincronizacion pero en este caso, los hilos serán ellos
	 * los que se sincronicen mutuamente, que no intervenga el main para que no quede 
	 * bloqueado. */
	 

		public static void main(String[] args) {
					/** 
					 * creamos 2 tareas*
					 */
					Tarea tarea1 = new Tarea("Tarea 1");
					
					/**
					 * Creamos los dos hilos, uno x cada tarea, pero alterando el orden, pues
					*la tarea 2 tiene que recibir por parámetro el hilo 1 ya creado
					**/
					Thread hilo1= new Thread(tarea1);
					
					Tarea2 tarea2 = new Tarea2("Tarea 2",hilo1);
					Thread hilo2= new Thread(tarea2);

					hilo1.start();
					hilo2.start();
					System.out.println("El hilo principal queda libre");
					
					/**
					 * Para que el hilo principal espere a que acaben los dos hilos y 
					 * mostrar después el mensaje
					 * */
					try {
						hilo2.join();
						System.out.println("Han acabado los dos hilos :)");
					} catch (Exception e) {
						// TODO: handle exception
					}
		}

	}
