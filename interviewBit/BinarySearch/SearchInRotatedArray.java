package interviewBit.BinarySearch;

public class SearchInRotatedArray {

	private static int findPivot(int[] arr , int l , int r) {
	 
		while(l<r) {	
			int mid = (l + r)/2;
			
			if( mid+1 < arr.length && arr[mid+1] < arr[mid] )
				 return mid;
			if((mid-1) > 0 && arr[mid-1] > arr[mid])
				 return mid -1;
			if(arr[mid] >= arr[0])
			{
			   l = mid+1;	
			}
			else {
				r = mid -1;
				
			}
		}
	    return l;
  }
  
	private static int binarySearch(int [] a, int l , int r,int k){
        
	        while(l<=r) {    
	          
	          int mid = (l + r)/2;
	          //System.out.println(a.get(mid));
	           if(a[mid] == k)
	               return mid;
	          
	           if(a[mid] < k)
	           {
	              l = mid+1;    
	           }
	           else {
	               r = mid -1;
	           }
	       }
	       
	       return -1;
	}
	
	public static int search(int []arr , int k) {
		
	     int pivot =  findPivot(arr , 0 , arr.length-1);
	        if(arr[pivot] == k)
	            return pivot;
	        
	        if(k < arr[0])
	          return binarySearch(arr , pivot+1 ,arr.length-1,k);
	        
	        else   return binarySearch(arr , 0 ,pivot-1,k);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
		
		int k = 202;
		System.out.println(k+" at index : "+search(arr, k));
		
		

	}

}
/*
101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100
*/