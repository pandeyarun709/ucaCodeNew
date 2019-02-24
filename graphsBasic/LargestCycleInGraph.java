/*

Statement :----

You are given a maze with N cells. Each cell may have multiple entry points but not more than one exit (ie. entry/exit points are unidirectional doors like valves).

The cells are named with an integer value from 0 to N-1.

You need to find the the length of the largest cycle in the maze. Return -1 if there are no cycles.

INPUT FORMAT

First line has the number of cells N
Second line has list of N values of the edge[] array. edge[i] contains the cell number that can be reached from of cell ‘i’ in one step. edge[i] is -1 if the ‘i’th cell doesn’t have an exit.
OUTPUT FORMAT

length of the largest cycle.
Sample input:

23

4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21

Sample output

6
*/


/*
 * idx point to val present at that idx
idx  0 1 2 3 4  5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
val  4 4 1 4 13 8 8 8 0 8 14 9  15 11 -1 10 15 22 22 22 22 22 21
 
 0->4->13->11->9->8->0 (cycle)
        
 */


package graphsBasic;

import java.util.*;
public class LargestCycleInGraph {
	
	public static int checkCycle(int []cell , int size , int start) {
		
		Set<Integer> set = new HashSet<>();
		set.add(start);
		
		for(int i = start ;i< size;i++) {
			
			if( !set.contains(cell[i]) && cell[i] != -1) {
				
				set.add( cell[i] );
				
			}
			else return set.size() + 1; //1 for again come to cycle node
		}
		
		return -1;
	}
	
	
	public static int findLargestCycle(int []cell , int size) {
		
		int max = -1;
		for(int i =0;i<size;i++) {
			
			//if you want to find sum of largest cycle return "Set" rather than its size
			// and check for max sum
			int cyc = checkCycle(cell , size , i); 
			
			if( max < cyc)
				 max = cyc;
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 23;

		int []cell = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
		
		int largestCycle = findLargestCycle(cell , size);
		
		System.out.println("Largest cycle Length " +largestCycle);
		
		
	}

}


