package interviewBit.Array;

public class FirstMissingPositive {
	
	/**
	 * @input A : Integer array
	 * @input n1 : Integer array's ( A ) length
	 * 
	 * @Output Integer
	 */
	public static void swap(int []a , int i , int j)
	 {
	     int t =a[i];
	     a[i] = a[j];
	      a[j] = t;
	 }
	 
	 public static int arrangePositive(int []arr ,int n)
	 { 
		 //separate all +ve at one side from array
	     int i=0,j=0;
	     
	     while(j<n)
	     {
	         if(arr[i] >=0)
	         {
	             i++;
	         }
	         else if(arr[j] >= 0)
	         {
	             swap(arr ,i ,j);
	             i++;
	             
	         }
	          j++;
	     }
	     
	     return i;
	 }
	 
	 
	 public static void markIndexVisited(int []arr, int size)
	 {
	     int i=0;
	     for(i=0;i<size;i++)
	     {
	         int n = Math.abs(arr[i]);
	         //making visited by changing its sign
	         if(n-1 < size && n>0 && arr[n-1] > 0)
	             arr[n-1] = -1*arr[n-1];
	     }
	      
	     
	 }
	 
	 public static int firstMissingPositive(int [] A, int n1) {
	    
	    int size = arrangePositive(A , n1);
	    int i=0;
	    
	    if(A[0]< 0)
	       return 1;
	       
	    //if(n1 == 1 )   
	   
	    
	     markIndexVisited(A , size);
	   /*  for(i=0;i< size ;i++)
	     {
	         printf("%d ",A[i]);
	     }
	     */
	     for(i=0;i< size ;i++)
	     {
	         if(A[i] > 0)
	            return i+1;
	     }
	    
	    return i+1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = { 2, 3, -7, 6, 8, 1, -10, 15 };
		
		int missing = firstMissingPositive(arr, arr.length);
		System.out.println(missing);

	}

}
