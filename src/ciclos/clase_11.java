package ciclos;

import javax.swing.JOptionPane;

public class clase_11 {
	public static void main(String...args) {
		/*
		 * Pedir numeros hasta que se teclee un cero
		 * mostrar la suma de totos los numeros introducidos
		 */
		int numero, suma=0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros,el programa le dara la suma total de todos los numeros introducidos"));
			suma = suma +numero;
			
		}while(numero!=0);
		JOptionPane.showMessageDialog(null, "la suma total es " + suma);
	}
}
