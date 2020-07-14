package ciclos;

import java.util.Scanner;

public class clase_1 {
	/*clase numero 1
	 * ciclo While-> Mientras
	 * While(condicion){
	 * 	instruciones
	 * }
	 */
	public static void main(String...args) {
//		int i=1, 
//		while(i<=100) {
//			System.out.println(i);
//			i++;
//		}
		
//		imprimiendo de mayor a menot desendente
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
// ahora ejemplo pidiendo cuantos numeros quiere que se imprima en pantalla
		
//		Scanner entrada = new Scanner (System.in);
//		int i=1, contador;	
//		contador = entrada.nextInt();
//		while(i<= contador) {
//			System.out.println(i);
//			i++;
//		}
//		ahora indicamos a nuestro contador i++ que avanze de 2 en 2, o las veces que queramos
		Scanner entrada = new Scanner (System.in);
		int i=1, contador;
		System.out.println("digite cantidad de numeros quiere imprimir en pantalla");
		contador = entrada.nextInt();
		while(i<=contador){
			System.out.println(i);
			i+=2;
		}
	}

}
