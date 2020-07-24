package ciclos;

import javax.swing.JOptionPane;

public class clase_20 {
	public static void main(String...args) {
		/*
		 * dadas las edades y las alturas de 5 alumnos, mostrar la edad y la
		 * estatura media, la cantidad de alumnos mayores a 18 y la cantodad de 
		 * alumnos que miden mas de 1,75cm
		 */
		
		int edad,contM18=0,contA175=0;
		float altura,mediaE=0,mediaA=0,sumaE=0,sumaA=0;
		
		for(int i=1 ; i<=5 ; i++) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del almno "+i));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura del alumno "+i));
			
			if(edad>18) {
				contM18++;
				sumaE=sumaE+edad;
			}
			if(altura>1.75) {
				contA175++;
				sumaA=sumaA+altura;
			}
			mediaE=(float)sumaE/contM18;
			mediaA= (float)sumaA/contA175;
		}
	System.out.println("la edad media de los alumnos es "+ mediaE);
	System.out.println("la altura media de los alumnos es "+mediaA);
	System.out.println("hay "+contM18+" almunos mayores a 18");
	System.out.println("Hay "+contA175+ " que miden mas de 1,75");
	}
}
