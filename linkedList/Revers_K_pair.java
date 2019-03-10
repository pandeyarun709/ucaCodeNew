package linkedList;

public class Revers_K_pair {
	
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev = null;
        Node cur = node;
        Node next = null;
        
        int i=0;
        while(i < k && cur != null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            i++;
        }
        
        if(cur != null)
        {
            node.next = reverse(cur, k);
        }
        
        return prev;
    }
    
    private class Node {
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data =data;
    		next = null;
    	}
    }

}
