package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int []arr,int n) {
		
		boolean flag = false;
		
		for(int i=0;i < n;i++)
		{
			for(int j=1; j < n-i;j++)
			{
				if(arr[j] < arr[j-1])
				{
					flag = true;
					int t =arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
			
			if(!flag) 
				break; // if flag remains false its mean that array get sorted so we don't need further iteration
			
			flag =false;
			System.out.println("checking loops " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,9,2,4,5,6,10};
		int n = 7;
		
		bubbleSort(arr ,n);
		
		System.out.println(Arrays.toString(arr));
	}

}
