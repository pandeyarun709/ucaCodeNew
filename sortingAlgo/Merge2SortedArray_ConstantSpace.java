package sortingAlgo;

public class Merge2SortedArray_ConstantSpace {
    
    private static void merge(int []a1 ,int []a2 ,int s1  , int s2) {
        
        int i=0, j=0;
       for(i = s2-1 ; i>= 0;i--)
       {
           int last = a1[s1-1];
           
           for(j = s1-2 ; j>=0 && a1[j] > a2[i] ;j--)
                  a1[j+1] =a1[j];
                  
            if( j != s1-2 || last > a2[i])
            {
                a1[j+1] = a2[i];
                a2[i] = last;
                
            }
       }
    }
    
    private static void print(int []a1 , int []a2)
    {
        for(int i=0;i<a1.length;i++)
        {
           System.out.print(a1[i] + " "); 
        }
        
        for(int i=0;i< a2.length;i++)
         System.out.print(a2[i] + " ");
    }
    
	public static void main (String[] args) {
		//code

		    int s1 =6;
		    int s2 = 4;
		    
		    int []a1 = {1, 5, 9, 10, 15, 20};
		    int []a2 = {2, 3, 8, 13};
		    
		    
		    
		    merge(a1 , a2 , s1 , s2);
		    
		    print(a1 , a2);
		    
		    
	
		
		
	}
}
/*
 * 
--------------------------------- more efficient solution ---------------

private static int next(int g)
{
      if(g <= 1)
         return 0;
    return (g/2) + (g%2); // ceil value
}

private static void merge(int []a1 ,int []a2 ,int s1  , int s2) {
    int gap=0;
    int S = s1+s2;
    for(gap = next(S) ; gap > 0 ;gap = next(gap))
    {
        int i,j;
        for(i= 0 ; i+gap < s1 ; i++)
        {
            if(a1[i] > a1[i+gap])
            {
                int t = a1[i];
                a1[i] = a1[i+gap];
                a1[i+gap] = t;
            }
        }
        
        for(j = gap>s1 ? gap-s1 :0 ;i<s1 && j <s2;j++ ,i++ )
        {
              if(a1[i] > a2[j])
              {
                int t = a1[i];
                a1[i] = a2[j];
                a2[j] = t;   
              }
        }
        
        if(j < s2)
        {
            for( j=0; j+gap < s2 ; j++)
            {
                if(a2[j] > a2[j+gap])
                {
                    int t = a2[j];
                    a2[j] = a2[j+gap];
                    a2[j+gap] = t;
                }
            }
        }
        
    }
    
}


	
}*/