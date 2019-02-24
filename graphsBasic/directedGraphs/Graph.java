package graphsBasic.directedGraphs;
import java.util.*;

public class Graph {
	private int V;
	private int E;
	private LinkedList<Integer> []adj;
	
	public Graph(int V)
	{
		this.V = V;
		E=0;
		adj = new LinkedList[V+1];
		for(int i=0;i<V;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v) {
		
		//if(u!=v)
			adj[u].add(v);
		
		 //adj[v].add(u);
	}
	
	public int E() {
		return E;
	}
	
	public int V() {
		return V;
	}
	public LinkedList<Integer> adj(int i) {
		return adj[i];
	}
	

}
