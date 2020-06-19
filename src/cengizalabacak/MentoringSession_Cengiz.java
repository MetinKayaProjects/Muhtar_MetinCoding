package cengizalabacak;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MentoringSession_Cengiz {
	public static void main(String[] args) {
		
		String str []= {"apple", "orange","banana", "pear"};
		int [] nums= new int[] {1,100,4,6,81};
		
		//str= new String[5];
		System.out.println(str.length);
		System.out.println(str[3].length());
		
		String sentence="while I was going home I saw her";
		
		String [] str1= sentence.split(" " );
		System.out.println(str1);
		System.out.println(Arrays.toString(str1));
		
		System.out.println(str1.length);
		
		for(int i=str1.length-1; i>=0; i--) {
			System.out.print(str1[i]+", ");
		}
			for(String s: str1) {
				System.out.print(s);
			}
			System.out.println();
			System.out.println("====================");
			int sum=0;
			for(int i =0; i<nums.length; i++) {
				sum= sum+nums[i];	
			}System.out.println(sum/nums.length);
			
			
			
			
		
	}
}
