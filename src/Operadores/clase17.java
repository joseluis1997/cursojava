package Operadores;

import java.util.Scanner;

public class clase17 {
	private  static Scanner entrada;
	public static void main(String...args) {
		//hacer un programa que calcule el cuadrado de un suma
//		(a+b)^2=a^2+b^2+2ab
		entrada = new Scanner(System.in);
		 double a,b,cuadrado;
		 System.out.println("Digite el valor de A");
		 a=entrada.nextDouble();
		 System.out.println("Digite el valor de B");
		 b=entrada.nextDouble();
		 cuadrado=((Math.pow(a, 2)+Math.pow(b, 2)+(2*a*b)));
		 System.out.println("El cuadrado de su suma es::"+cuadrado);
	}

}
