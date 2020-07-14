package condicionales;

import javax.swing.JOptionPane;

public class clase4_determinar_si_una_letra_es_mayuscula_o_no {
	public static void main(String...args) {
		/*Hacer un programa
		 * que lea un caracter por teclado y compruebe si es una letra 
		 * mayuscula
		 */
		char letra;
		
		letra = JOptionPane.showInputDialog("Introduzca una letra").charAt(0);
		
		if(Character.isUpperCase(letra)) //Character.isUpperCase, es un metodo que nos devuelve un true o false si la letra es mayuscula o no
		{
			JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
		}else {
			JOptionPane.showMessageDialog(null, "no es una letra mayuscula");
		}
	}

}
