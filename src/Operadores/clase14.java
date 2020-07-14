package Operadores;

import java.util.Scanner;

public class clase14 {
	private static Scanner entrada;
	public static void main (String...args) {
		/*Ejercicio 14
		 * guillermo tiene N dolares, luis tiene la mitad de lo que posee gullermo juan tiene la mitad de lo que pose
		 * luis y guillermo juntos. hacer un programa que calcule eh imprima la cantidad de dinero que tienen entre los 3
		 */
		
			entrada = new Scanner(System.in);
			
			float guillermo,luis,juan,totalDinero;
			System.out.println("Introduzcca los N dolares que tiene Guillermo");
			guillermo = entrada.nextFloat();
			System.out.println("Dinero de G40uillermo ::" + guillermo);
			luis=guillermo/2;
			System.out.println("Luis posee la mitad de lo que tiene Guillermo::"+luis);
			juan=((guillermo+luis)/2);
			System.out.println(" juan tiene la mitad de lo que poseen guillemo y luis juntos::"+juan);
			totalDinero=(guillermo+luis+juan);
			System.out.println("Dinero total que tiene los  3::"+totalDinero);
		
	}

}
