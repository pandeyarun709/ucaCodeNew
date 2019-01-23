package treePractice;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Level{
    int lvl;
    Node n;
    
    public Level(Node r,int l)
    {
        this.n  = r;
        this.lvl = l;
    }
}


public class sumOfLeafNodeMinLvl {
	
    public int minLeafSum(Node root){
        //Your Code Here.
       // ArrayList<Integer> a = new ArrayList<>();
        //a.add(0);
        int sum =0;
        int  checkLevel = -1;
        Queue<Level> q = new LinkedList<>(); 
        
        q.add(new Level(root , 0));
        boolean flag =true;;
        
        while(!q.isEmpty()){
            
            Level temp = q.poll();
            Node node = temp.n;
            int lvl = temp.lvl;
             
            if(temp.n.left == null && temp.n.right == null)
            {  
                //System.out.println(node.data +" "+ lvl);
                if(flag)
                {
                    checkLevel = lvl;
                    flag = false;
                }
                
                if(checkLevel == lvl)
                {
                    sum += node.data;
                }
                else break;
            }
           
            
            
            if(node.left != null)
            {
                q.add(new Level(node.left , lvl+1));
                
            }
            
             if(node.right != null)
            {
                 q.add(new Level(node.right , lvl+1));    
            }
              
            
        }
        
      return sum;
        
    }
}










  
