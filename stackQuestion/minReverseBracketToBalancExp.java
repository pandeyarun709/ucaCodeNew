package stackQuestion;

import java.util.*;

public class minReverseBracketToBalancExp {

    public static int countReverse(String s)
    {
        if( s.length()%2 != 0)
             return -1;
             
             
       Stack<Character> stk = new Stack<>(); 
       int count =0;
       for(int i=0;i<s.length() ;i++)
       {
           if(s.charAt(i) == '{')
               stk.push('{');
            
            else if(s.charAt(i) == '}' && !stk.isEmpty() && stk.peek() =='{')
                 stk.pop();
             
            else stk.push('}');      
               
       }
     //  System.out.println("check1 "+stk.size() + " "+count );
     int si = stk.size();
       while(!stk.isEmpty() && stk.peek()=='{'){
           stk.pop();
           count++;
       }
       // System.out.println("check2 "+stk.size() + " "+count );
        return (si/2) + count%2;
    }
    
    
	public static void main (String[] args) {
		//code
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
    		String str = sc.next();
    		
    		int res = countReverse(str);
    		
    		System.out.println(res);
		    
		}
	
		sc.close();
		
		
		
		
    }
}


// }}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}  in end ( 11 = } ) and (1 = { ) 
/*
   m+n = 11+1 =12
   12/2 + 1%2
    because 6 bracket { pair and one { left it make  with (n%2) in this case 1
    6+1 = 7 answer
 */
