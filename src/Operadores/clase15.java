package Operadores;

import java.util.Scanner;

public class clase15 {
	private static Scanner entrada;
	public static void main(String...args) {
		/* Ejercicio #4
		 * Una compania de ventas de carros usados, paga a su personal de ventas un
		 * salario de $1000 mensuales, mas una comision de $150 por cada carro vendido
		 * mas el 5% del valor de la venta por carro, cada mes el capturista de la empresa
		 * ingresa en la computadora los datos pertinentes, hacer un programa que calcule y imprima
		 * el salario mensual de un vendedor dado
		 */
		entrada=new Scanner(System.in);
		float salario=1000f,comision=150,valorventa=0.05f;
		float comisionTotal,porcentaje,precio,sueldoto;int carros;
		System.out.println("Cuantos carros vendio al mes::");
		carros=entrada.nextInt();
		System.out.println("digite precio de los autos");
		precio=entrada.nextFloat();
		comisionTotal=carros*comision;
		porcentaje=((precio*carros)*valorventa);
		sueldoto=(salario+comisionTotal+porcentaje);
		System.out.println("comision por sus carros vendidos es::"+comisionTotal);
		System.out.println("5% del precio de la venta de un carro es ::"+porcentaje);
		System.out.println("su sueldo total es::"+sueldoto);
		
		
	}

}
