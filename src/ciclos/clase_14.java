package ciclos;

import javax.swing.JOptionPane;

public class clase_14 {
	
	public static void main(String...args) {
		/*
		 * Escribir todos los numeros del 100 al 0 
		 * de 7 en 7
		 */
		for(int i=100;i>=0;i=i-7)
		{
//			System.out.println(i);
			JOptionPane.showMessageDialog(null, i);
		}
	}
}
