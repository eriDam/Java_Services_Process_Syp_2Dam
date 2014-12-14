package com.syp.rellenarserienum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RellenarSerieNum {

	public static void main(String[] args) {
/**
 * @author Eri
 * 2.2.4.Realizar un programa que muestre por pantalla los numeros naturales 
 * hasta un valor final introducido por teclado por el usuario, este mismo ejemplo 
 * lo usaremos para ver la estructura do-while, y for
 * */
		
		System.out.println ("*** Empezamos el programa que rellena una serie***");
        System.out.println ("Por favor introduce 1 número: ");
        /**Declaro la variable int para el numero*/
        int entradaTeclado;
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
        entradaTeclado = entradaEscaner.nextInt();
        System.out.println ("El número es: \"" + entradaTeclado +"\"");
        	/**Creo un for para que me muestre los numeros desde el 0 hasta el que haya 
        	 * introducido el usuario*/
        for (int i = 0; i <= entradaTeclado; i++) {
			System.out.println(i);
        }//fin for
        	}catch (InputMismatchException e)
        {
            System.out.println ("Has de introducir un entero!  "+e);
             
        }       
	} //Cierre del main
} //Cierre de la clase
		 