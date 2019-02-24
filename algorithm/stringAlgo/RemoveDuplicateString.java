package algorithm.stringAlgo;

import java.util.Arrays;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String str = "aabbabbxdefgbbeldqimj"; 
	        System.out.println(removeDuplicatesFromString(str));

	}

	public static String removeDuplicatesFromString(String str) {
		// TODO Auto-generated method stub
		
		char [] s = str.toCharArray();
		
		int hash = 0; // 0 bit --- position of "a" , 1 bit -> "b"
		int len=0,i=0;
		
		while(i < s.length) {
			
			int idx = s[i] - 'a';
			
			if( ( hash & (1 << idx)) == 0) {
				
				s[len] = s[i]; // we can also write in this way  s[len]=x +'a'
				
				len++;
				
				hash = hash | (1 << idx); //on the bit at position where character visited
				
				
			}
			i++;
		}
		
		
		 s =Arrays.copyOfRange(s, 0, len);
		 
		 return Arrays.toString(s);
	}

}
