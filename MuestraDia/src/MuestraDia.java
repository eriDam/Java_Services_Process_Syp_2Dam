import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Eri
 * Actividad 2.2.3.	Realizar un programa que dado un d�a de la semana (entre 1 y 7)
 *  muestre por pantalla el nombre del d�a*/
public class MuestraDia {

	public static void main(String[] args) {
		 System.out.println("Elije un d�a de la semana:\n"
		 		+ "          1-Lunes * 2-Martes * 3-Mi�rcoles * 4-Jueves * 5-Viernes * 6-S�bado * 7-Domingo : ");
		 /**Declaro la variable int para la entradaDia*/
	        int entradaDia;
	        try
	        {
	         /**Creaci�n de un objeto Scanner, Mediante este objeto podemos acceder a los
			 * diferentes m�todos y propiedades que nos proporciona la clase Scanner
			 * El argumento ( System.in ) permite al programa leer las respuestas del
			 * usuario que escribe desde el teclado.*/
	        Scanner entradaEscaner = new Scanner (System.in); 
	        
	        /**Invocamos un m�todo nextInt  sobre un objeto Scanner el objeto entradaTeclado de
	         *  la clase Scanner llama al m�todo next () y nextInt(),  
	         * para leer la respuesta y almacenar su valor en la variable correspondiente.*/
	        entradaDia = entradaEscaner.nextInt();
	        System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\"");
	        
	        	/**Creo un swicth, para elecci�n, siendo cada d�a de la semana un case*/
	        	switch (entradaDia) {
				case 1:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Lunes");
					break;
				case 2:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Martes");
					break;
				case 3:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Mi�rcoles");
					break;
				case 4:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Jueves");
					break;
				case 5:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Viernes");
					break;
				case 6:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es S�bado");
					break;
				case 7:
					System.out.println ("El n�mero de d�a es: \"" + entradaDia +"\" y es Domingo");
					break;
	
				default:
					break;
				} 
	        	}catch (InputMismatchException e)
	        {
	            System.out.println ("Has de introducir un entero!  "+e);
	             
	        }       
		} //Cierre del main
	} //Cierre de la clase
			 