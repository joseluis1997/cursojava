package URI;

import java.util.Scanner;
public class Billetes_y_monedas {
	public static void main(String []args) {
		int cien = 0,cincuenta = 0,vente= 0,diez= 0,cinco= 0,dos= 0,m1=0,m2=0,m3=0,m4=0,m5=0,m6=0;
		float n;
		Scanner dato = new Scanner(System.in);
		n = dato.nextFloat();
		if(n>=100) {
			do {
				cien++;
				n=n-100;
			}while(n>=100);
		}
		
		if(n>=50 && n<100) {
			do {
				cincuenta++;
				n=n-50;
			}while(n>=50 && n<100);

		}
		if(n>=20 && n<50) {
			do {
				vente++;
				n=n-20;
			}while(n>=20 && n<50);
		}
		
		if(n>=10 && n<20) {
			do {
				diez++;
				n=n-10;
			}while(n>=10 && n<20);
		}
		if(n>=5 && n<10) {
			do {
				cinco++;
				n=n-5;
			}while(n>=5 && n<10);
		}
		if(n>=2 && n<5) {
			do {
				dos++;
				n=n-2;
			}while(n>=2 && n<5);
		}
		
		if(n>=1 && n<2) {
			do {
				m1++;
				n=n-1;
			}while(n>=1 && n<2);
		}
		
		if(n>=0.50 && n<1) {
			do {
				m2++;
				n=(float) (n-0.50);
			}while(n>=0.50 && n<1);
		}
		
		if(n>=0.25 && n<0.50) {
			do {
				m3++;
				n=(float) (n-0.25);
			}while(n>=0.25 && n<0.50);
		}
		if(n>=0.10 && n<0.25) {
			do {
				m4++;
				n=(float) (n-0.10);
			}while(n>=0.10 && n<0.25);
		}
		if(n>=0.05 && n<0.10) {
			do {
				m5++;
				n=(float) (n-0.05);
			}while(n>=0.05 && n<0.10);
		}
		
		if(n>0.001 && n<0.05) {
			do {
				n=(float) (n-0.01);
				m6++;
			}while(n>0.001 && n<0.05);
		}

		System.out.println("NOTAS:");
		System.out.println(cien +" nota(s) de R$ 100.00");
		System.out.println(cincuenta +" nota(s) de R$ 50.00");
		System.out.println(vente +" nota(s) de R$ 20.00");
		System.out.println(diez +" nota(s) de R$ 10.00");
		System.out.println(cinco +" nota(s) de R$ 5.00");
		System.out.println(dos +" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(m1 +" moeda(s) de R$ 1.00");
		System.out.println(m2 +" moeda(s) de R$ 0.50");
		System.out.println(m3 +" moeda(s) de R$ 0.25");
		System.out.println(m4 +" moeda(s) de R$ 0.10");
		System.out.println(m5 +" moeda(s) de R$ 0.05");
		System.out.println(m6 +" moeda(s) de R$ 0.01");

	}
}
