package esrakesgin_arrays_with_custommethod;

import java.util.Arrays;

public class Merging_Arrays {
	/*/

	 * QUESTION: Merge two int type arrays and return merged  int array 
	 * Instruction
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
* create a length int for the combined length of both arrays.
* create an array with that length (thats the array we will return).
* create an iterator for both arrays (int z=0).
* 
* 
* loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
* then increment the iterator for both arrays (z++).
* 
* 
* do the same for the second array.

	 */
	public static int[] mergR(int[] a,int[] b) {
	    int [] merge = new int [a.length + b.length]; 
				int z = 0; 
				    for (int i = 0; i < a.length; i++) {
					   merge[i] = a[i]; 
					   z++; 
				    }
				   for (int j = 0; j < b.length; j++) {
					  merge[z] = b[j];  
					      z++;
				}
				    
				   return merge;
		
				    
	    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  
		  int [] nums_a= {1,2,3,89, 90};
		  int [] nums_b= {4,5};
		
		System.out.println(Arrays.toString(mergR(nums_a, nums_b)));
		  
	
		   
		   
		   
		   
	  }
	

}
