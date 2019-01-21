package graphsBasic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


class Edge implements Comparable<Edge> {
    
    private int wt;
    private int src;
    private int des;
        
    public Edge(int wt , int src , int des)
    {
        this.wt = wt;
        this.src = src;
        this.des = des;
    }
        
    public int compareTo(Edge obj)
    {
        return this.wt - obj.wt;
    }
   
    public int des() {
    	return des;
    }
    
    public int src() {
    	return src;
    }
    
    public int wt() {
    	return wt;
    }
    public void print() {
    	System.out.println(src + " "+ des+" "+wt);
    }
}
    

public class CommutableCity {
	
	public static int find(int []parent,int x) {
		
		if(parent[x] == -1)
			 return x;
		 
		return  find(parent , parent[x]);
		
	}
	
	
	public static boolean union(int []parent,int x , int y) {
	   
		//int A =parent.length;
		
		
		int xset = find(parent ,x );
		int yset = find(parent , y);
		if(xset != yset) {
			parent[xset] = yset;
			//System.out.println("check"+xset+" "+yset +" p "+ parent[xset]);
			return true;
		}
		
		return false;
		
	}
	

    public static void  main(String []args) {
        
        //Graph g = new Graph(A);
    	int []parent = new int[5];
    	for(int i=0;i<parent.length;i++)
		{
			parent[i] = -1;
		}
    	
    	
    	
    	int [][] B = {{1,2,1},{2,3,2},{3,4,4},{1,4,3}};
        ArrayList<Edge> edg = new ArrayList<>();
        for(int i=0;i < B.length;i++ )
        {
            int s = B[i][0];
            int d = B[i][1];
            int wt = B[i][2];
            edg.add(new Edge(wt,s,d));
        }
       Collections.sort( edg);
        int sum =0;
        for(Edge e : edg){
        	
            if(union(parent, e.src() , e.des())) {
            	//e.print();
            	sum = sum + e.wt();
            }
        }
        
        System.out.println(sum);
        
    }
}

//**********test case ans 6
