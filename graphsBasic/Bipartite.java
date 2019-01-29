package graphsBasic;

import java.util.*;


class Graph{
     int V;
     LinkedList<Integer> adj [] ;
    
    public Graph(int V){
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
            adj[i] = new LinkedList<>();
    }
    
    public void addEdge(int u , int v){
        adj[u].add(v);
    }

}


public class Bipartite {
	
      public boolean dfs(Graph g,boolean []visited,boolean []color,int v)
      {
          for(int w : g.adj[v])
          {
              if(!visited[w]){
                 visited[w] = true;
                 color[w] = !color[v];
                 
                 if(!dfs(g, visited,color,w))
                      return false;
              }else if(color[v] == color[w])
                      return false;
          } 
          return true;
      }
    
    
    
	  boolean isBipartite(int G[][],int V)
       {
          //add code here.
          Graph g = new Graph(V);
          
          for(int i=0;i<V ;i++)
          {
              for(int j = 0;j<V;j++)
              {
                  if(G[i][j] == 1)
                     g.addEdge(i,j);
              }
          }
          boolean []visited = new boolean[V];
           boolean []col = new boolean[V];
          Arrays.fill(visited , false);
          
          for(int i=0;i<V;i++)
          {
              if(!visited[i]){
                  visited[i] = true;
                  col[i] = true;
                  if(!dfs(g,visited,col,i))
                   return false;
              }
          }   
          return true;
        }
}