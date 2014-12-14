package com.syp.ControlDeAccesoDisco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Eri
 * 2.1.	Realizar un programa que nos muestre un mensaje para saber 
 * si una persona podrá venir a la discoteca el día que hagamos la 
 * cena de navidad o se quedará en la puerta…(teniendo en cuenta que
 *  para entrar en algunas discotecas hacen falta 21 años)*/

public class controlAcceso {
 

	public static void main(String[] args) {
		System.out.println ("*** Empezamos el programa control de Acceso ***");
        System.out.println ("Por favor introduce tu edad en el teclado: ");
        /**Declaro la variable int para la edad*/
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
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        	if(entradaTeclado >20){
        	System.out.println("Enhorabuena puedes acceder a la discoteca   :) ");
        	}else{
        		System.out.println("No puedes acceder a la discoteca...:(");
        	}
        	}catch (InputMismatchException e)
        {
            System.out.println ("Has de introducir un entero!  "+e);
            e.printStackTrace ();
        }
       
        
        
	} //Cierre del main
} //Cierre de la clase