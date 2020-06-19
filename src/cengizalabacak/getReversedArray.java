package cengizalabacak;

import java.util.Arrays;

public class getReversedArray {
	public static void main(String[] args) {
		int[] arr = {221, 34,2,98};
		System.out.println("Nums: " + Arrays.toString(arr));
		System.out.println("NumsReversed: " + Arrays.toString(getReversedArray(arr)));
		
		

		
	}
	public static int[] getReversedArray(int[] nums) {

		int temp;

		for (int i = 0; i < nums.length / 2; i++) { // dont forget to divide by two;
			temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}
		return nums;
	}
}
