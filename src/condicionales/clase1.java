package condicionales;

import javax.swing.JOptionPane;

public class clase1 {
	public static void main(String...args) {
		/*sentencia if:
		 * if(condicion){
		 * 		instrucion 1;
		 * }else{
		 * 		instrucion 2;
		 * }
		 */
		int  numero, dato=5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		/*
		 * ==: igualdad
		 * != : Diferencia
		 * > : Mayor
		 * >= Mayor o igual
		 * < : Menor
		 * <= : Menor o igual
		 */
		
		if(numero == dato) {
			JOptionPane.showMessageDialog(null, "El numero es mayor de 5");
		}else {
			JOptionPane.showMessageDialog(null,"El numero es igual a 5");
		}
	}
}
