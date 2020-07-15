package ciclos;

import java.util.Scanner;

public class clase_13 {
	
	public static void main(String...args) {
		/*
		 * pedir un numero N, y mostrar todos los numeros del 1 al N
		 */
		Scanner entrada = new Scanner(System.in);
		int numero,contador=1;
		numero = entrada.nextInt();
		while(contador<=numero) {
			System.out.println(contador);
			contador++;
		}
	}
}
