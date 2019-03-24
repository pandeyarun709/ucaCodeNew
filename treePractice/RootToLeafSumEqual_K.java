package treePractice;

import java.util.ArrayList;

public class RootToLeafSumEqual_K {

    public  void getPaths(TreeNode root , int sum , int B , ArrayList<Integer> a,ArrayList<ArrayList<Integer>> res)
    {
        if(root == null)
            return ;
            
         sum = sum + root.val;
        a.add(root.val);
        //System.out.println("check1 " +a);
        if(root.left == null && root.right == null)
        { 
             if(sum == B)
             {
               
                 res.add(new ArrayList<Integer>(a));
                 //System.out.println("add " +a);
               //  a.remove(a.size()-1);
             }
             return;
        }
        
      
        if(root.left != null) {
           getPaths(root.left , sum , B , a ,res);
           //a.remove(a.size()-1);
            // System.out.print( a );
           if(a.size() > 0)
              a.remove(a.size()-1);
              
           // System.out.println(" left " +a);  
        }
        
        if(root.right != null) {
            getPaths(root.right , sum , B , a,res);
             
             //System.out.print( a );
             
            if(a.size() > 0)
               a.remove(a.size()-1);
               
             //  System.out.println(" right " +a); 
        }
        
       // a.remove( a.size()-1);
            
            
            
    }
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        getPaths(A , 0 , B , new ArrayList<Integer>() ,res);
        
        return res;
    }
    
    private class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	
    	public TreeNode(int data)
    	{
    		this.val = data;
    	}
    }
}
