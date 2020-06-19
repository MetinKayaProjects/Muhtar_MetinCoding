package self_study;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		// sum up the entered numbers forever the entered numbers are positive.
		
		Scanner scan = new Scanner(System.in);
		int nextNum = 0;
		int total = 0;
		
		do {
			System.out.println("Enter positive integers :");
			nextNum = scan.nextInt();
			total = total + nextNum;
			
		}while(nextNum > 0);
		
		System.out.println("Total of positive numbers; " + total);
		
		//NOTICE : THE TOTAL IS NOT CORRECT BY DO WHILE SINCE IT IS FIRTS RUNNUNG AND THEN CHECKING THE CONDITION.
		
		
	}

}
