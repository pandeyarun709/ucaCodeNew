package treePractice;
 import com.uca.ds.Tree.bst.*;
public class DeleteNodeInBst extends BST {
	
	private static Node smallest(Node root )
    {
        if(root == null)
           return root;
           
        if(root.left == null)
        {
            return root;
        }
      
        
        return smallest(root.left);
    }
    
    Node deleteNode(Node root, K key) 
    {
	// Your code here
	   if(root == null)
	       return root;
	     
	   if(root.key == key){
	       
		       if(root.left == null && root.right == null){
		            return null;
		       }
		       else if(root.left == null )
		                return root.right;
		       else if(root.right == null)
		                 return root.left;
		       else if( root.left != null && root.right != null){
	        	           Node temp = smallest(root.right);
	        	           root.key = temp.key;
	        	           
	        	           root.right = deleteNode(root.right , temp.key); //delete smallest Node
		           return root;
		        }   
	   }
	   
	   if(root.key > key)
	          root.left = deleteNode(root.left , key);
	          
	    else root.right = deleteNode(root.right , key);
	       
	   return root;
	   
	      
    }

}
