package ciclos;

import javax.swing.JOptionPane;

public class clase_17 {
	public static void main(String...args) {
		/*
		 * pedir un numero y calcular su factorial 
		 * N1= 1*2*3*...*N;
		 * ejemplo -> 4! = 1*2*3*4=24 factorial
		 */
		long numero,factorial=1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero a calcular su factorial"));
		
		for(int i=1;i<=numero;i++) {
			factorial = factorial*i;
		}
		System.out.println("El factorial de "+numero+"!"+" es "+factorial);
	}
}
