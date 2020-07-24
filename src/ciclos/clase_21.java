package ciclos;

import javax.swing.JOptionPane;



public class clase_21 {
	public static void main(String...args) {
		/*
		 * pide un numero que debe estar entre
		 * 0-10, y mostrar la tabla de multiplicar
		 * de dicho numero
		 */
		
		int numero,tabla;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para generar su tabla de multiplicasion"));
		System.out.println("Tabla de Mutiplicacion del "+numero);
		if(numero>0 && numero<=10) {
			for( int i=1 ; i<=10 ; i++) {
				tabla=i*numero;
				System.out.println(numero+"*"+i+"="+tabla+"\n");
			}
		}
		
	}
}
