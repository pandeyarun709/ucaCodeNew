package interviewBit.Array;

import java.util.*;

public class Rotate2DArray {
	
	public static void rotateRight(int [][]a , int n)
	{
		for(int i = 0; i< n/2 ;i++)
		{
			for(int j=i; j < n -1-i;j++)
			{
				int temp  = a[i][j];
				a[i][j] = a[n-j-1][i];
				a[n-j-1][i] = a[n-i-1][n-j-1];
				a[n-i-1][n-j-1] = a[j][n-i-1];
				a[j][n-i-1]= temp;
			}
		}
	}
	
	public static void rotateLeft(int [][]a , int n) {
		
		for(int i = 0; i< n/2 ;i++)
		{
			for(int j=i; j < n -1-i;j++)
			{
				int temp  = a[i][j];
				a[i][j] = a[j][n-i-1];
				a[j][n-i-1] = a[n-i-1][n-j-1];
				a[n-i-1][n-j-1] = a[n-j-1][i];
			
				a[n-j-1][i]= temp;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][]a = {{1,2,3},{4,5,6},{7,8,9}};		
		 
		  rotateRight(a,3);
		  
		  System.out.println("Right Rotated :  ");
		  for(int [] arr : a)
		  {
			  for(int i : arr)
				  System.out.print(i+ " ");
			 
			  System.out.println();
		  }
		  
		  
		  rotateLeft(a,3);
		  
		  System.out.println("Left Rotated :  ");
		  for(int [] arr : a)
		  {
			  for(int i : arr)
				  System.out.print(i+ " ");
			 
			  System.out.println();
		  }

	}

}
