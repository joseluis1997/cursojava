package condicionales;

import javax.swing.JOptionPane;



public class cajero_automatico {
	public static void main(String...args) {
		
		int saldo=1000, ingresar,retirar;
		char operacion;
		
		operacion = JOptionPane.showInputDialog(null, "Elija una opcion\n 'S o s'=consultar saldo\n "
				+ "'R o r'=Retirar Dinero\n 'I o i'=Ingresar dinero\n 'E o e'=salir").charAt(0);
		switch(operacion){
			case 'S':
			case 's':
				JOptionPane.showMessageDialog(null, "Su saldo Actual es::"+saldo);
				break;
			case 'R':
			case 'r':
				retirar =Integer.parseInt(JOptionPane.showInputDialog("Su saldo actual es"+saldo
						+"Digite el monto que desea retirar"));
				if(retirar <=saldo) {
					saldo=saldo-retirar;
					JOptionPane.showMessageDialog(null, "Retirando $"+retirar+"saldo restante:"+saldo);
				}
				else {
					JOptionPane.showMessageDialog(null, "No cuenta con saldo suficiente");
				}
				break;
			case 'I':
			case 'i':
				ingresar = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a ingresar a su cuenta"));
				saldo = saldo+ingresar;
				JOptionPane.showMessageDialog(null, "Su saldo Actual es:"+saldo);
				break;
			case 'E':
			case 'e':
			break;
			default:JOptionPane.showMessageDialog(null, "Opcion invalida");break;
				
		}
	}
}
