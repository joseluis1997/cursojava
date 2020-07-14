package condicionales;

import javax.swing.JOptionPane;

public class kg_A_otra_unidad_De_medida {
	public static void main(String...args) {
		/*
		 * hacer un programa que pase de kg a otra unidad
		 * de medida de masa,mostrar un menu de opciones en pantalla
		 */
		double kilogramo,gramos=1000,miligramos=1000000,decagramos=100,toneladas=1000;
		char operacion;
		
		operacion = JOptionPane.showInputDialog("elija la opcion a covertir de kg a::\n"
				+ "G o g=Gramos\n M o m= Miligramos\n D o d = Decagramos\n T o t = Toneladas\n S o s= Salir").charAt(0);
		switch(operacion){
			case 'G':
			case 'g':
				kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantida de kilogramos a convertir a gramos"));
				gramos=gramos*kilogramo;
				JOptionPane.showMessageDialog(null, kilogramo+"kg"+" es igual a "+ gramos+"Gramos");
				break;
			case 'M':
			case 'm':
				kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantida de kilogramos a convertir a Miligramos"));
				miligramos=gramos*miligramos;
				JOptionPane.showMessageDialog(null, kilogramo+"kg"+" es igual a "+ miligramos);
				break;
			case 'D':
			case 'd':
				kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantida de kilogramos a convertir a Decagramos"));
				decagramos=decagramos*kilogramo;
				JOptionPane.showMessageDialog(null, kilogramo+"kg"+" es igual a "+ decagramos+"decagramos");
				break;
			case 'T':
			case 't':
				kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantida de kilogramos a convertir a Toneladas"));
				toneladas=toneladas/kilogramo;
				JOptionPane.showMessageDialog(null, kilogramo+"kg"+" es igual a "+ toneladas+"Toneladas");
				break;
			case 'S':
			case 's':
				JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
				break;
			default:JOptionPane.showMessageDialog(null, "Error al introducir el dato");
				break;
				
		}
	}
}
