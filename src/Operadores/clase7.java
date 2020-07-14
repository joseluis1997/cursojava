package Operadores;

import javax.swing.JOptionPane;

public class clase7 {
	public static void main(String...args) {
		//clase 7 entrada y salida de datos con JOptionPane
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Introduzca una cadena");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un entero"));
		letra = JOptionPane.showInputDialog("digite un caracter").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
		//mostramos los resultados
		
		JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
		JOptionPane.showMessageDialog(null, "el entero es: "+entero);
		JOptionPane.showMessageDialog(null, "la letra es: "+letra);
		JOptionPane.showMessageDialog(null, "el decimal es: "+decimal);
	}

}
