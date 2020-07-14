package Operadores;

import java.util.Scanner;

public class clase6 {
	public static Scanner entrada,cadenas;
	public static void main(String...args) {
		//clase 6 entrada y salida de datos por consola
		 entrada = new Scanner(System.in);
		 cadenas =new Scanner(System.in);
		int numero;
	System.out.println("Introduzca un numero entero");
		numero=entrada.nextInt();
		System.out.println("su numero es: "+numero);
	System.out.println("Introduzca numero con punto decimal");
		float numfloat;
		numfloat=entrada.nextFloat();
		System.out.println("Su numero es :"+numfloat);
	System.out.println("Introduzca cadenas");
		String cadena;
		cadena = cadenas.nextLine();
		System.out.println("su cadena es: "+cadena);
	System.out.println("Introduzca caracteres");
		char letra;
		letra = entrada.next().charAt(0);
		System.out.println("su letra es: "+letra);
	}

}
