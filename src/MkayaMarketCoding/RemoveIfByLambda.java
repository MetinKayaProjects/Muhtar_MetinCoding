package MkayaMarketCoding;

import java.util.*;

public class RemoveIfByLambda {
	/*
	 * Given a list of people’s names “Ahmed”,”John”,”Eric” , 
	 * write a  java operation to remove all the names named “Ahmed”
	 */

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		//names = Arrays.asList("Ahmed", "John", "Eric");
		//System.out.println(names);
		
		names.addAll(Arrays.asList("Ahmed", "John", "Eric"));
		System.out.println(names);
		
		//or
		//List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric"));
		
		names.removeIf(each -> each.equalsIgnoreCase("Ahmed"));
		
		System.out.println(names);
		
		
	}
}
