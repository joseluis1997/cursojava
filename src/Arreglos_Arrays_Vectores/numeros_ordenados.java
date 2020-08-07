package Arreglos_Arrays_Vectores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class numeros_ordenados {
	public static void main(String[]args) {
		/*
		 * imprimir en orden 5 numeros de un arreglo
		 */
		Scanner entrada = new Scanner(System.in);
		
		int Nelementos;
		
		Nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de Elementos"));
		
		int [] numeros = new int[Nelementos];
		
		for ( int i =0 ; i<Nelementos ; i++) {
			System.out.println("Digite elemento"+(i+1));
			numeros [i] = entrada.nextInt();
		}
		
		System.out.println("Visualizando datos de su arreglos");
		
		for(int numeritos:numeros) {
			System.out.println(numeritos);
		}
	}
}
