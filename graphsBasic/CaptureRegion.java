package graphsBasic;
import java.util.*;

public class CaptureRegion {

	public void dfs(ArrayList<ArrayList<Character>> a, boolean [][]visited,int i ,int j,int r,int c)
    {
        visited[i][j] = true;
        // System.out.println("check3");
        int [][]dir = {{0,1},{0,-1},{1,0},{-1,0}};
        

        
        a.get(i).set(j ,'K');
        
    
        for(int m = 0;m<4 ; m++)
        {
            int newI = i + dir[m][0];
            int newJ = j+ dir[m][1];
            
            if(newI>=0 && newI <r && newJ >=0 && newJ <c && a.get(newI).get(newJ) == 'O' && visited[newI][newJ] == false){
                 // System.out.println("check2");
                 dfs(a , visited , newI ,newJ ,r ,c);
            }
        }
    }
    
    
    public void solve(ArrayList<ArrayList<Character>> a) {
        
        int r = a.size();
        int c = a.get(0).size();
        boolean visited[][] = new boolean[r][c];
        //call dfs for 'O' at boundary 
        for(int i=0 ;i<c;i++)
        {
            if(a.get(0).get(i) == 'O' && visited[0][i] == false)
              dfs(a,visited,0,i,r,c);
        }
        for(int i=0 ;i<c;i++)
        {
           if(a.get(r-1).get(i) == 'O' && visited[r-1][i] == false)
              dfs(a,visited,r-1,i,r,c); 
        }
        // System.out.println("check4");
        for(int i=0 ;i<r;i++)
        {
            if(a.get(i).get(0) == 'O' && visited[i][0] == false)
             {
                  
                 dfs(a,visited,i,0,r,c);
             }
        }
        for(int i=0 ;i<r;i++)
        {
         if(a.get(i).get(c-1) == 'O' && visited[i][c-1] == false)
              dfs(a,visited,i,c-1,r,c); 
        }
        
        //System.out.println("check1");
       for(int i =0 ;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
 
                if(a.get(i).get(j) == 'O' )
                    a.get(i).set(j , 'X');
                
                if(a.get(i).get(j) == 'K')
                       a.get(i).set(j , 'O');
                       
                       
         
                    
            }
        }
        
    }
}
