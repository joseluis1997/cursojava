package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_clase_5 {
	public static void main(String...args) {
		/*Ejercicio extra de la clase 5
		 * hacer un programa que tome dos numeros
		 * y diga si ambos son pares o impares
		 */
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero"));
		
		if ((numero1%2)==0 && (numero2%2)==0) {
			JOptionPane.showMessageDialog(null,"Ambos numeros son pares");
		}
		else if((numero1%2)==0) {
			JOptionPane.showMessageDialog(null, "El " + numero1 + " es par "+"numero2 es impar");
		}
		else if((numero2%2)==0) {
			JOptionPane.showMessageDialog(null, "El " + numero2 + " es par "+" numero1 es impar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Ambos numeros son Impares");
		}
	}
}
