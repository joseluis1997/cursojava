package ciclos;

import javax.swing.JOptionPane;

public class clase_9 {
	public static void main(String...args) {
		/*
		 * Pedir numero hasta que se teclee un numero negativo,
		 * y mostrar cuando numero se han introducido
		 */
		int numero, contador=0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros"));
		
		while(numero>0) {
			contador++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros"));
		}
	JOptionPane.showMessageDialog(null,"Se ha introducido "+ contador);
	}
}
