package self_study;

import java.util.Scanner;

public class ShoppingListForLoop {
	public static void main(String[] args) {
		/*
		 * Your program should ask use to enter items followed by its price. After
		 * adding item, ask user if he wants to add one more item. If so, repeat
		 * previous steps again. If no, print shopping list report and total price as
		 * show in examples. Your program should accept up to 10 items.
		 * 
		 * Hint: use do while loop.
		 */

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		
		
		for(count =1; count <=10 && (countinue.equalsIgnoreCase("yes")); count++) {
			System.out.println("Enter Item" +count+ " and its price: ");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			
			System.out.println("Add one more item?");
			countinue = scan.next();
			System.out.println("Enter Item" +count+ " and its price: ");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			shoppingListReport += "Item" + count +": "+ item + " Price: " + price + ", ";
			
				
			}
		shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length());
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice );
	}	
		}

//		output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//		output: Total price: 15.3
		
	/*	do {
			System.out.println("Enter Item" +count+ " and its price: ");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			shoppingListReport += "Item" + count +": "+ item + " Price: " + price + ", ";
			
			System.out.println("Add one more item?");
			countinue = scan.next();
			count++;
//						
			
			
		} while (count <= 10 && countinue.equalsIgnoreCase("yes") );
		
		shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length()-2);
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice );
		*/
		
		
//		
//	}
//
//}
