package app.main.principal;

import app.main.developments.OrderIntArrrays;

public class app {

	public static void main(String[] args) {
		int[] arrInt = {6,5,7,2,11,67,23,34};
		
		
		OrderIntArrrays or = new OrderIntArrrays(arrInt); 
		 
		
		or.printArray(); 
		System.out.println("\n--------START SYSTEM--------");
		
		System.out.println("\nTHE FIRST VALUES IS: " + or.first());
		System.out.println("\nTHE LAST VALUE IS: " + or.last());		
		System.out.println("***Encontrar la Posicion de 23***");
		System.out.println(or.findValue(23));
		System.out.println("Delete el value 5 del vector");
		or.delete(5);
		or.insert(89); 		
		or.printArray();
 		
		System.out.println("--------END SYSTEM--------");

	}

}
