package interviewBit.Array;
import java.util.*;
public class MonkeyLand {
	 static int find(int []mon ,int x)
	    {
	        if(mon[x] == x)
	           return x;
	           
	         return find(mon , mon[x]);  
	    }
	    
	    static void union(int []mon , int x , int y)
	    {
	    
	        int x1 = find(mon , x);
	        int y1 = find(mon , y);
	        
	        if( x1 != y1)
	        {
	            mon[y1] = x1;
	        }
	    
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int t = sc.nextInt();
	  
	    
	        while(t-- > 0)
	        {
	            int n = sc.nextInt(); 
	            int m = sc.nextInt();
	            
	            int []mon = new int[n+1];
	            long []ban = new long[n+1];
	            
	            for(int i=1;i<=n;i++)
	            {
	                mon[i] = i;
	            }
	            
	            
	            for(int i=1;i<=n;i++)
	            {
	                
	                union(mon , sc.nextInt() ,sc.nextInt());
	                
	             }
	             
	             for(int i=1;i<=n;i++)
	                ban[i] = sc.nextInt();
	                
	            
	                for(int i=1;i<=n;i++)
	                  System.out.print(mon[i] + " ");
	             
	        }
	            

	    }

}








/*

 T= 1
n =4  
m =3
relation team
1 2
2 3
3 1
monkey 1 2 3 4
     
banana 1 2 3 5
collected
ans =6  max( team(1,2,3) 1 + 2 + 3 = 6   & team(4) = 5)
 
 */


