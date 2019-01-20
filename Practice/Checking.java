package Practice;

import java.util.*;

public class Checking {
	
	public static void check(ArrayList<Integer> a , int [] x) {
		a.add(1);
		x[0] = 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		int [] r = new int[2];
		
		check(a , r);
		
		System.out.println(a.get(0));
		System.out.println(r[0]);
		
	}

}
