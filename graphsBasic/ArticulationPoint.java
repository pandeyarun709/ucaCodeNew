package graphsBasic;

import java.util.*;

class Graphs
{ 
    private int V;  
    private LinkedList<Integer> adj[]; 
    int time = 0; 
   
  
    Graphs(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  

    void addEdge(int v, int w) 
    { 
        adj[v].add(w);   
        adj[w].add(v);   
    }
    
    private void APUtil(int u , boolean visited[] , int parent[] , int low[] , int disc[] , Set<Integer> ap )
    {
          	int child = 0;
          	time++;
          	low[u] = disc[u] = time ; 
          	
          	for(int v : adj[u] ) {
          		
          		if(!visited[v]) {
          			//System.out.println("check1 " + v);
          			child++;
          			parent[v] = u;
          			visited[v] = true;
          			APUtil(v, visited, parent, low, disc, ap);
          			
          			//low[u] = Math.min(low[u] , low[v]);
          			
          			if(parent[u] == -1 && child > 1 ) {
          				ap.add(u);
          			}
          			
          			if(parent[u] != -1 &&  low[v] >= disc[u]) {
          				ap.add(u);
          			}
          			low[u] = Math.min(low[u] , low[v]);
          			
          		}else if( u != parent[v])
    				  low[u] = Math.min(low[u], disc[v]);
          		
          		
          	}
    }
    
    public void articulation() {
    	
    	int parent[] = new int[V];
    	int []low = new int[V];
    	int []disc = new int[V];
    	boolean []visited = new boolean[V];
    	 Set<Integer> ap = new HashSet<>();
    	Arrays.fill(parent, -1);
    	
    
    	for(int i=0; i< V ;i++) {
    		
    		if(!visited[i])
    		{ //  parent[i] = i;
    		    visited[i] =true;
    			APUtil(i, visited, parent, low, disc, ap);
    		}
    	}
    	
    	
    		
    		System.out.println(ap);
    	 //System.out.println("No articulation point exist ");
    		
    }
}    

public class ArticulationPoint {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Articulation points in first graph "); 
	        Graphs g1 = new Graphs(5); 
	        g1.addEdge(1, 0); 
	        g1.addEdge(0, 2); 
	        g1.addEdge(2, 1); 
	        g1.addEdge(0, 3); 
	        g1.addEdge(3, 4); 
	        g1.articulation(); 
	        System.out.println(); 
	  
	        System.out.println("Articulation points in Second graph"); 
	        Graphs g2 = new Graphs(4); 
	        g2.addEdge(0, 1); 
	        g2.addEdge(1, 2); 
	        g2.addEdge(2, 3); 
	        g2.articulation(); 
	        System.out.println(); 
	  
	        System.out.println("Articulation points in Third graph "); 
	        Graphs g3 = new Graphs(7); 
	        g3.addEdge(0, 1); 
	        g3.addEdge(1, 2); 
	        g3.addEdge(2, 0); 
	        g3.addEdge(1, 3); 
	        g3.addEdge(1, 4); 
	        g3.addEdge(1, 6); 
	        g3.addEdge(3, 5); 
	        g3.addEdge(4, 5); 
	        g3.articulation();

	}

}
