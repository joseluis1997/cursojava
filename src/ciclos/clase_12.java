package ciclos;

import javax.swing.JOptionPane;

public class clase_12 {
	public static void main(String...args) {
		/*
		 * pedir numeros hasta que se introduzca uno negativo
		 * y calcular la media
		 */
		int numero,suma=0,contador=0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros, para calcular su media\""));
		
		while(numero>0) {
			suma = suma + numero;
			contador++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros, para calcular su media"));
		}
		
		if(contador == 0) {
			System.out.println("Error, no tiene con sacar la media");
		}
		else {
			media = (float) (suma/contador);
			JOptionPane.showMessageDialog(null, "la Media de todos los numeros introducidos es :: " + media);
		}
		
	}
}
