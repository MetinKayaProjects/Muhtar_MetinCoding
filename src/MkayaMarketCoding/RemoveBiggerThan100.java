package MkayaMarketCoding;
import java.util.*;

public class RemoveBiggerThan100 {
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
		
		//remove the mums bigger than 100
		
		//1st way
		
		for(int i = 0; i<myList.size(); i++) {
			if(myList.get(i) > 100 || myList.get(i) < 1) {
				myList.remove(i);
				i--;
			}
		}
		System.out.println(myList);

		//2nd way
		//lambda expression ile
		myList.removeIf(each -> each > 100);
		System.out.println(myList);

		//sort the list
		myList.sort(null);
		System.out.println(myList);
		
		//sort and remove dublicated nums
		
		SortedSet<Integer> sortedMyListIntegers = new TreeSet<>(myList);
		
		System.out.println("sorted My List: " + sortedMyListIntegers);
	}

}
