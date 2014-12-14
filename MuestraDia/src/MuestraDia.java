import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Eri
 * Actividad 2.2.3.	Realizar un programa que dado un día de la semana (entre 1 y 7)
 *  muestre por pantalla el nombre del día*/
public class MuestraDia {

	public static void main(String[] args) {
		 System.out.println("Elije un día de la semana:\n"
		 		+ "          1-Lunes * 2-Martes * 3-Miércoles * 4-Jueves * 5-Viernes * 6-Sábado * 7-Domingo : ");
		 /**Declaro la variable int para la entradaDia*/
	        int entradaDia;
	        try
	        {
	         /**Creación de un objeto Scanner, Mediante este objeto podemos acceder a los
			 * diferentes métodos y propiedades que nos proporciona la clase Scanner
			 * El argumento ( System.in ) permite al programa leer las respuestas del
			 * usuario que escribe desde el teclado.*/
	        Scanner entradaEscaner = new Scanner (System.in); 
	        
	        /**Invocamos un método nextInt  sobre un objeto Scanner el objeto entradaTeclado de
	         *  la clase Scanner llama al método next () y nextInt(),  
	         * para leer la respuesta y almacenar su valor en la variable correspondiente.*/
	        entradaDia = entradaEscaner.nextInt();
	        System.out.println ("El número de día es: \"" + entradaDia +"\"");
	        
	        	/**Creo un swicth, para elección, siendo cada día de la semana un case*/
	        	switch (entradaDia) {
				case 1:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Lunes");
					break;
				case 2:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Martes");
					break;
				case 3:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Miércoles");
					break;
				case 4:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Jueves");
					break;
				case 5:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Viernes");
					break;
				case 6:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Sábado");
					break;
				case 7:
					System.out.println ("El número de día es: \"" + entradaDia +"\" y es Domingo");
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
			 