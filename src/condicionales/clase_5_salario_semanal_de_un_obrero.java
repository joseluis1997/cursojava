package condicionales;

import javax.swing.JOptionPane;

public class clase_5_salario_semanal_de_un_obrero {
	public static void main(String...args) {
		/* clase 5, ejercicio
		 * Un obrero necesita calcular su salario semanal,el cual se obtiene de la sgt manera:
		 * si trabaja 40 horas o menos se le paga $16 por hora
		 * si trabaja mas de 40 horas se le paga $16 por cada una  de las primeras
		 * 40 horas y $20 por cada hora extra.
		 */
		
		float hora, salarioSemanal;
		
		hora= Integer.parseInt(JOptionPane.showInputDialog("Digite Total horas trabajadas"));
		
		if(hora<=40) {
			salarioSemanal=hora*16;
//			JOptionPane.showMessageDialog(null,"Su Sueldo semanal es :"+salarioSemanal);
		}else {
			salarioSemanal= ((40*16)+((hora-40)*20));
//			JOptionPane.showMessageDialog(null,"Su Sueldo semanal es mas Extra es :"+salarioSemanal);
		}
		JOptionPane.showMessageDialog(null,"Su Sueldo semanal es mas Extra es :"+salarioSemanal);
	}
}