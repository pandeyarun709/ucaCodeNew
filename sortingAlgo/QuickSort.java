package sortingAlgo;

import java.util.Scanner;

public class QuickSort {
	 public static void swap(int []a, int i ,int j)
	    {
	        int t= a[i];
	        a[i] = a[j];
	        a[j] = t;
	    }
	    public static void quickSort(int []a , int i , int n)
	    {
	 
	        if(i<n)
	        { 
	            int pivot = i;
	            int k=i;
	            int j;
	            for(j=i;j<=n;j++)
	            {
	                if(a[j] < a[pivot])
	                  swap(a, j ,++k );
	            }
	            
	            swap(a, k , pivot);
	            
	            quickSort(a ,i , k-1);
	            quickSort(a , k+1 , n);
	        }
	    }
	    
	    public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			
			while(t-- != 0)
			{
			    int n = sc.nextInt();
			    int arr[] = new int[n];
			    
			    for(int i=0; i<n;i++)
			       arr[i] = sc.nextInt();
			       
			      quickSort(arr,0,n-1); 
			      
			      for(int i =0;i<n;i++)
			        System.out.print(arr[i] + " ");
			    
			}
		}

}
