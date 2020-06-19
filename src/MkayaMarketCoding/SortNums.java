package MkayaMarketCoding;

import java.util.*;

public class SortNums {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();		
//		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,9,10,11));
		myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,9,10,11));
		
		
		myList.add(0);
		myList.add(1);
		myList.add(5);
		myList.add(115);
		myList.add(50);
		myList.add(53);
		myList.add(25);
		myList.add(500);
		myList.add(105);
		
		System.out.println(myList);
		
		//sort-1
		myList.sort(null);
		System.out.println("sorted myList: " + myList);
		
		//remove the dublication
		
		SortedSet<Integer> sortedMyListIntegers = new TreeSet<>(myList);
		
		System.out.println("sorted unique My List: " + sortedMyListIntegers);
		
		
		Set<Integer> sorted2 = new HashSet<Integer>(myList);
		System.out.println("sorted2: "+ sorted2);
		
	}

}
