package ciclos;

import javax.swing.JOptionPane;

public class clase_24 {
	public static void main(String...args) {
		/*
		 * dadas 6 notas , escribit la cantidad de alumnos
		 * aprobados, condicionados(04) y suspensos =? rango de nota de 0-10
		 */
		int nota,aprobados=0,condicionados=0,suspensos=0;
		
		for(int i = 1 ; i <= 6 ; i++) {
			do {
				nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del Alumno "+i));
			}while(nota<0 || nota >10);
			
			if(nota==4) {
				condicionados++;
			}
			else if(nota==5) {
				aprobados++;
			}
			else {
				suspensos++;
			}
			
		}
		
		System.out.println("Hay "+ aprobados+ " alumnos que han aprobado");
		System.out.println("Hay "+ condicionados + " Alumnos condicionados");
		System.out.println("Hay " + suspensos + " Alumnos supensos o reprobados");
	}
}
