package graphsBasic;

import java.util.ArrayList;

public class BlackShapes {
	
	    
		  public static void dfs(ArrayList<String> A , boolean [][] visited , int i , int j , int r,int c)
		  {
		      visited[i][j] = true;
		      int dir[][] = { {0,1} , {0,-1} , {1,0}, {-1 ,0}  };
		      
		      for(int x = 0 ;x < 4 ;x++)
		      {
		          int newI = i + dir[x][0];
		          int newJ = j + dir[x][1];
		          
		          if(newI >= 0 &&  newI < r && newJ >=0 && newJ < c && visited[newI][newJ] == false && A.get(newI).charAt(newJ) == 'X')
		          {   
		              dfs(A , visited , newI , newJ , r, c);
		          }
		      }
		      
		    
		    
		    
		  }
		    
		    public int black(ArrayList<String> A) {
		        
		        //Graph g = new Graph(A.get(0).length());
		        
		        int r = A.size();
		        int c = A.get(0).length();
		        
		        boolean visited[][] = new boolean[r][c];
		        
		        
		        int count =0;
		        
       for(int i =0; i < r ; i++) 
       {
           for(int j = 0 ; j< c ; j++) 
	        {
		         if(A.get(i).charAt(j) == 'X' && visited[i][j] == false){
		                   // System.out.println("check" + i + j);
	              dfs(A , visited , i , j , r , c);
                  count++;
              }
           }
      }
	        
		    
		        
	     return count;
		        
		        
		        
   }
		

}
