package condicionales;

import javax.swing.JOptionPane;

public class clase_2_Switch {
	public static void main(String...args) {
		/*clase La sentencia switch
		 * switch (dato){
		 * 		case 1: instruciones 1;
		 * 				break;
		 * 		case 2: instruciones 2;
		 * 				break;
		 * 		case n: instruciones n;
		 * 				break;
		 * 		default: CasoContrario:
		 * 				brak;
		 * }
		 */
		int dato;
		dato=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1-5"));
		switch (dato) {
		case 1:
			JOptionPane.showMessageDialog(null, "Es el numero 1");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Es el numero 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Es el numero 3");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Es el numero 4");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Es el numero 5");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El numero introducido no esta entre el 1-5");
			break;
		}
	}

}
