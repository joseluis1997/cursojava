package ciclos;

import javax.swing.JOptionPane;

public class clase_23 {
	public static void main(String...args) {
		/*
		 * hacer unas modificaciones al ejercicio anterior suponiendo que
		 * no se introduce el precio por litro, solo existen
		 *  tres productos con 3 precios /// 0.6$, 3$, 1.25$
		 */
		int codigo;
		float cantidadL,f1=0,f2=0,f3=0,c1=0,c2=0,c3=0,FaM600=0,FT=0;
		
		for (int i = 1 ; i <= 3 ;i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo Del Producto "+i));
			cantidadL = Float.parseFloat(JOptionPane.showInputDialog("Digite Cantidad de Litros a comprar"));			
						
			if ( codigo == 1) {
				c1 = c1 + cantidadL;
				f1 = (float)(cantidadL*0.6);
				System.out.println(f1);
			}
			
			else if ( codigo == 2) {
				c2 = c2 +cantidadL;
				f2 = (float)(cantidadL*3);
			}
			else if ( codigo == 3) {
				c3 = c3 +cantidadL;
				f3 = (float) (cantidadL*1.25);
			}			 
			if( f1>600 || f2>600 || f3>600) {
				FaM600++;
			}
			FT = f1+f2+f3;
		}
		System.out.println("Resumen de Todo");
		System.out.println("Facturacion Total es "+FT);
		System.out.println("Cantidad de Litro Vendidos del Articulo 1 es "+c1);
		System.out.println("Cantidad de Litro Vendidos del Articulo 2 es "+c2);
		System.out.println("Cantidad de Litro Vendidos del Articulo 3 es "+c3);
		System.out.println("Facturas con mas de $600 de importe "+FaM600);
	}
}
