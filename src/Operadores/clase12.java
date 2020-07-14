package Operadores;

import java.util.Scanner;

public class clase12 {
	private static Scanner entrada;
	public static void main(String...args) {
		//clase 12 ejercicio calcular la suma de 3 notas
		/*
		 * hacer un programa que calcule e imprima la suma
		 * de tres calificaciones
		 */
		entrada = new Scanner(System.in);
		float nota1,nota2,nota3,suma;
		System.out.println("Digite 3 calificaciones");
		
//		Guardamos las 3 notas
		
		nota1=entrada.nextFloat();
		nota2=entrada.nextFloat();
		nota3=entrada.nextFloat();
		
		suma=nota1+nota2+nota3;
		
		System.out.println("\n"+suma);
	}
}
