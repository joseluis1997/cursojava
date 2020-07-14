package URI;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Billetes_y_monedas {
	public static void main(String...args) {
		double dato;
		double cien = 0,cincuenta = 0,vente= 0,diez= 0,cinco= 0,dos= 0;
		Scanner dato1 = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		dato = dato1.nextDouble();
		
		dato=dato/100;
		
		System.out.println("NOTAS:");
		System.out.println(dato +" nota(s) de R$ 100.00");
		System.out.println(cincuenta +" nota(s) de R$ 50.00");
		System.out.println(vente +" nota(s) de R$ 20.00");
		System.out.println(diez +" nota(s) de R$ 10.00");
		System.out.println(cinco +" nota(s) de R$ 5.00");
		System.out.println(dos +" nota(s) de R$ 50.00");

	}
}
