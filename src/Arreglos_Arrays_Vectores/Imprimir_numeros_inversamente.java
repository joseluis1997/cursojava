package Arreglos_Arrays_Vectores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Imprimir_numeros_inversamente {
	public static void main(String []args) {
		/*
		 * leer 5 numeros, guardarlos en un arreglo
		 * y mostrarlo en el orden inverso al introducido
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
		
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}
}
