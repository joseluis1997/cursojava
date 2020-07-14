package condicionales;

import javax.swing.JOptionPane;

public class clase_6_ejercicio_determinar_cuantas_cifras_tiene_un_numero {
	public static void main(String...args) {
		String dato;
//		
		dato = JOptionPane.showInputDialog("digite un numero");
		                  
		if(dato.length()==1) {
			JOptionPane.showMessageDialog(null, "El numero es de una cifrita");
		}
		else if(dato.length()==2) {
			JOptionPane.showMessageDialog(null, "El numero es de dos cifra");
		}
		else if(dato.length()==3) {
			JOptionPane.showMessageDialog(null, "El numero es de tres cifra");
		}
		else if(dato.length()==4) {
			JOptionPane.showMessageDialog(null, "El numero es de cuatro cifra");
		}
		else if(dato.length()==5) {
			JOptionPane.showMessageDialog(null, "El numero es de cinco cifra");
		}
		else {
			JOptionPane.showMessageDialog(null, "Numero fuera de rango");
		}
	}

}
