package ciclos;

import javax.swing.JOptionPane;

public class clase_26 {
	public static void main(String...args) {
		/*
		 * pedir 10 numeros,y mostrar al final si se ha introducido
		 * algun negativo, pero utilizando variable boolean
		 */
		int numero;
		boolean hay_negativo=false;
		
		for( int i=1 ; i<=10 ; i++) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 numeros"));
			
			if(numero<0) {
				hay_negativo=true;
			}
		}
		
		if (hay_negativo==true) {
			System.out.println("Almenos existe un numero negativo de los 10 numeros introducidos");
		}else {
			System.out.println("No existe numeros negativos");
		}
	}
}
