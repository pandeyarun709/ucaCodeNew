package algorithm.stringAlgo;

import java.util.ArrayList;

public class ZAlgorithm {
    
	public static void calZArray(int []z , String str) {
		
		int i=0;
		int L=0,R=0;
		
		z[0] =0;
		int n = str.length();
		for(i=1 ; i<n ;i++) 
		{
			 if(i > R)
			 {
				 L=R=i;
				 
				 while(R < n && str.charAt(R) == str.charAt(R-L))
					 R++;
				 z[i] = R-L;
				 R--;
			 } else {
				 
				 int k = i -L;
				 
				 if(z[k] < R-i+1)
				 {
					 z[i] = z[k];
				 }
				 else {
					 L=i;
					 while(R < n && str.charAt(R) == str.charAt(R-L))
						  R++;
					  z[i] = R-L;
					  R--;
					 
				 }
			 }
			
		}
		
	}
	public static void patternSearch(String pat ,String text) {
		
		String str = pat+"$"+text;
		int z[] = new int[str.length()];
		
		ArrayList<Integer> idx = new ArrayList<>();
		calZArray(z , str);
		
		for(int i=pat.length()+1 ; i< str.length() ;i++)
		{
			if( pat.length() == z[i])
			{
				idx.add(i - pat.length()-1);
			}
		}
		
		System.out.println("patter present at : "+ idx);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pat = "aacbbaacbb";
		String text = "aacbaaacbbaacbbaacbbaacbbaacbbaacbbaacaaababaaacbbbaacbb";
		
		patternSearch(pat ,text);

	}

}
