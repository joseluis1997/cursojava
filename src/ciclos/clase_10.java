package ciclos;

import javax.swing.JOptionPane;

public class clase_10 {
	/*
	 * realizar un juego para adivinar un numero,
	 * para ello generar un numero aleatorio entre 0-100, y luego
	 * ir pidiendo numeros indicando "es mayor" o es menor con respeto a N,
	 * el proceso termina cuando el usuario acierta y mostrar
	 * el numero de intentos.double numero = Math.random();
	 */
	public static void main(String...args) {
		int numero,aleatorio,contador=0;
		JOptionPane.showMessageDialog(null, "Adivina el numero");
		aleatorio = (int)(Math.random()*100);
		System.out.println(aleatorio);
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			if(aleatorio>numero) {
				System.out.println("\nDigite un numero mayor");
			}else {
				System.out.println("\nDigite un numero menor");
			}
			contador++;
		}while(numero!=aleatorio);
		System.out.println("\n Genial adivinaste el numero en " + contador + "intentos");
	}
}
