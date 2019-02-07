package interviewBit.QueueAndStack;

import java.util.*;
public class MaxSlidingWindow {

	public static ArrayList<Integer> maxSlidingWindow(int []a , int k)
	{
		ArrayList<Integer> l = new ArrayList<>();
		Deque<Integer> d= new LinkedList<>();
		int i=0;
		
		for(i=0;i<k;i++)
		{
			while(!d.isEmpty() && a[i] >=a[d.peekLast()])
				 d.removeLast();
			
			d.addLast(i);
		}
		
		for( ;i < a.length;i++)
		{
			l.add(a[d.peek()]);
			
			while(!d.isEmpty() && d.peek() <= i-k)
				 d.removeFirst();
			
			while(!d.isEmpty() && a[i] >= a[d.peekLast()])
				 d.removeLast();
			
			d.addLast(i);
			 
		}
		l.add(a[d.peek()]);
		
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {12, 1, 78, 90, 57, 89, 56};
		ArrayList<Integer> ans;
        ans = maxSlidingWindow(a,3);
        
        for(int i : ans)
        	System.out.print(i + " ");
	}

}
