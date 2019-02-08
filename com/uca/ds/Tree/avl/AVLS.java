package com.uca.ds.Tree.avl;

public class AVLS {

	private class Node
	{
		private int data;
		private Node left;
		private Node right;
		private int height;
		
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
			this.height = 1;
		}
	}
	private static Node root = null;
	
	private int calculateHeight(Node n)
	{
		if (n == null)
			return 0;
		return 1 + Math.max(calculateHeight(n.left), calculateHeight(n.right));
	}
	
	private Node leftRotate(Node root)
	{
		Node y = root.right;
		Node temp = y.left;
		y.left = root;
		y = temp;
		
		root.height = calculateHeight(root);
		y.height = calculateHeight(y);
		
		return y;
	}
	private Node rightRotate(Node root)
	{
		Node y = root.left;
		Node temp = y.right;
		y.right = root;
		y = temp;
		
		root.height = calculateHeight(root);
		y.height = calculateHeight(y);

		
		return y;
	}
	public void Insert(int data)
	{
		root = Insert(root , data);
	}
	
	private Node Insert(Node root, int data)
	{
		System.out.println(data);
		if(root == null)
			return new Node(data);
		else if(data > root.data)
			root.right = Insert(root.right, data);
		else 
			root.left = Insert(root.left, data);
		
		int balance = calculateHeight(root.left) - calculateHeight(root.right);
		
		if(balance > 1)
		{
			int bal2 = calculateHeight(root.left.left) - calculateHeight(root.left.right);
			if(bal2 >= 1)
				return rightRotate(root);
			else
			{
				root.left = leftRotate(root.left);
				return rightRotate(root);
			}
		}
		if(balance < -1)
		{
			int bal2 = calculateHeight(root.right.left) - calculateHeight(root.right.right);
			if(bal2 <= -1)
				return leftRotate(root);
			else
			{
				root.right = rightRotate(root.right);
				return leftRotate(root);
			}
		}
		else
		{
			root.height = 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
		}
		return root;
	}
	
	public void preorder(Node root)
	{
		if(root != null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void main(String[] args)
	{
		AVLS obj = new AVLS();
		obj.Insert(1);
		obj.Insert(2);
		obj.Insert(3);
		obj.Insert(4);
		obj.Insert(5);
		obj.preorder(root);
	}
}