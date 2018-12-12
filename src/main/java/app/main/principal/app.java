package app.main.principal;

import app.main.developments.OrderIntArrrays;

public class app {

	public static void main(String[] args) {
		int[] arrInt = {6,5,7,2,11,67,23};
		OrderIntArrrays or = new OrderIntArrrays(arrInt);
		System.out.println("\n--------START SYSTEM--------");
		or.printArray();
		System.out.println("\nTHE FIRST VALUES IS: " + or.first());
		System.out.println("\nTHE LAST VALUE IS: " + or.last());
		System.out.println("Find a Element Por Posicion" + or.find(11));
		System.out.println("Delete a Element Por Posicion" + or.delete(4));
		or.insert(15);
		System.out.println("Insertar 15 un Element Por Posicion" );
		
		or.printArray();
		
		
		System.out.println("--------END SYSTEM--------");

	}

}
