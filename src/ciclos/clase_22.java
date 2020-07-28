package ciclos;

import javax.swing.JOptionPane;

public class clase_22 {
	public static void main(String...args) {
		/*
		 * una empresa que se dedica a la venta de desinfectantes necesita 
		 * un programa para gestionar las factuaras, en cada factura figura el codigo del articulo
		 * la cantidad vendida en litros y el precio por litro, se pide 5 facturas introducidas
		 * facturacion total,cantidad en litros vendidos del articulo 1 y cuantas facturas
		 * se emitiron de mas de $600
		 */
		int codigo;
		float cantidadL, precioL, importeF=0,facturacionT=0, cantidadLA=0, conta=0;
		
		for (int i = 1 ; i <= 5 ;i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo Del Producto "+i));
			cantidadL = Float.parseFloat(JOptionPane.showInputDialog("Digite Cantidad de Litros a comprar"));
			precioL = Float.parseFloat(JOptionPane.showInputDialog("Digite el Precio X Litro"));
			
			importeF = cantidadL*precioL;
			
			facturacionT= facturacionT+importeF;
			
			if ( codigo == 1) {
				cantidadLA=cantidadLA+cantidadL;
			}
			
			if ( importeF >= 600) {
				conta++;
			}
			
		}
		
		System.out.println("Resumen de Todo");
		System.out.println("Facturacion Total es "+ facturacionT);
		System.out.println("Cantidad de Litro Vendidos del Articulo 1 es "+cantidadLA);
		System.out.println("Facturas con mas de $600 de importe "+conta);
	}
}
