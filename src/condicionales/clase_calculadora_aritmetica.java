package condicionales;

import javax.swing.JOptionPane;

public class clase_calculadora_aritmetica {
	/* construir un programa que simule el funcionamiento de una calculadora que puede
	 *realizar las 4 operaciones aritmeticas basicas(suma,resta,producto, divicion)
	 *con valores numericos enteros. el usuario debe especificar la operacion con el primer caracter
	 *del primer parametro de la linea de comandos:S o s para la suma, R o r para la resta, P p M m
	 *para la multipliacion,y D o d para la divicion. 
	*/
	public static void main(String...args) {
		int Dato1,Dato2,suma,resta,multiplicacion,division;
		char operacion;
		
		Dato1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero1"));
		Dato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero2"));
		
		operacion = JOptionPane.showInputDialog("Elija Operacion\n S=suma\n R=resta\n M o P=Multiplicacion3\n D=divicion").charAt(0);
		
		switch(operacion){
			case 'S':
			case 's':suma=Dato1+Dato2;
				JOptionPane.showMessageDialog(null, "La suma es::"+suma);
				break;
			case 'R':
			case 'r':resta=Dato1-Dato2;
				JOptionPane.showMessageDialog(null, "La resta es::"+resta);
				break;
			case 'P':
			case 'p':
			case 'M':
			case 'm':multiplicacion=Dato1*Dato2;
				JOptionPane.showMessageDialog(null, "La multipliacion es ::"+multiplicacion);
				break;
			case 'D':
			case 'd':division=Dato1/Dato2;
				JOptionPane.showMessageDialog(null, "La divicion es::"+division);
				break;
			default: JOptionPane.showMessageDialog(null, "Valores no Validos");
			break;
				
		}
	}
}
