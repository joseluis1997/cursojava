package condicionales;

import javax.swing.JOptionPane;

public class Determinar_fecha_correcta {
	public static void main(String...args) {
		int dia, mes, ano;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite el ano"));
		
		if((dia>=1) &&(dia<=30)) {
			if((mes>=1)&& (mes<=12)) {
				if((ano!=0)) {
					JOptionPane.showMessageDialog(null, "Fecha correcta ::"+dia+"/"+mes+"/"+ano);
				}else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecta,ano incorrecto");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
		}
	}
}
