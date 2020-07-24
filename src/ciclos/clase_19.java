package ciclos;

import javax.swing.JOptionPane;

public class clase_19 {
	public static void main(String...args) {
		/*
		 * pedir 10 sueldos y mostrar su suma y cuantos hay 
		 * mayores a $1000
		 */
		float numero,sumaS=0,sueldosM=0;
		
		for(int i=0 ; i<10 ;i++) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Digite 10 sueldos"));
			if (numero>1000) {
				sueldosM=sueldosM+1;
			}
			sumaS=sumaS+numero;
		}
		
		System.out.println("El total de los sueldos es " + sumaS);
		System.out.println("hay " +sueldosM+" Mayores a $1000");
	}
}
