package treePractice;

import java.util.*;
public class Check_IsBST {

	  private  int minValue(Node root){
	       if(root.left == null)
	            return root.data;
	        return minValue(root.left);
	   }

	 private static int maxValue(Node root){
	       if(root.right == null)
	            return root.data;
	        return maxValue(root.right);
	   }
	 


	  private boolean check(Node root , int min ,int max,Set<Integer> set){
	     if(root == null)
	          return true;
	     
	      if(set.contains(root.data))
	            return false;
	      
	     if(root.data >= min && root.data <=max)
	     {
	        set.add(root.data);
	         return (check(root.left , min , root.data,set) && check(root.right , root.data , max,set));
	     }
	     return false;
	 }
	 
	   


	    boolean checkBST(Node root) {
	        Set<Integer> set = new HashSet<>();
	        if(root == null)
	             return false;
	        int  min = minValue(root);
	        int max = maxValue(root);
	        
	        return check(root, min , max,set);
	        
	        
	    }

}
