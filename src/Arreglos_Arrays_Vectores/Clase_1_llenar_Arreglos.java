package Arreglos_Arrays_Vectores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Clase_1_llenar_Arreglos {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int nElementos;
		
		//pedimos los elementos del arrays por una ventana emergente
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la Cantidad de Elementos"));
		
		char[] letras = new char[nElementos];
		
		for(int i=0 ; i<nElementos ; i++) {
			System.out.print((i+1)+". Digite el Caracter");
			letras[i] = entrada.next().charAt(0);
		}
		
		System.out.println("los Elementos de su Arreglo son");
		for(int i=0 ; i<nElementos ;i++) {
			System.out.print(letras[i]+ " ");
		}
		
	}
}
