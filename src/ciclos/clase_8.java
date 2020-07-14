package ciclos;

import javax.swing.JOptionPane;

public class clase_8 {
	public static void main(String...args) {
		/*
		 * Leer numero hasta que se introduzca un cero, para cada uno indicar 
		 * si es par o impar.
		 */
		
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero para ver si es par o impar"));
		
		while(numero!=0) {//while(numero>0 || numero<0)
			if((numero%2)==0) {
				JOptionPane.showMessageDialog(null, "El numero es par");
			}
			else if((numero%2)!=0) {
				JOptionPane.showMessageDialog(null, "El numero es impar");
			}
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero para ver si es par o impar"));
		}
	}
}
