package ciclos;

import javax.swing.JOptionPane;

public class clase_18 {
	public static void main(String...args) {
		/*
		 * pedir 10 numeros, mostrar la media de los numeros positivos
		 * la media de los negativos y la cantidad de ceros
		 * test => 1,2,3,8,0,0,-4,-8,-9,-2
		 */
			int numero,sumaP=0,sumaN=0,contaP=0,contN=0,contC=0;
			float mediaP=0,mediaN=0;
			
			for(int i=1 ; i<=10 ; i++) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("digite 10 numeros"));
				if (numero==0) {
					contC++;
				}
				else if(numero>0) {
					sumaP=sumaP+numero;
					contaP++;
				}
				else if(numero<0) {
					sumaN=sumaN+numero;
					contN++;
				}
				
				if(contaP==0) {
					System.err.println("error no se puede sacar la media de numero postivos");
				}
				else {mediaP= (float)sumaP/contaP;}
				
				if(contN==0) {
					System.out.println("No se puede calcular la media de los numero negativos");
				}
				else {mediaN=(float)sumaN/contN;}
			}
			
			System.out.println("se Introduzco "+contC+" ceros");
			System.out.println("la media de los numeros positos es "+mediaP);
			System.out.println("la medai de los numeros negativos es "+ mediaN);
	}
}
