package self_study;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		// sum up the entered numbers forever the entered numbers are positive.
	
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int nextNum = scan.nextInt();
		
		while(nextNum > 0){
			
			total = total + nextNum;
			System.out.println("Enter a positive integer: ");
			nextNum = scan.nextInt();
			
			
		}
		System.out.println("Total: " + total);
	}

}
