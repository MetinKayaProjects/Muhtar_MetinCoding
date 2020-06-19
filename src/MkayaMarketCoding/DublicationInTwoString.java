package MkayaMarketCoding;

import java.util.HashMap;
import java.util.Map;

public class DublicationInTwoString {
	
	public static void numOfDubl(String str1, String str2) {

//		"Write a method which takes two strings as inputs, "
//		"and it should return the output as intersection of words between 
//		the two inputs along with their total count.
		
		String str = str1 + " " + str2;
		System.out.println("New String: " + str);
		
		String [] strArr = str.split(" ");
		for (String s : strArr) {
			System.out.println(s);
		}
		
		Map<String, Integer> wordsMap = new HashMap<>();

		for (int i = 0; i < strArr.length; i++) {
			if (!wordsMap.containsKey(strArr[i])) {
				wordsMap.put(strArr[i], 1);
			}else {
				wordsMap.put(strArr[i], wordsMap.get(strArr[i])+1);
			}
			
		}System.out.println(wordsMap);
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "I am happy and why not";
		String str2 = "why are you not happy and you should be";
		numOfDubl(str1, str2);
	}

}
