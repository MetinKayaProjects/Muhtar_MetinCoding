package Group1;

import java.util.Arrays;

public class oddAndEvenNums {
	public static void main(String[] args) {
		
		
		int[] nums = {1,2,3,10,4,5,6,9,10,15};
		//numsSorted (nums);
		sort(nums);
		
		
		
	}
	
	//there are even and odd numbers in an array. gather odd numbers at the left side and even numbers at the right side.
	//METHOD-1
	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]%2==1) {
					if(arr[j-1]%2==1) {
				      
				    	  int temp = arr[j];
							arr[j]= arr[j-1];
							arr[j-1]=temp;  
							
					}else {
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]=temp;
				}
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	//there are even and odd numbers in an array. gather odd numbers at the left side and even numbers at the right side.
		//METHOD-2
	 public static void numsSorted (int[] nums){

     	int[] numsSorted = new int[nums.length];
     	
     	int countEven = 0;
     	int countOdd = 0;

     	for(int i=0; i<nums.length; i++){
     	if(nums[i]%2==0){
     	countEven++;
     	} else {
				countOdd++;
			}
     	}
     	
     	int[] numsEven = new int[countEven];
     	int[] numsOdd = new int[countOdd];
     	countEven=0;
     	countOdd=0;
     	for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2 == 0) {
				numsEven[countEven] = nums[i];
				countEven++;
			}else {
				numsOdd[countOdd]=nums[i];
				countOdd++;
			}
		} 
     	//System.out.println(numsEven);
     	for (int i = 0; i < numsEven.length; i++) {
			numsSorted[i] = numsEven[i];
		}
     	for (int i = 0; i < numsOdd.length; i++) {
			numsSorted[i+countEven] = numsOdd[i];   //(numsEven.length)
		}
     	System.out.println(Arrays.toString(numsSorted));
     }

}
