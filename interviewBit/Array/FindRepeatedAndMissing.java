package interviewBit.Array;


public class FindRepeatedAndMissing {

	
	private static void findRepeatAndMiss(int[] arr, int size) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<size;i++)
		{
			int j = Math.abs(arr[i]); // marked visited index 
			
			if( arr[j-1] > 0 )
				arr[j-1] = -1*arr[j-1]; 
			
			//marked index visited by making element -ve at that index
			//if we checking a index that index element already marked -ve then that is repeated number.
			else {
				System.out.println("Repeated number : "+ Math.abs(arr[i-1]));
				break;
			}
		}
		
		//For missing number
		for(int i=0;i<size;i++)
		{
			//There is only one index which +ve so that index no(i+1) is Missing number
			if(arr[i] > 0) {
				System.out.println("Missing Number : " + (i+1));
				break;
			}
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size =7 ;
		int [] arr = { 7, 3, 4, 5, 5, 6, 2 };
		
		findRepeatAndMiss(arr ,size);
		

	}

	

}
