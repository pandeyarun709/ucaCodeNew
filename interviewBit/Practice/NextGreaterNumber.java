package interviewBit.Practice;

import java.util.*;

public class NextGreaterNumber {

	public static void  swap(int []num , int i , int j){
        int t = num[i];
        num[i] = num[j];
        num[j] = t; 
    }
    
	// find minimum int right side of i and less then num[i]
    public static int findMin(int []num , int i , int n,int k)
    {
        int min = 99999999;
        int idx=n-1;
       // System.out.println(num[i] +" n= "+ n+ " i= "+i);
        for(int j=n-1 ; j>i;j--)
        {
           // System.out.println(j+" "+ num[j]);
            if(min > num[j] && num[j] >= k)
             {
                 min =num[j];
                 idx=j;
             }
        }
        return idx;
    }
    public static void printNextHigherNumber(int []num,int n)
    {
         int i=0,min= -1;
         //find num which smaller than prev while traversing from back
        for(i=n-2;i>=0 ; i--)
        {
            if(num[i] < num[i+1])
                break;
            
             
        }
        
        
        if(i < 0)
          return;
         
          min = findMin(num , i , n , num[i]);
        
        swap(num , i ,min );
        
        Arrays.sort(num , i+1 , n);
        
        for(int k : num)
        {
            System.out.print(k + " ");
        }
    }
    
	public static void main (String[] args) {
		//code
		
		int t = 1;
		while(t-- > 0)
		{
		    int n =11;
		    int num[] = {51, 7, 2, 94, 49, 30, 24, 85, 55, 57 ,41 };
		  
		      
		    printNextHigherNumber(num,n);
		    System.out.println();
		}
	}
}
