package interviewBit.BinarySearch;

import java.util.ArrayList;


/*
 
[1,3,5,6], 5 => 2
[1,3,5,6], 2 => 1
[1,3,5,6], 7 => 4
[1,3,5,6], 0 => 0
[1,2,3,3,3,4,4,4,4,4,5,6] , 4 => 5
 
 
 */
public class InsertionPositionInSortedArray {

	private static int upperBound(ArrayList<Integer> a , int l , int r , int k)
    {
        while(l < r)
        {
            int mid  = (l+r)/2;
            
            if(a.get(mid) == k)
                return mid;
            if(a.get(mid) <= k)
               l =mid+1;
              else r=mid; 
        }
        return l;
    }
    public int searchInsert(ArrayList<Integer> a, int b) {
        int f = upperBound(a , 0 , a.size() ,  b);
        while(f < a.size() && f >= 1 && a.get(f-1) == b)
           f--;
        return f;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
