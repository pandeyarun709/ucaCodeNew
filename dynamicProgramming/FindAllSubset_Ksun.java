package dynamicProgramming;

import java.util.*;

public class FindAllSubset_Ksun {

	public static boolean dp[][];
	
	
	
	   static void display(ArrayList<Integer> v) 
	    { 
	       System.out.println(v); 
	    } 
	       
	    // A recursive function to print all subsets with the 
	    // help of dp[][]. Vector p[] stores current subset. 
	    static void printSubsetsRec(int arr[], int i, int sum,  
	                                         ArrayList<Integer> p) 
	    { 
	        // If we reached end and sum is non-zero. We print 
	        // p[] only if arr[0] is equal to sun OR dp[0][sum] 
	        // is true. 
	        if (i == 0 && sum != 0 && dp[0][sum]) 
	        { 
	            p.add(arr[i]); 
	            display(p); 
	            p.clear(); 
	            return; 
	        } 
	       
	        // If sum becomes 0 
	        if (i == 0 && sum == 0) 
	        { 
	            display(p); 
	            p.clear(); 
	            return; 
	        } 
	       
	        // If given sum can be achieved after ignoring 
	        // current element. 
	        if (dp[i-1][sum]) 
	        { 
	            // Create a new vector to store path 
	            ArrayList<Integer> b = new ArrayList<>(); 
	            b.addAll(p); 
	            printSubsetsRec(arr, i-1, sum, b); 
	        } 
	       
	        // If given sum can be achieved after considering 
	        // current element. 
	        if (sum >= arr[i] && dp[i-1][sum-arr[i]]) 
	        { 
	            p.add(arr[i]); 
	            printSubsetsRec(arr, i-1, sum-arr[i], p); 
	        } 
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	/***********************************************************************/

	public static void computeDP(int[] arr, int n, int sum) {
		
		dp = new boolean[n][sum+1];
		
		for(int i=0;i<n;i++)
		{
			dp[i][0] = true;
			
			
		}
		
		dp[0][arr[0]] = true;
		
		for(int i=1 ; i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(arr[i] > j)
				{
					dp[i][j] = dp[i-1][j];
				
				}else {
					
					dp[i][j] = (dp[i-1][j] || dp[i-1][j - arr[i]]);
				
				}
			}
		}
		
		 printSubsetsRec(arr, n-1,  sum,  new ArrayList<Integer>());
		
		
		
	}

	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5}; 
        int n = arr.length; 
        int sum = 10;
        
        computeDP(arr , n , sum);
        

	}


}
