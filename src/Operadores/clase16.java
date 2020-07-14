package Operadores;

import java.util.Scanner;

public class clase16 {
	private static Scanner entrada;
	public static void main(String...args) {
		/*Ejercicio
		 * la calificacion final de un estudiante de informatica se calcula con
		 * base a las calificaciones de 4 aspectos de su rendimiento academico:
		 * participacion, primer examen parcial,segundo examen parcial y examen final
		 * sabiendo que las calificaciones anteriores entran a la calificacion final
		 * con ponderaciones del 10%, 25%, 25%, 40%, hacer un programa que calcule e
		 * imprimala calificacion final obtenida por el estudiante
		 */
//		participacion=0.10f,primerExamen=0.25f,segundoEx=0.25f,ExamenFin=0.40f
		entrada = new Scanner(System.in);
		float participacion,primerExamen,segundoEx,ExamenFin,NotaFinal;
		System.out.println("Digite nota de participacion::");
		participacion=entrada.nextFloat();
		participacion*=0.10f;
		System.out.println("Digite la Nota del Primer Parcial");
		primerExamen=entrada.nextFloat();
		primerExamen*=0.25f;
		System.out.println("Digite la Nota del Segundo Parcial");
		segundoEx=entrada.nextFloat();
		segundoEx*=0.25f;
		System.out.println("Digite la Nota del Ultimo Parcial");
		ExamenFin=entrada.nextFloat();
		ExamenFin*=0.40f;
		NotaFinal=(participacion+primerExamen+segundoEx+ExamenFin);
		System.out.println("Su Nota fina es::"+NotaFinal);
	}

}
