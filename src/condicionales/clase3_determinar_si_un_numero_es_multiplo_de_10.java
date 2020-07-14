package condicionales;

import javax.swing.JOptionPane;

public class clase3_determinar_si_un_numero_es_multiplo_de_10 {
	public static void main(String...args) {
		/* ejercicio 
		 * realizar un programa que lea un numero entero
		 * y muestre si el numero es multiplo de 10
		 */
		int numero;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
		if (numero%10 == 0) {
			JOptionPane.showMessageDialog(null, "El numero"+numero+"es multiplo de  10");
		}else {
			JOptionPane.showMessageDialog(null, "El numero"+numero+"no multiplo de  10");
		}
	}

}
