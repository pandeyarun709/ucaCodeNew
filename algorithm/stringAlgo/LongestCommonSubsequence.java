package algorithm.stringAlgo;

import java.util.*;

public class LongestCommonSubsequence {
	
	public static int longestSubSeq(String s1, String s2){
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		
		int D[][] = new int[n2+1][n1+1];
 	   // initialise first row at 0
 		for(int i=0 ;i<=n1;i++)
 		     D[0][i] =0;
         // initialise first Column at 0
      	for(int i=0 ;i<=n2;i++)
 		     D[i][0] =0;    
 		
 		int i=1,j=1;
 		for( i=1;i<=n2;i++){
 		    for( j = 1 ;j<=n1;j++)
 		    {
 		        if(s1.charAt(j-1) == s2.charAt(i-1))
 		        {
 		            D[i][j] = D[i-1][j-1] + 1;
 		        }else{
 		            D[i][j] = Math.max(D[i][j-1] , D[i-1][j]);
 		        }
 		    }
 		  
 		}
 		
 		return D[n1][n2];
 			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0)
		{
		
     		String s1=sc.next();// string 1 
    		String s2 = sc.next();// string 1 

    		int ans = longestSubSeq(s1, s2);
    		System.out.println(ans);
	    }
	}		
}






