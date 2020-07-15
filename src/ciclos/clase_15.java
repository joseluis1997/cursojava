package ciclos;

import javax.swing.JOptionPane;

public class clase_15 {
	
	public static void main(String...args) {
		/*
		 * pedir 10 numeros y imprimir la suma total
		 */
		int numero,suma=0;
		for(int i=1;i<=10;i++) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite solo 10 numeros\ny se obtendra como\nresultado la suma total de todos\n numero" +i));
			suma = suma + numero;
		}
		JOptionPane.showMessageDialog(null, "La suma total es "+ suma);
	}
}
