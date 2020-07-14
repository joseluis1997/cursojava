package condicionales;

import javax.swing.JOptionPane;

public class clase_6_ordenar_3_numeros_de_mayor_a_menor {
	
	public static void main(String...args) {
		int n1,n2,n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero uno"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero dos"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero tres"));
		
		if((n1>n2) && (n2>n3)) {
			JOptionPane.showMessageDialog(null,"Orden"+n1+"-"+n2+"-"+n3);//321
		}
		else if((n1>n3)&&(n3>n2)) {
			JOptionPane.showMessageDialog(null, "Orden"+n1+"-"+n3+"-"+n2);//312
		}
		else if ((n2>n1)&&(n1>n3)) {
			JOptionPane.showMessageDialog(null, "Orden"+n2+"-"+n1+"-"+n3);//291
		}
		else if((n2>n3)&&(n3>n1)) {
			JOptionPane.showMessageDialog(null, "Orden"+n2+"-"+n3+"-"+n1);//192
		}
		else if((n3>n1)&&(n1>n2)) {
			JOptionPane.showMessageDialog(null, "Orden"+n3+"-"+n1+"-"+n2);//8620
		}
		else {
			JOptionPane.showMessageDialog(null, "Orden"+n3+"-"+n2+"-"+n1);//6820
		}
		
	}

}
