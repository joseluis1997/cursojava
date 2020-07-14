package condicionales;

import javax.swing.JOptionPane;

public class fecha_correcta_sin_anos_bisiestos {
	public static void main(String...args) {
		/*
		 * ejercicio: pedir el dia el mes y el a?o de una fecha  eh indicar si la fecha es correcta
		 * con meses de 28, 30, 31 dias sin a?nos bisiestos
		 * NOTE: cualquier a?o divisible por 4 es visiestros o su residuo sea cero->es a?o bisiesto
		 * execto si es divisible por 100 ej 1900
		 * los a?os divisibles por 100 solo pueden ser a?os bisiestos si son divisibles
		 * tambien por 400 ej 1200
		 */
		
		int dia, mes, ano;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite el ano"));
		
		if((dia>=1)&&((dia<=28)||(dia<=30)||(dia<=31))) {
			if((mes>=1)&& (mes<=12)) {
				if((ano!=0)&&((ano%4)!=0)||(((ano%100)!=0)&&((ano%400)!=0))) {
					JOptionPane.showMessageDialog(null, "Fecha correcta ::"+dia+"/"+mes+"/"+ano);
				}else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecta,ano incorrecto, no se aceptan a;os bisiestos");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
		}
	}

}
