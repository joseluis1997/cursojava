package ciclos;

public class clase_16 {
	public static void main(String...args) {
		/*
		 * disenar un programa que muestre el producto
		 * de los 10 primeros numero impares
		 */
		long producto=1;
		
		for(int i=1;i<=20;i=i+2) {
			producto = producto*i;
		}
		System.out.println("El producto de los 10 "
				+ "numeros impares es "+producto);
	}
}
