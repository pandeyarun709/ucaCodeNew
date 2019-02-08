package dynamicProgramming;

import java.util.Scanner;

public class ValidPossibleBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter no. of nodes : " );
		int node = sc.nextInt();
		
		int []T = new int[node+1];
		
		T[0] =1;
		T[1] =1;
		T[2] =2;
		
		for(int i = 3;i<=node;i++)
		{
			for(int j=0;j<i;j++)
			{
				T[i] += T[j] * T[node-1-j];
			}
		}
		
		System.out.println("No. of valid BST Available : "+ T[node]);

	}

}
