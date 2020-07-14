package Operadores;

import java.util.Scanner;

public class clase13 {
	private static Scanner entrada;
	public static void main(String...args) {
		// clase 13 ejercicio
		/*
		 * hacer un programa que calcule e imprima el 
		 * salario semanal de un empleado a partir de sus
		 * horas semanales trabajadas y de su salario por hora
		 */
		entrada = new Scanner (System.in);
		float preciohora,horasemana,resul;
		System.out.println("Cuanto cobra por hora");
		preciohora = entrada.nextFloat();
		System.out.println("cuantas horas trabajo a la semana");
		horasemana = entrada.nextFloat();
		resul = preciohora*horasemana;
		System.out.println("su sueldo semanal es :"+resul);
		
	}
}
