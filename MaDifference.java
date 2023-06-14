package Problem;

import java.util.*;


public class MaDifference {
		
		
   public static int solve(int array[], int n,
                int k)
   {
       // first we need to sort the given array
	   	Arrays.sort(array);


	   	int sum = 0, sum1 = 0, sum2 = 0;

	   	// finding out the sum of array 
	   	for (int i = 0; i < n; i++) {
	   		sum += array[i];
}

         // finding the sum of first k elements that chef wants to give to his son
	   		for (int i = 0; i < k; i++) 
	   		{
	   			sum1 += array[i];
	   		}
	   		
	   	// finding the sum of (n-k) elements
	   		for (int i = k; i < n; i++) 
	   		{
	   			sum2 += array[i];
	   		}

        // Returning the maximum possible difference.
	   		return Math.max(Math.abs(sum1 - (sum - sum1)),
               Math.abs(sum2 - (sum - sum2)));
}


   	public static void main(String[] args)
   	{
	
	
//	Scanner sc = new Scanner(System.in);
//	int []array = new int[100];
	
   		// Test Case 1
   		int k = 2;
   		int array[] = { 8, 4,5,2,10 };
   		
   		
   // Test case 2		
//  int k = 3;
//	int array[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
	
	// calculating the number of elements in the array
	int n = array.length;

	// calling the solve function
		System.out.print(solve(array, n, k));
     
   	}



}

