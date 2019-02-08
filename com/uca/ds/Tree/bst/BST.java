package com.uca.ds.Tree.bst;

import java.util.*;

public class BST<K extends Comparable  , V> {
	
	private Node head;
	
	
	public void add(K k ,V val)
	{
		head = createBst(head ,k, val);
	}
	
	private Node createBst(Node root , K key ,V val)
	{
		if(root == null)
		{
			return new Node(key ,val);
		}
		
		int cmp  =  key.compareTo(root.key);
		
		if(cmp < 0)
			root.left = createBst(root.left , key ,val);
		else if(cmp > 0)
			 root.right = createBst(root.right , key , val);
		
		return root;
	}

/***************** Inorder Traversal **********************************/
	
	public void inorder()
	{
		Stack<Node> stk = new Stack<>();
		ArrayList<K> in = new ArrayList<>();
		Node cur = head;
		
		while(cur != null || !stk.isEmpty() )
		{
			while(cur != null)
			{
				stk.push(cur);
				cur = cur.left;
			}
			
			
			Node t = stk.pop();
			in.add( (K)t.key); // casting (K)
			
			cur = t.right;
		}
		
		for(K i : in)
		{
			System.out.print(i + " ");
		}
		
	}
	
	
	
	
/******************* Node class ****************************************/	
	private class Node<K,V>{
	
		K key;
		V val;
		Node left;
		Node right;
		public Node(K key , V val)
		{
			this.key = key;
			this.val = val;
			left = null;
			right = null;
		}
	}

}
