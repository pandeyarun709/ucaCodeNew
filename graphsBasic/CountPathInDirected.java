package graphsBasic;


import java.util.*;
class GraphD{
    private LinkedList<Integer> adj [] ;
    private int V;
    private int count;
    public GraphD(int v)
    {
        count = 0;
        this.V = v;
        adj = new LinkedList[V];
        
        for(int i=0;i<V;i++)
             adj[i] = new LinkedList<>();
    }
    
    public void addEdge(int u , int v)
    {
        adj[u].add(v);
    }
    
    public void countPath(int s ,int d)
    {
        boolean []visited = new boolean[V];
     
           countPath(s , visited, d);

        System.out.print(count);
    }
    
    private void countPath(int v , boolean [] visited , int d)
    {
        visited[v] = true;
        if(v == d)
        {
            count++;
            
        }
        
        for(int w : adj[v])
        {
            if(!visited[w])
            {
               countPath(w , visited , d) ;  
            }
        }
        
        visited[v] = false;
        
        
    }
}


public class CountPathInDirected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner in = new Scanner(System.in);
       
        GraphD g = new GraphD(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 
  
        int s = 2, d = 3;
       
         g.countPath(s , d); 

	}

}
