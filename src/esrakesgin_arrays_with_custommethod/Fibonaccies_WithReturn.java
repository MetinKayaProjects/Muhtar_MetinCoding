package esrakesgin_arrays_with_custommethod;

public class Fibonaccies_WithReturn {


	// QUESTION : find first  10 items in Fibonacci series starting from 0
   //           : find the total of 10 numbers 
	
	public static void main(String[] args) {
		
		System.out.println(Fibonaccies(0,1,5));
			
		
	}
	
	
//    0     1      1      2      3     5     8     13    21     34    55   89 144 
//    e1   e2     sum
//  	   e1     e2     sum
          
	public static String Fibonaccies (int e1, int e2, int n) {   //return type String since we print out String +int
		 int sum =0; 
		 System.out.println("First "+ n + " elements: ");
		 for (int i=0; i<=n; i++) {
			 System.out.print(e1+" ");
			 sum=e1+e2;
			 e1=e2;
			 e2=sum;
			
		 }
		 System.out.println();// empty line 
		return "sum: " + sum;    //String + int
	}

	
	
	
	
	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
