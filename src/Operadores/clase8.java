package Operadores;

import java.util.Scanner;

public class clase8 {
	private static Scanner entrada;
	public static void main (String...args) {
		//clase 8 operadores aritmeticos
	    entrada = new Scanner(System.in);
		float num1,num2,suma,resta,multi,div,resto;
		System.out.println("digite 2 numeros");
		num1=entrada.nextFloat();
		num2=entrada.nextFloat();
		
		suma=num1+num2;
		resta=num1-num2;
		multi=num1*num2;
		div=num1/num2;
		resto=num1%num2;
		
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es: "+resta);
		System.out.println("la multiplicacion es: "+multi);
		System.out.println("la divicion es: "+div);
		System.out.println("el resto es: "+resto);
	}

}
