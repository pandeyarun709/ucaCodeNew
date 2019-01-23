#include <stdio.h>

int binarySearch(int a[] ,int low,int high ,int key)
{
    while(high >= low)
    {
        int mid = (low+high)/2;
        
        if(a[mid] == key)
             return 1;
        
        if(a[mid] > key )
            high = mid-1;
        else low = mid + 1;    
    }
    
    return 0;
}

int main() {
	//code
	int r,c,n;
	scanf("%d",&n);
	while(n--)
	{
	    	scanf("%d",&r);
	scanf("%d" , &c);
	
	int **mat = (int **)malloc(sizeof(int *) * r);
	
	int i=0,j=0;
	for(i=0;i<r;i++)
	{
	    mat[i] = (int *)malloc(sizeof(int) * c);
	    
	    for(j=0;j<c;j++)
	    {
	        scanf("%d",&mat[i][j]);
	    }
	}
	
	int key ;
	scanf("%d",&key);
	int find = 0;
	for(i=0;i<r;i++)
	{
	   
	    if( mat[i][c-1]>=key)
	       { 
	           
	           find = binarySearch(mat[i] , 0 , c-1,key);
	           break;
	       }
	}
	printf("%d\n",find);
	    
	}

	
	
	return 0;
}