package treePractice;

class Tree {
	int data;
	Tree left;
	Tree right;
	public Tree(int data) {
		this.data= data;
		left= null;
		right =null;
				
	}
}


public class SumTree {
	
	int sumTree(Tree root )
    {
        if(root == null)
        {
            return 0;
        }
        
        int temp = root.data;
        
         int sum =  sumTree(root.left) +sumTree(root.right);
         
         root.data = sum;
         
         return temp+sum;
        
        
    }
    public void toSumTree(Tree root){
         //add code here.
         root.data = sumTree(root);
    }

}


/*

Given a Binary Tree where each node has positive and negative values. Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.

For example, the following tree

             10
          /      \
        -2        6
       /   \     /  \
     8     -4   7    5

should be changed to

       20(4-2+12+6)
          /       \
     4(8-4)      12(7+5)
       /   \        /  \
     0      0       0    0
*/