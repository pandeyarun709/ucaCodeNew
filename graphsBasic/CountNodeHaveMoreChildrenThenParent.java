package graphsBasic;

import java.util.*;

  class GraphCount{
    
    LinkedList<Integer> adj [] ;
    int V;
    
    
    public GraphCount(int V)
    {
        this.V = V;
        adj = new LinkedList[V+1];
        
        for(int i=1; i<= V;i++)
             adj[i] = new LinkedList<>();
        
    }
    
    public void add(int u , int v)
    {
        adj[u].add(v);
    }
    
    public void countHappy()
    {
        
        boolean visited[] = new boolean[V+1];
        int count =0;
        for(int i=1;i<=V;i++)
        {
            
            if(!visited[i])
            {
                visited[i] = true;
               count += dfs(i ,visited, -1,0); 
                
            }
            
        }
        System.out.print(count);
        
    }
    
    
    private int dfs(int v , boolean visited[] , int p,int count)
    {
        
        if(p != -1 && adj[p].size() <= adj[v].size())
        {
            count++;
        }
        
        for(int w :adj[v])
        {
            if(!visited[w])
            {
                visited[w] = true;
                 count = dfs(w , visited , v ,count);
            }
        }
        return count;
    }
    
}

public class CountNodeHaveMoreChildrenThenParent {
	
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int edge = sc.nextInt();
        
        GraphCount g = new GraphCount(V);
        for(int i=0;i< edge;i++)
        {
            g.add(sc.nextInt() ,sc.nextInt());
        }
          
          g.countHappy();

    }

}











