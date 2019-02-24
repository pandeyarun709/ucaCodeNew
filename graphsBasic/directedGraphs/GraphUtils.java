package graphsBasic.directedGraphs;

import java.util.*;

public class GraphUtils {
	
    public static void bfs(int v, Graph g,boolean visited[])
    {
        //Add your code here.
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(v);
        Arrays.fill(visited , false);
        ArrayList<Integer> a = new ArrayList<>();
        visited[v] = true;
        
        while(q.size() != 0)
        {
             a.add(q.poll());
            //System.out.print(v +" ");
            
            for(Integer w : g.adj(v))
            {
                if(!visited[w])
                {   
                	visited[w] = true;
                	System.out.println("W "+w);
                    q.add(w);
                }
            }
        }
        System.out.println(a);
       
    }
    
    public static void main(String [] args)
    {
    	Scanner sc =  new Scanner(System.in);
    	int V = sc.nextInt();
    	
    	Graph g = new Graph(V+1);
    	
    	for(int i =0;i < V;i++)
    	{
    		int u =sc.nextInt();
    		int v = sc.nextInt();
    		g.addEdge(u, v);
    	}
    	
    	 bfs(1,g ,new boolean[V+1]  );
    	
    }
   
}
