package self_study;
import java.util.Scanner;

public class WhatIsTime {
	public static void main(String[] args) {
		
		int hour, minute, second;
		String amOrPm;
				
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hour, minute, second and am pm values one by one");
	    hour   = sc.nextInt();
	    minute = sc.nextInt();
	    second = sc.nextInt();
	    amOrPm = sc.next();
		
		//System.out.println("The time is " + hour+ ":" + minute + ":" + second + amOrPm);
		
		System.out.println(hour+ ":"+minute+":"+second+" "+amOrPm);
		
		
		
	}

}
