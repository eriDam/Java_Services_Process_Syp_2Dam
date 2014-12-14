package com.syp.parimpar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Eri
 * 2.	2.	Realizar el ejercicio que vimos en organigramas, donde hac�amos
 *  un programa que  dado un n�mero nos dec�a si era par o impar*/
public class ParImpar {

	public static void main(String[] args) {
		/***/
		
		System.out.println ("*** Empezamos el programa que identifica si es par o impar***");
        System.out.println ("Por favor introduce 1 n�mero: ");
        /**Declaro la variable int para la entradaTeclado*/
        int entradaTeclado;
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
        entradaTeclado = entradaEscaner.nextInt();
        System.out.println ("El n�mero es: \"" + entradaTeclado +"\"");
        	/**Los numeros pares son aquellos que son divisibles entre 2.
			Utilizamos % para dividir , entre 2 si es =0 ser� par, creo un condicional
			if else para que me los diferencie seg�n cumpla condici�n*/
        	if(entradaTeclado %2 ==0){
        		System.out.println("El numero \"" + entradaTeclado +"\" es par");
        	}else{
        		System.out.println("El numero \"" + entradaTeclado +"\" es impar");
        	}
        	}catch (InputMismatchException e)
        {
            System.out.println ("Has de introducir un entero!  "+e);
             
        }       
	} //Cierre del main
} //Cierre de la clase
		 