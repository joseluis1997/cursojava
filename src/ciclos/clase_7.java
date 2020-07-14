package ciclos;

import javax.swing.JOptionPane;

public class clase_7 {
	public static void main(String...args) {
		
		/*
		 * Leer un numero y mostrar su cuadrado, repetir el preceso hasta que se
		 * introduzca un numero negativo
		 */
		
		int numero, cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero a calcular su cuadrado"));
		
		while(numero >0) {
			
			cuadrado = (int)Math.pow(numero, 2);
			
			JOptionPane.showMessageDialog(null, "su cuadrado del "+ numero+" es "+ cuadrado);
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero a calcular cuadrado"));
		}
	}
}
