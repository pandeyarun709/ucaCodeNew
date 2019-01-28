package graphsBasic;

import java.util.*;

 
class TreeNode {
   int val;
    TreeNode left;
    TreeNode right;
	  TreeNode(int x) {
      val = x;
      left=null;
	   right=null;
   }
} 
 
 
public class levelOrder {


    
    private class Level{
        private int lvl;
        private TreeNode root;
        
        public Level(TreeNode r, int i){
            this.root = r;
            this.lvl = i;
        }
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        
        Queue<Level> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        q.add(new Level(A , 0));
        int c=0;
        int s = -1;
         
        while(!q.isEmpty())
        {
              Level temp = q.poll();
               
              if(temp.root.left != null )
                 q.add(new Level(temp.root.left ,temp.lvl +1) );
                 
              if(temp.root.right != null)
                 q.add(new Level(temp.root.right , temp.lvl +1));
              
              
              
              if(temp.lvl <= s ){
                 res.get(temp.lvl).add(temp.root.val); 
              }else {
                  ArrayList<Integer> a = new ArrayList<>();
                  a.add(temp.root.val);
                  
                  res.add(a);
                  s++;
              };
            
        }
        
        return res;
    }
}
