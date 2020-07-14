package Operadores;

import java.util.Scanner;

public class clase18 {
	private static Scanner entrada;
	public static void main(String...args) {
		
		/*Construir un programa que, dado un numero total de horas, devuelve el 
		 * numero de semanas, dias y horas equivalentes por ejemplo, dado la de 1000
		 * horas debe mostrar 5 semanas, 6 dias y 16 horas
		 */
		int horaTotales,semanas,dias,horas;
		entrada = new Scanner(System.in);
		System.out.print("Introduzca las horas");
		
		horaTotales=entrada.nextInt();
		
		semanas=horaTotales/168;
		dias=((horaTotales%168)/24);
		horas=horaTotales%24;
		System.out.println("\nSemanas::"+semanas);
		System.out.println("dias::"+dias);
		System.out.println("horas ::" + horas);
		
	}
}
