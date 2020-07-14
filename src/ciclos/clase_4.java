package ciclos;

import java.util.Scanner;

public class clase_4 {
	public static void main(String...args) {
		/*
		 *  Bloque :: ciclos o bucles /ejercicio 1
		 * leer un numero y mostrar su cuadrado, repetir el proceso hasta que
		 * se introduzca un numero negativo
		 */
		
		Scanner entrada = new Scanner(System.in);
		int i=1, numero,resul;
		
		System.out.println("Digite un numero, numero positivo");
		
		numero = entrada.nextInt();
		
		while(numero>=0) {
			
			resul = (int) Math.pow(numero, 2);
			System.out.println(resul);
			numero = entrada.nextInt();
			
		}
	}
}
