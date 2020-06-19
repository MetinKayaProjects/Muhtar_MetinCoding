package esrakesgin_arrays_with_custommethod;

import java.util.Scanner;

public class Repl_Fibonacci_Numbers_NoReturns {
	//Complete a method fib() that will compute Fibonacci numbers
	//In fibonacci series, next number is the sum of previous two numbers 
	//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1.
	//Given a number num, print n-th Fibonacci Number.

	//Input  : 2
	//Output : 1

	//Input  : 9
	//Output : 21



		 

	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
			  
			    int fibo[]=new int [num+1]; // Index number starts from 0 in Arrays, thats why we need to add 1 on length
			
			    fibo[0] = 0 ;
			    fibo[1] = 1; 
			  
			    // Initialize result 
			    int sum = fibo[0] + fibo[1];
			  
			    // Add remaining terms 
			    for (int i=2; i<num; i++) 
			    { 
			        fibo[i] = fibo[i-1]+fibo[i-2]; 
			        sum = fibo[i]; 
			    } 
			  System.out.println(sum);
			    
			} 
			
	}


