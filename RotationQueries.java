// Java program to count 
// subarrays having sum 
// less than k. 
import java.io.*; 

class RotationQueries { 

	// Function to find number 
	// of subarrays having sum 
	// less than k. 
	static int sumArray(int arr[]){
		 int sum = 0; // initialize sum 
         int i; 
        
         // Iterate through all elements and add them to sum 
         for (i = 0; i < arr.length; i++) 
            sum +=  arr[i]; 
        
         return sum; 
	}

	static int countSubarray(int arr[], 
							int n, int k) 

	{
		int i = 0;
		int ans = 0;
		while(i < arr.length){


			int start = 0, end = 0; 
		int count = 0, sum = arr[0]; 


		while (start < n && end < n) { 

			
			if (sum < k) { 
				end++; 

				if (end >= start) 
					count += end - start; 
				if (end < n) 
					sum += arr[end]; 
			} 

			// If sum is greater than or 
			// equal to k, subtract 
			// ;rr[start] from sum and 
			// decrease sliding window by 
			// moving start by one position 
			else { 
				sum -= arr[start]; 
				start++; 
			} 
		} 

		ans = sum;

		arr[(i+ans)%arr.length] = k ^ ans;
		for(i = 0 ; i < arr.length ; i ++)
			System.out.println(arr[i]);
		i++;



		} 
		return sumArray(arr);
	} 



	// Driver Code 
	public static void main(String[] args) 
	{ 
		int array[] = { 1,2,3,2,3}; 
		int k = 5;
		int size = array.length; 
		int count = countSubarray(array, size, k); 
		System.out.println(count); 
	} 
} 

// This code is contributed by Sam007 
