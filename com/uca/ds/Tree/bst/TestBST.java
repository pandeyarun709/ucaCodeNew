package com.uca.ds.Tree.bst;

public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<Integer , String> bst = new BST<>();
		
		bst.add(5, "Five");
		bst.add(6, "Five");
		bst.add(7, "Five");
		bst.add(4, "Five");
		bst.add(3, "Five");
		bst.add(1, "Five");
		
		bst.inorder();
	}

}
