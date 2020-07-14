package condicionales;

import javax.swing.JOptionPane;

public class clase_ejercicio_nota_entre_0_y_10 {
	public static void main(String...args) {
		/* pedir una nota de 0 a 10 y mostrarla de la forma:
		 * insuficiente, suficiente, bien,notable y sobresaliente
		 */
		int nota;
		nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una nota entre 0 y 10"));
		switch(nota) {
			case 1:
			case 2:
			case 3:
			case 4: 
			case 5:
				JOptionPane.showMessageDialog(null, "Nota insuficiente");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Nota suficiente");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Nota suficiente");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Nota Bien!!!");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Nota Notable!!!");
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Nota Sobresaliente");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nota invalida");
				break;
				
		}
	}
}
