package linkedList;

import java.util.*;

public class Merge_K_SortedLinkedlist {
    Node mergeKList(Node[]a,int N)
    {
        
        PriorityQueue<Node> min = new PriorityQueue<>(new Comparator<Node>(){
              
              public int compare(Node x , Node y){
                  return x.data - y.data;
              } 
        }); 
        
        for(int i =0 ; i< N ;i++)
        {
            min.add(a[i]);
        }
        
        Node head = min.poll();
        min.add(head.next);
        
        Node curr = head;
        while(!min.isEmpty()) {
            
            Node temp = min.poll();
            curr.next = temp;
            curr = temp;
            
            if(temp.next != null){
                min.add(temp.next);
            }
        }
        
       return head;
        
   
    }
    
    /******************************************/
    
   private  class Node{
    	private int data;
    	private Node next;
    	
    	public Node(int d)
    	{
    		this.data = d;
    		next = null;
    	}
    }

}
