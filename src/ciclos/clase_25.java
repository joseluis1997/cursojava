package ciclos;

import javax.swing.JOptionPane;

public class clase_25 {
	public static void main(String...args) {
		/*
		 * pedir un numero N, introducir N sueldos, y mostrar
		 * el sueldo Mayor
		 */
		
		int n;
		float sueldo,sueldoM=0;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos a Introducir"));
		
		for (int i = 1 ; i<= n ; i++) {
			do {
				sueldo= Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo "+i));
			}while(sueldo<0);
			
			if(sueldo>sueldoM) {
				sueldoM=sueldo;
			}
			else {
				System.out.println("Sueldo Menor");
			}
		}
		System.out.println("El suelo Mayor es "+ sueldoM	);
	}
}
