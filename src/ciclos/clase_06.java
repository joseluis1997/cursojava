package ciclos;

import javax.swing.JOptionPane;

public class clase_06 {
	/*
	 * ler un numero e indicar si es positivo o negativo,
	 * el proceso se repetira hasta que se introduzca un 0
	 */
	public static void main(String...args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		while( numero>0 || numero<0) {
			if(numero>0) {
				JOptionPane.showMessageDialog(null, "El numero es positivo");
			}
			else if(numero<0) {
				JOptionPane.showMessageDialog(null, "El numero es negativo");
			}
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		}
		
	}
}
