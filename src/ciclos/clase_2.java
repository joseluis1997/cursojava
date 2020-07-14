package ciclos;

import java.util.Scanner;

public class clase_2 {

		public static void main(String...args) {
			/*
			 * do while-> el do while primero se ejecuta almenos una ves la instruccion
			 * y luego la condicion, a diferencia del while primero se ejecuta la condicion
			 * para ver si cumple para recien poder ingresar al bucle
			 *Por ejemplo
			 */
			Scanner entrada = new Scanner(System.in);
			int i=1, contador;
			System.out.println("digite cantidad de numeros a imprimir en pantalla");
			contador = entrada.nextInt();			
			do{
				System.out.println(i);
				i+=2;// igual como en el while se puede hacer el avanze como deceees de tu contador i++
			}while(i<=contador);
		}
}
