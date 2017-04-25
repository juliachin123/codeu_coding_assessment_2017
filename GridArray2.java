//Two Dimensional Array Semantics
//Same as GridArray1 with start replaced by grid[i][j]
//Predict the output before running this code

import java.util.*;

public class GridArray2{
	
	public static void main(String[] args){
		int[][] grid1 = new int[3][5];
		printGrid(grid1);

		System.out.println(grid1); // prints [[I@6d06d69c
		System.out.println(Arrays.toString(grid1));
		System.out.println(Arrays.deepToString(grid1));
	}

	public static void printGrid(int[][] grid){
//		int start = 0;
		for (int i = 0; i < grid.length; i++){
		//grid.length = # rows
			for (int j = 0; j < grid[i].length; j++){
			//grid[i].length = # columns
//				grid[i][j] = start + 1;
				grid[i][j] = grid[i][j] + 1;
//				start++;
				grid[i][j]++;
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}