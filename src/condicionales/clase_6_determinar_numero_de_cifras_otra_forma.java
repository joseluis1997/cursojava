package condicionales;

import javax.swing.JOptionPane;

public class clase_6_determinar_numero_de_cifras_otra_forma {
	public static void main(String...args) {
		int dato;
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99 999"));
		if(dato<=9) {
			JOptionPane.showMessageDialog(null, "El numero es de una cifra");
		}
		else if(dato>9 && dato<100) {
			JOptionPane.showMessageDialog(null, "El numero es de dos cifras");
		}
		else if(dato>=100 && dato<1000) {
			JOptionPane.showMessageDialog(null, "El numero es de tres cifras");
		}
		else if(dato>=1000 && dato<10000) {
			JOptionPane.showMessageDialog(null, "El numero es de cuatro cifras");
		}
		else if(dato>=10000 && dato<100000) {
			JOptionPane.showMessageDialog(null, "El numero es de cinco cifras");
		}
		else {
			JOptionPane.showMessageDialog(null, "Numero fuera de rango");
		}
	}
}
