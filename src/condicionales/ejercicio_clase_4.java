package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_clase_4 {
	public static void main(String...args) {
		/*ejercicio extra de la clase 4 del bloque de condiciones
		 * En megaPlaza se hace un 20% de descuento a los clientes
		 * cuya compra supere los $300 
		 * cual sera la cantidad que pagara una persona por su compra
		 */
		float entrada,cantidadT;
		
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite total de la compra a cancelar"));
		
		if (entrada>300) {
			cantidadT= (entrada-(entrada*0.20f));
			JOptionPane.showMessageDialog(null,"Total a cancelar mas su "
					+ "descuento del 20% es :"+ cantidadT);
		}else {
			JOptionPane.showMessageDialog(null, "Total a pagar es de :"+ entrada);
		}
	}

}
