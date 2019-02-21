package com.uca.ds.Tree.avl;

public class AVL {    
		    
		    public Node insertToAVL(Node node,int data)
		    {
		         //add code here.
		         if(node == null)
		           return new Node(data);
		           
		         if(node.data < data )
		           node.left = insertToAVL(node.left , data);
		           
		         else if(node.data > data)
		              node.right = insertToAVL(node.right, data);
		         
		         else return node; //if node already in tree
		         
		         //calculate height 
		         node.height = 1 + Math.max(getHeight(node.left) , getHeight(node.right)); 
		         
		         int bal = getHeight(node.left) - getHeight(node.right); 
		         
		         
		         /// ##################dataAVL balancing ################################
		         
		         if(bal > 1 && data < node.left.data) // new node added to left side (Left Left Case) --> right rotate
		         {
		             return rightRotate(node);
		         }
		         
		         if(bal > 1 && data > node.left.data) //// new node added to right side of child  (Left right Case) --> right rotate
		         {
		             node.left = leftRotate(node.left);
		             
		             return rightRotate(node);
		         }
		         
		         //------------- we height of right sub tree more -------------------
		         
		        if(bal < -1 && data > node.right.data) // new node added to right side (right right Case) --> left rotate
		         {
		             return leftRotate(node);
		         }
		         
		         if(bal < -1 && data < node.right.data) //// new node added to left side of child  (right left Case) --> right rotate
		         {
		             node.left = rightRotate(node.left);
		             
		             return leftRotate(node);
		         }
		         
		        return node; 
		    }
		    
			// RIght rotate------------------------------------------------
			   private Node rightRotate(Node node)
			   {
			       Node root = node.left;
			       Node temp = root.right;
			       
			       root.right = node;
			       node.left = temp; 
			       
			       return root;
			    
			   }
			   
			   // Left Rotate --------------------------------------
			   private Node leftRotate(Node node)
			   {
			        Node root = node.right;
			       Node temp = node.right.left; // node right left(right going to be root node)
			       
			       root.left = node;
			       node.right = temp; 
			       
			       return root;
			   }


			    public int getHeight(Node n)
			    {
			        return n.height;
			    }
		
	
	
	
/*######### Node class ####################*/	
	private class Node{
		private int data;
		private Node left;
		private Node right;
		private int height;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
			height = 0;
		}
	}
}
