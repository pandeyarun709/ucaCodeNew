package treePractice;

public class DistanceTwoNodeInfiniteTree {
	
	public static int findDist(int n1 , int n2)
	{
		int count=0;
		
		while(n1 != n2)
		{
			count++;
			
			if(n1 > n2)
				n1 = n1/2;
			else n2 = n2/2;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 5 , n2 = 12;
		
		int dis = findDist(n1 , n2);
		System.out.println("Minimum distance b/w in infinite tree : "+dis);

	}

}
