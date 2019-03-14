package interviewBit.BinarySearch;

import java.util.Scanner;




/*
  find  num 
        rev = reverse(num)
        
        ans => num^rev
 */
public class PowerA_to_B {
	
static int mod = 1000000007; 
    
    public static long reverse(long n) {
        long rev = 0;
        
        while( n > 0)
        {
            rev = (rev * 10) + (n%10);
            n /= 10;
            
        }
        return rev;
    }
    
    public static long pow(long base ,long n)
    {
        if(n == 1)
        {
            return base % mod;
        }
        long res =1;
        while(n > 0)
        {
            if(n  %2 != 0)
            {
               res =  (res * base) % mod;
               n--;
            } else {
                base = (base * base) % mod; 
                n /= 2;
            }
            
        }
         return res % mod;
    }

    
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt() ;
		 
		 while(t-- > 0)
		 {
		     long base = sc.nextLong();
		     
		     long rev = reverse(base);
		     //System.out.println("Reverse : " + rev);
		     System.out.println( pow(base ,rev) );
		     
		 }
		
	
	}

}
