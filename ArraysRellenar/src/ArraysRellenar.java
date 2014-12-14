/**Act 2.5 5.	
 * Defino un vector de 10 enteros, lo relleno y 
 * después me muestra por pantalla los valores de dicho vector
 * 
 * ACT VOLUNTARIA: Excepciones en los Arrays
¿Como podemos solucionar el error que se produce al leer fuera de un arreglo?.-Con try y catch
 */
public class ArraysRellenar {

	public static void main(String[] args) {
		/** Creo el Array de Integers, colocando ya cada valor en su posicion he preferido hacerlo así es mas corto.*/
				 int arreglo[] = { 12, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
				 try{ /**uso try para capturar desp las excepciones*/
					 
				 
				  /**Esta es la otra manera de ponerle los datos en las posiciones
				  *int arreglo[]= new int [10];
					 arreglo[0] = 7; 
					 arreglo[1] = 27;
					 arreglo[2] = 19;
					 arreglo[3] = 32;
					 arreglo[4] = 25;
					 arreglo[5] = 8;
					 arreglo[6] = 14;
					 arreglo[7] = 9;
					 arreglo[8] = 20;
					 arreglo[9] = 49;*/
				
				 
				 /**Hacemos un bucle para que recorra el array*/
				 for ( int contador = 0; contador < arreglo.length; contador++ )
					 /**Pedidmos que imprima cada posición en una lista de dos columnas, lo que no
					  *  consigo es q  imprima la primera posicion alineada*/
					  
					 System.out.printf( "La posición es %2d y he almacenado el valor%3d\n ", contador, arreglo[ contador ] );
				
				 /**Así sólo imprimiria la posición que le pida, vamos a probar con 12 que le supera las posiciones
				  *  a ver si me captura el error 
				  */
				 System.out.print(arreglo[12]);
				 
				 /**Aqui capturo la excepción en caso de superar la longitud del array o posiciones que tiene, esto
				 creo que solo valdria si le solcitas manual al array su posicion, pero de esta manera
				 al indicarle yo en la condicion del for que sea menor a 10, nunca lo va a poder superar ;) */
				 }catch (ArrayIndexOutOfBoundsException eind){ 
				 eind.printStackTrace();
		         System.out.println("Has causado un error, solo tiene 10 posiciones!!!");
				 }
				 System.out.println("Prueba otra vez!!!");
			}
			}