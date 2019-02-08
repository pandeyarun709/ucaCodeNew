package interviewBit.Practice;

import java.util.*;
public class RomanToInteger {

	    public static int romanToInt(String A) {
	        Map<Character , Integer> map = new HashMap<>();
	        map.put('I' , 1);
	        map.put('V' , 5);
	        map.put('X' , 10);
	        map.put('L' , 50);
	        map.put('C' , 100);
	        map.put('D' , 500);
	        map.put('M' , 1000);
	        
	        char c = A.charAt(A.length()-1);
	        char prev = ' ';
	        
	        int sum =0;
	       
	        int np =0,n =0;
	        for(int i = A.length() -1;i>=0;i--)
	        {
	            c = A.charAt(i);
	            
	            
	            if(prev != ' '){
	                np = map.get(prev) > np ? map.get(prev) :np ; // prev greater
	            }
	               
	             
	             n = map.get(c);  
	               
	             if(n >= np ) //if current greater then max previous then add
	            {
	                    sum += n;
	            } 
	            else {
	            
	                sum -= n;  // subtract upcoming number until upcoming number not greater then prev;
	            }     
	             
	         prev = c;    
	        }
	        
	        return sum;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = romanToInt("MDCCCIV") ;
		System.out.println(sum);
	}

}
