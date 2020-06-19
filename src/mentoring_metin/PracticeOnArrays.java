package mentoring_metin;

import java.util.*;

public class PracticeOnArrays {
	public static void main(String[] args) {

//		String[] names = new String[2];

		String[] names = { "Ali", "Hatice", "Hasan", "Ayse", "Osman", "Fatma" };
		System.out.println("There are " + names.length + " names in the names array");

//		1st options:
		System.out.println();

		System.out.println(Arrays.toString(names));

		System.out.println();
//		2nd option:
		String names2 = "";
		for (String n : names) {
			names2 += n + ", ";
//			System.out.print(n + ", ");
		}
		System.out.println("forEachLoop and BEFORE substringMethod: " + names2);
		System.out.println("forEachLoop and AFTER substringMethod: " + names2.substring(0, names2.length() - 2));

		System.out.println();
//		for loop
		String names3 = "";
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) {
				names3 += names[i];
			} else {
				names3 += names[i] + ", ";
			}

		}
		System.out.println("For and If: " + names3);

//		System.out.print("forLoop and BEFORE substringMethod: \" +  " + names3);
//		System.out.println();
//		System.out.print("forLoop and AFTER substringMethod: \" +  " + names3.substring(0, names3.length()-2));

		System.out.println();
		for (int i = 0; i < names.length - 2; i = i + 2) {
			System.out.println(names[i] + " " + names[i + 2]);
//			{"Ali", "Ayse", "Hasan", "Hatice", "Osman","Fatma"};  // names[0] names[2] =>> Ali    Hasan
//																	 names [2] names[4]=>> Hasan  Osman
		}

		System.out.println();
		for (int i = 0; i < names.length; i = i + 2) {
			System.out.print(names[i] + " ");

		}

		System.out.println();
		for (int i = 0; i < names.length; i = i + 2) {
			System.out.print(names[i + 1] + " ");
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < names.length - 1; i = i + 2) {
			System.out.println(names[i] + " " + names[i + 1]);
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < names.length - 1; i = i + 2) {
			System.out.println(names[i + 1] + " " + names[i]);
		}

		System.out.println();

//		print one random name from this array
//		use random class

		Random input = new Random();

		int idx = input.nextInt(names.length);
		System.out.println(names[idx]);

		System.out.println();

		
		
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
//		String[] names = { "Ali", "Ayse", "Hasan", "Hatice", "Osman", "Fatma" };
		String[] namesUpto4Arr = new String[count];
//		String namesUpto4 = "";
		int k = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				namesUpto4Arr[k] = names[i];
				k++;
			} else {
				continue;
			}
		}
		System.out.println(Arrays.deepToString(namesUpto4Arr));

	}

}
