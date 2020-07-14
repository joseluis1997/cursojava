package Operadores;

import java.util.Scanner;

public class clase19 {
	private static Scanner entrada;
	public static void main(String...args) {
		/* Ejercicio 
		 * construir un programa que calcule y muestre por pantalla
		 * las raices de la ecuacion de segundo grado de los
		 * coeficientes reales
		 * ax^2 + bx + c = 0
		 */
		entrada = new Scanner(System.in);
		double a,b,c,x1,x2;
		
		System.out.println("Digite Valor para a");
		a=entrada.nextDouble();
		System.out.println("Digite valor de B");
		b=entrada.nextDouble();
		System.out.println("Digite valor de C");
		c=entrada.nextDouble();
		
		x1= (-b+(Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
		x2= (-b-(Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
		
		System.out.println("Resultado ::"+x1);
		System.out.println("Resultado ::"+x2);
	}

}
