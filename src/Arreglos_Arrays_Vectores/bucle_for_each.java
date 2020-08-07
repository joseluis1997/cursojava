package Arreglos_Arrays_Vectores;

public class bucle_for_each {
	public static void main(String []args) {
		/*
		 * utilizando el bucle for each, y el metodo lenght
		 */
		
		String [] nombres = {"jose","lucho","lourdes","humberto","ubaldino","kevin"};
		for(int i=0 ; i<nombres.length ; i++) {//con el metodo length
			System.out.println("te llamas:::"+ nombres[i]);
		}
		
		///for each
		
		for(String nombresitos:nombres) {
			System.out.println("oye:"+nombresitos);
		}
	}

}
