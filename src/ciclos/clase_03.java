package ciclos;

import java.util.Scanner;

public class clase_03 {
	/*
	 * Clase_#3 -> ciclo for
	 * For (inicializacion ; condicion ; incremento o decremento)
	 * {
	 * 			intrucciones;
	 * }
	 */
	public static void main(String...args) {
		Scanner entrada = new Scanner (System.in);
		int contador;
		
		System.out.println("Digete que pantidad de numero quiere que se visualize en pantalla");
		// ahora tambien pedimos hasta que valor quiere imprimir en pantalla pero solo mostramos los numero pares
		
		contador = entrada.nextInt();
		for (int i=2;i<=contador;i+=2)
		{
			System.out.println(i);
		}
//		contador = entrada.nextInt();
//		for(int i=1;i<=contador;i++) {
//			System.out.println(i);
//		}
		
//		for (int i =1 ; i<=1000000000 ; i++) {
//			System.out.println(i);
//		}
//		for (int i =10 ; i>=1 ; i--) {
//			System.out.println(i);
//		}

	}

}
