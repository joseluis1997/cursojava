package ciclos;

import javax.swing.JOptionPane;

public class clase_27 {
	public static void main(String...args) {
		/*
		 * pedir 5 calificaciones, y decir si hay algun alguno suspenso
		 */
		
		float calificaciones;
		boolean suspenso=false;
		
		for( int i=1 ; i<=5 ; i++) {
			do {
				calificaciones =Float.parseFloat(JOptionPane.showInputDialog("Digite 5 calificaciones entre 0-10"));
			}while(calificaciones<0 || calificaciones>10);
			
			if(calificaciones<3) {
				suspenso=true;
			}
			if(suspenso==true) {
				System.out.println("almenos hay un alumno suspenso");
			}else {
				System.out.println("No hay alumnos suspensos");
			}
		}
		
		
	}
}
