package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_clase_3 {
	public static void main(String...args) {
		/* ejercicio
		 * pedir dos numeros enteros y decir cual es el mayor o si son iguales
		 */
		
		int num1,num2;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));
		
//		Math.max(num1, num2)// esto igual saca el numero maximo
		
		if(num1>num2) {JOptionPane.showMessageDialog(null, "el numero mayor es:: "+num1);}
		if(num2>num1){JOptionPane.showMessageDialog(null, "el numero mayor es:: "+num2);}
		if(num1==num2){JOptionPane.showMessageDialog(null, "los numeros son iguales");}
	}
}
